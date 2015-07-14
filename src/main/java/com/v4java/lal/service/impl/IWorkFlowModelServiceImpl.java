package com.v4java.lal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.WorkFlowModelDao;
import com.v4java.lal.pojo.WorkFlowModel;
import com.v4java.lal.service.IWorkFlowModelService;


@Service("workFlowModelService")
public class IWorkFlowModelServiceImpl implements IWorkFlowModelService{

	@Autowired
	private WorkFlowModelDao workFlowModelDao ;
	@Override
	public WorkFlowModel findWorkFlowModelById(Integer id) throws Exception {
		return workFlowModelDao.findWorkFlowModelById(id);
	}

	@Override
	public void insertWorkFlowModel(WorkFlowModel workFlowModel)throws Exception {
		workFlowModelDao.insertWorkFlowModel(workFlowModel);
	}

}
