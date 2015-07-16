package com.v4java.lal.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.v4java.lal.common.FlowConst;
import com.v4java.lal.dao.ApproveLogDao;
import com.v4java.lal.dao.FlowNodeDao;
import com.v4java.lal.dao.WorkFlowDao;
import com.v4java.lal.pojo.ApproveLog;
import com.v4java.lal.pojo.FlowNode;
import com.v4java.lal.pojo.WorkFlow;
import com.v4java.lal.service.IWorkFlowService;
import com.v4java.lal.tools.TestJson;
import com.v4java.lal.view.admin.UserVO;
import com.v4java.lal.view.admin.WorkFlowVO;

@Service("workFlowService")
public class WorkFlowServiceImpl implements IWorkFlowService{

	@Autowired
	private WorkFlowDao workFlowDao;
	@Autowired
	private FlowNodeDao  flowNodeDao;
	@Autowired
	private ApproveLogDao approveLogDao; 
	
	@Override
	public WorkFlow findWorkFlowById(Integer id) throws Exception {
		return workFlowDao.findWorkFlowById(id);
	}

	@Override
	public void insertWorkFlow(WorkFlow workFlow) throws Exception {
		FlowNode firstNode = flowNodeDao.findFirstFlowNodeById(workFlow.getModelId());
		workFlow.setJobsId(firstNode.getJobsId());
		workFlow.setWorkflowNode(firstNode.getId());
		workFlow.setStatus(0);
		workFlowDao.insertWorkFlow(workFlow);
	}

	@Override
	public List<WorkFlowVO> findUserWorkFlowVOByUserCode(String userCode)throws Exception {
		return workFlowDao.findUserWorkFlowVOByUserCode(userCode);
	}

	@Override
	public int findUserWorkFlowVOCountByUserCode(String userCode)throws Exception {
		return workFlowDao.findUserWorkFlowVOCountByUserCode(userCode);
	}

	@Override
	@Transactional
	public int doWorkFlow(Integer workFlowId, UserVO userVO,ApproveLog approveLog) throws Exception {
		WorkFlow workFlow = workFlowDao.findWorkFlowById(workFlowId);
		List<FlowNode> flowNodes = flowNodeDao.findFlowNodeByModelId(workFlow.getModelId()); 
		FlowNode nowFlowNode = null;
		//得到待审批的节点
		for (FlowNode flowNodetmp : flowNodes) {
			if (flowNodetmp.getId()==workFlow.getWorkflowNode()) {
				nowFlowNode = flowNodetmp;
				break;
			}
		}
		if (!userVO.getJobsIds().contains(nowFlowNode.getJobsId())) {
			System.err.println("没有该权限");
			return -1;
		}
		//拒绝
		if (approveLog.getStatus() == FlowConst.AGREE_FALSE) {
			//标记工作流为开始状态
			FlowNode firstFlowNode = flowNodes.get(FlowConst.node_type_start);
			workFlow.setJobsId(firstFlowNode.getJobsId());
			workFlow.setStatus(FlowConst.START);
			workFlow.setWorkflowNode(firstFlowNode.getId());
			
		}else if (approveLog.getStatus() == FlowConst.AGREE_TRUE) {
			FlowNode nextFlowNode = null;
			int nextNodeSort = nowFlowNode.getNextSort();
			//寻找下一个节点
			for (FlowNode flowNodetmp : flowNodes) {
				if (flowNodetmp.getSort()==nextNodeSort) {
					nextFlowNode = flowNodetmp;
					break;
				}
			}
			switch (nextFlowNode.getNodeType()) {
			case FlowConst.node_type_start:
				//系统错误
				break;
			case FlowConst.NODE_TYPE_TASK:
				workFlow.setJobsId(nextFlowNode.getJobsId());
				workFlow.setWorkflowNode(nextFlowNode.getId());
				workFlow.setStatus(FlowConst.ING);
				break;
			case FlowConst.NODE_TYPE_IF:
				List<TestJson> testJsons = JSON.parseArray(nextFlowNode.getFlowTest(),TestJson.class);
				BigDecimal money = workFlow.getMoney();
				int sort = 0;
				for (TestJson testJson : testJsons) {
					Double[] test = testJson.getTest();
					if (money.compareTo(new BigDecimal(test[0]))==-1&&money.compareTo(new BigDecimal(test[1]))==1) {
						sort = testJson.getTarget();
						break;
					}
				}
				workFlow.setStatus(FlowConst.ING);
				nextFlowNode = findWorkFlowBySort(flowNodes, sort);
				workFlow.setJobsId(nextFlowNode.getJobsId());
				workFlow.setWorkflowNode(nextFlowNode.getId());
				workFlow.setStatus(FlowConst.ING);
				break;		
			case FlowConst.NODE_TYPE_END:
				workFlow.setJobsId(0);
				workFlow.setWorkflowNode(0);
				workFlow.setStatus(FlowConst.END);
				break;		
			default:
				break;
			}
		}
		int n=workFlowDao.updateWorkFlow(workFlow);
		approveLog.setUserCode(userVO.getUserCode());
		approveLog.setUserName(userVO.getUserName());
		approveLog.setFlowNode(nowFlowNode.getId());
		approveLog.setWorkFlowId(workFlowId);
		approveLogDao.insertApproveLog(approveLog);
		return n;
	}
	
	private FlowNode findWorkFlowBySort(List<FlowNode> flowNodes,int sort){
		for (FlowNode flowNode : flowNodes) {
			if (flowNode.getSort()==sort) {
				return flowNode;
			}
		}
		return null;
		
	}
	
}
