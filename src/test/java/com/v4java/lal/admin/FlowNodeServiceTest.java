package com.v4java.lal.admin;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.lal.pojo.FlowNode;
import com.v4java.lal.service.IFlowNodeService;
import com.v4java.lal.tools.TestJson;

public class FlowNodeServiceTest extends TestCase{

	private IFlowNodeService flowNodeService;
	private ApplicationContext context;
	
	public FlowNodeServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		flowNodeService =(IFlowNodeService) context.getBean("flowNodeService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("FlowNodeService接口测试");
		test.addTest(new FlowNodeServiceTest("insertFlowNode1"));
		return test;
	}
	
	public void insertFlowNode1() throws Exception{
		FlowNode flowNode =new FlowNode();
		flowNode.setJobsId(0);
		flowNode.setModelId(6);
		flowNode.setName("判断");
		TestJson json1 =new TestJson();
		json1.setTarget(4);
		json1.setTest("");
		flowNode.setDescription("大于200w需要财务主管审批");
		flowNode.setNodeType(2);
		flowNode.setSort(3);
		flowNode.setNextSort(0);
		flowNodeService.insertFlowNode(flowNode);
	}
	
	public void findFlowNodeById() throws Exception{
		FlowNode flowNode = flowNodeService.findFlowNodeById(8);
		System.err.println(flowNode.getJobsId());
	}
	
	public void findFlowNodeByWorkFlowId() throws Exception{
	}
}
