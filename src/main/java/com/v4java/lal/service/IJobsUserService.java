package com.v4java.lal.service;

import java.util.List;

import com.v4java.lal.pojo.JobsUser;

public interface IJobsUserService {
	
	void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception;
	
}
