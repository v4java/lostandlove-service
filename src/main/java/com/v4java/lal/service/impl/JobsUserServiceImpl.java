package com.v4java.lal.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.JobsUserDao;
import com.v4java.lal.pojo.JobsUser;
import com.v4java.lal.service.IJobsUserService;
import com.v4java.lal.view.admin.WorkFlowVO;


@Service("jobsUserService")
public class JobsUserServiceImpl implements IJobsUserService{

	@Autowired
	private JobsUserDao jobsUserDao;
	
	@Override
	public List<WorkFlowVO> findUserWorkFlowVOByUserId(Integer userId)
			throws Exception {
		return jobsUserDao.findUserWorkFlowVOByUserId(userId);
	}

	@Override
	public void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception {
		jobsUserDao.batchInsertJobsUser(jobsUsers);
	}

}
