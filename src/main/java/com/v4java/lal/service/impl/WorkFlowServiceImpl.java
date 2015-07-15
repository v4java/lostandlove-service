package com.v4java.lal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v4java.lal.common.FlowConst;
import com.v4java.lal.dao.FlowNodeDao;
import com.v4java.lal.dao.WorkFlowDao;
import com.v4java.lal.pojo.FlowNode;
import com.v4java.lal.pojo.WorkFlow;
import com.v4java.lal.service.IWorkFlowService;
import com.v4java.lal.view.admin.WorkFlowVO;

@Service("workFlowService")
public class WorkFlowServiceImpl implements IWorkFlowService{

	@Autowired
	private WorkFlowDao workFlowDao;
	@Autowired
	private FlowNodeDao  flowNodeDao;
	
	@Override
	public WorkFlow findWorkFlowById(Integer id) throws Exception {
		return workFlowDao.findWorkFlowById(id);
	}

	@Override
	public void insertWorkFlow(WorkFlow workFlow) throws Exception {
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
	public int doWorkFlow(Integer workFlowId, String userCode,int agree) throws Exception {
		WorkFlow workFlow = workFlowDao.findWorkFlowById(workFlowId);
		FlowNode flowNode = flowNodeDao.findFlowNodeById(workFlow.getWorkflowNode());
		//拒绝
		if (agree == FlowConst.AGREE_FALSE) {
			//标记工作流为开始状态
			if(flowNode.getSort()!=1)
			workFlow.setStatus(0);
		}
		return 0;
	}
	
}
