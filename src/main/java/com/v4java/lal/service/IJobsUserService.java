package com.v4java.lal.service;

import java.util.List;

import com.v4java.lal.pojo.JobsUser;
import com.v4java.lal.view.admin.WorkFlowVO;

public interface IJobsUserService {

	
	List<WorkFlowVO> findUserWorkFlowVOByUserCode(String userCode) throws Exception;
	
	void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception;
	
}
