package com.v4java.lal.dao;

import java.util.List;

import com.v4java.lal.pojo.JobsUser;
import com.v4java.lal.view.admin.WorkFlowVO;

public interface JobsUserDao {

	
	List<WorkFlowVO> findUserWorkFlowVOByUserId(Integer userId) throws Exception;
	
	void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception;
	
}
