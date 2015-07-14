/*package com.v4java.lal.admin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.lal.pojo.WorkFlowModel;
import com.v4java.lal.service.IJobsUserService;
import com.v4java.lal.service.IWorkFlowModelService;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class WorkFlowModelServiceTest extends TestCase{

	
	private IWorkFlowModelService workFlowModelService;
	
	public WorkFlowModelServiceTest(String name) {
		super(name);
		ApplicationContext context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		workFlowModelService =(IWorkFlowModelService) context.getBean("workFlowModelService");
	}

	
	public static Test suite(){
		TestSuite test = new TestSuite("WorkFlowModelService接口测试");
		test.addTest(new WorkFlowModelServiceTest("insertWorkFlowModel"));
		return test;
	}
	
	public void insertWorkFlowModel() throws Exception{
		WorkFlowModel flowModel = new WorkFlowModel();
		flowModel.setBusyTypeId(0);
		flowModel.setDescription("借款审批");
		flowModel.setName("借款审批");
		flowModel.setModelText("");
		flowModel.setStatus(0);
		workFlowModelService.insertWorkFlowModel(flowModel);
	}
}
*/