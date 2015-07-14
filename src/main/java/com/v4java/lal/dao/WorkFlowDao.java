package com.v4java.lal.dao;

import com.v4java.lal.pojo.WorkFlow;

public interface WorkFlowDao {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	int insertWorkFlow(WorkFlow workFlow) throws Exception;
}
