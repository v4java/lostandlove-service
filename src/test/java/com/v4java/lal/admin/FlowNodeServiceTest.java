/*package com.v4java.lal.admin;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.lal.pojo.FlowNode;
import com.v4java.lal.service.IFlowNodeService;

public class FlowNodeServiceTest extends TestCase{

	private IFlowNodeService flowNodeService;
	
	public FlowNodeServiceTest(String name) {
		super(name);
		ApplicationContext context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		flowNodeService =(IFlowNodeService) context.getBean("flowNodeService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("FlowNodeService接口测试");
		test.addTest(new FlowNodeServiceTest("insertFlowNode"));
		return test;
	}
	
	public void insertFlowNode() throws Exception{
		FlowNode flowNode =new FlowNode();
		flowNode.setJobsId(0);
		flowNode.setModelId(5);
		flowNode.setName("借款审批结束");
		flowNode.setDescription("借款审批结束");
		flowNode.setNodeType(3);
		flowNode.setSort(6);
		flowNode.setNextSort(0);
		flowNodeService.insertFlowNode(flowNode);
	}
	
	public void findFlowNodeById() throws Exception{
		FlowNode flowNode = flowNodeService.findFlowNodeById(8);
		System.err.println(flowNode.getJobsId());
	}
	
	public void findFlowNodeByWorkFlowId() throws Exception{
		List<FlowNode> findFlowNodeByWorkFlowId = flowNodeService.findFlowNodeByWorkFlowId(5);
		for (FlowNode flowNode : findFlowNodeByWorkFlowId) {
			System.err.println(flowNode.getName());
		}
	}
}
*/