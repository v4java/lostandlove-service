package com.v4java.lal.dao;

import java.util.List;

import com.v4java.lal.pojo.JobsUser;
import com.v4java.lal.view.admin.WorkFlowVO;

public interface JobsUserDao {

	

	
	void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception;
	
}
