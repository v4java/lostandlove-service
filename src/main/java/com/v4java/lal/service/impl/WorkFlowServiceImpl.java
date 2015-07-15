package com.v4java.lal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.WorkFlowDao;
import com.v4java.lal.pojo.WorkFlow;
import com.v4java.lal.service.IWorkFlowService;
import com.v4java.lal.view.admin.WorkFlowVO;

@Service("workFlowService")
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

	@Override
	public List<WorkFlowVO> findUserWorkFlowVOByUserCode(String userCode)throws Exception {
		return workFlowDao.findUserWorkFlowVOByUserCode(userCode);
	}

	@Override
	public int findUserWorkFlowVOCountByUserCode(String userCode)throws Exception {
		return workFlowDao.findUserWorkFlowVOCountByUserCode(userCode);
	}
	
}
