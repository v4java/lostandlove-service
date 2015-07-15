package com.v4java.lal.service;

import com.v4java.lal.pojo.WorkFlow;

public interface IWorkFlowService {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	void insertWorkFlow(WorkFlow workFlow) throws Exception;
}
