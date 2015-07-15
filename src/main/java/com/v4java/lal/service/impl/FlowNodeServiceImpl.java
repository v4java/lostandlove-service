package com.v4java.lal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.FlowNodeDao;
import com.v4java.lal.pojo.FlowNode;
import com.v4java.lal.service.IFlowNodeService;

@Service("flowNodeService")
public class FlowNodeServiceImpl implements IFlowNodeService{

	@Autowired
	private FlowNodeDao flowNodeDao;
	@Override
	public List<FlowNode> findFlowNodeByModelId(Integer workFlowId)throws Exception {
		return flowNodeDao.findFlowNodeByModelId(workFlowId);
	}

	@Override
	public FlowNode findFlowNodeById(Integer Id) throws Exception {
		return flowNodeDao.findFlowNodeById(Id);
	}

	@Override
	public void insertFlowNode(FlowNode flowNode) throws Exception {
		flowNodeDao.insertFlowNode(flowNode);
	}

}
