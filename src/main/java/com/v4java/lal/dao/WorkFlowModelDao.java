package com.v4java.lal.dao;

import com.v4java.lal.pojo.WorkFlowModel;

public interface WorkFlowModelDao {

	
	WorkFlowModel findWorkFlowModelById(Integer id) throws Exception;
	
	int insertWorkFlowModel(WorkFlowModel workFlowModel) throws Exception;
}
