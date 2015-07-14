package com.v4java.lal.service;

import com.v4java.lal.pojo.WorkFlowModel;

public interface IWorkFlowModelService {

	WorkFlowModel findWorkFlowModelById(Integer id) throws Exception;
	
	void insertWorkFlowModel(WorkFlowModel workFlowModel) throws Exception;
}
