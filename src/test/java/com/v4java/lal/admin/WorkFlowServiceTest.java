/*package com.v4java.lal.admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.lal.pojo.ApproveLog;
import com.v4java.lal.pojo.WorkFlow;
import com.v4java.lal.service.IWorkFlowService;
import com.v4java.lal.view.admin.UserVO;
import com.v4java.lal.view.admin.WorkFlowVO;

public class WorkFlowServiceTest  extends TestCase{

	private IWorkFlowService workFlowService;
	private ApplicationContext context;
	
	public WorkFlowServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		workFlowService =(IWorkFlowService) context.getBean("workFlowService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("WorkFlowServiceTest接口测试");
		test.addTest(new WorkFlowServiceTest("insertWorkFlow"));
		return test;
	}
	public void findUserWorkFlowVOByUserId() throws Exception{
		List<WorkFlowVO> workFlowVOs = workFlowService.findUserWorkFlowVOByUserCode("vz110");
		System.out.println(workFlowVOs.size());
		for (WorkFlowVO workFlowVO : workFlowVOs) {
			System.err.println(workFlowVO.toString());
		}
	}
	
	public void doWorkFlow()throws Exception{
		UserVO userVO = new UserVO();
		List<Integer> jobsIds = new ArrayList<Integer>();
		jobsIds.add(1);
		jobsIds.add(7);
		userVO.setJobsIds(jobsIds);
		userVO.setUserCode("vz110");
		userVO.setUserName("陈海龙");
		ApproveLog approveLog = new ApproveLog();
		approveLog.setStatus(0);
		workFlowService.doWorkFlow(5, userVO, approveLog);
	}
	public void insertWorkFlow() throws Exception{
		WorkFlow flow = new WorkFlow();
		flow.setBusyTypeName("提现申请");
		flow.setBusyTypeId(1);
		flow.setDescription("提现申请");
		flow.setMoney(new BigDecimal(99999.11));
		flow.setName("提现申请");
		flow.setWorkflowNode(6);
		workFlowService.insertWorkFlow(flow);
	}
	
}
*/