package com.v4java.lal.dao;

import java.util.List;

import com.v4java.lal.pojo.FlowNode;

public interface FlowNodeDao {

	
	List<FlowNode> findFlowNodeByWorkFlowId(Integer workFlowId) throws Exception;
	
	FlowNode findFlowNodeById(Integer Id) throws Exception;
	
	void insertFlowNode(FlowNode flowNode) throws Exception;
}
