package com.v4java.lal.service;

import java.util.List;

import com.v4java.lal.pojo.WorkFlow;
import com.v4java.lal.view.admin.WorkFlowVO;

public interface IWorkFlowService {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	void insertWorkFlow(WorkFlow workFlow) throws Exception;


	/**
	 * 查找用户代办审批 WorkFlowVO
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	List<WorkFlowVO> findUserWorkFlowVOByUserCode(String userCode) throws Exception;
	/**
	 * 查找用户代办审批 count
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	int findUserWorkFlowVOCountByUserCode(String userCode) throws Exception;
	
	/**
	 * 进行工作流审批
	 * @param workFlowId 待审批工作id
	 * @param userCode	 用户码
	 * @param agree		 是否同意  
	 * 							  0  同意
	 * 							  1  不同意	
	 * @return
	 * @throws Exception
	 */
	int doWorkFlow(Integer workFlowId,String userCode,int agree)throws Exception;
}
