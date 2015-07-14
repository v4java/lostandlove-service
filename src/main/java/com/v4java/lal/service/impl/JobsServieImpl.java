package com.v4java.lal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.JobsDao;
import com.v4java.lal.pojo.Jobs;
import com.v4java.lal.service.IJobsService;

@Service("jobsService")
public class JobsServieImpl implements IJobsService{

	@Autowired
	private JobsDao jobsDao;
	
	@Override
	public int insertJobs(Jobs jobs) throws Exception {
		return jobsDao.insertJobs(jobs);
	}
}
