package com.v4java.lal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.v4java.lal.dao.ApproveLogDao;
import com.v4java.lal.pojo.ApproveLog;
import com.v4java.lal.service.IApproveLogService;

public class ApproveLogServiceImpl implements IApproveLogService{

	@Autowired
	private ApproveLogDao approveLogDao;
	@Override
	public void insertApproveLog(ApproveLog approveLog) throws Exception {
		approveLogDao.insertApproveLog(approveLog);
	}

	
}
