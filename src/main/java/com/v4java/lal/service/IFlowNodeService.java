package com.v4java.lal.service;

import java.util.List;

import com.v4java.lal.pojo.FlowNode;

public interface IFlowNodeService {

	
	List<FlowNode> findFlowNodeByModelId(Integer workFlowId) throws Exception;
	
	FlowNode findFlowNodeById(Integer Id) throws Exception;
	
	void insertFlowNode(FlowNode flowNode) throws Exception;
}
