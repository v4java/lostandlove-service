package com.v4java.lal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.v4java.lal.dao.WorkFlowDao;
import com.v4java.lal.pojo.WorkFlow;
import com.v4java.lal.service.IWorkFlowService;

public class WorkFlowServiceImpl implements IWorkFlowService{

	@Autowired
	private WorkFlowDao workFlowDao;
	
	@Override
	public WorkFlow findWorkFlowById(Integer id) throws Exception {
		return workFlowDao.findWorkFlowById(id);
	}

	@Override
	public void insertWorkFlow(WorkFlow workFlow) throws Exception {
		workFlowDao.insertWorkFlow(workFlow);
	}
	
}
