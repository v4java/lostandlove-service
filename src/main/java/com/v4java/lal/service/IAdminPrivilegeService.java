package com.v4java.lal.service;

import java.util.List;

import com.v4java.lal.pojo.AdminPrivilege;

public interface IAdminPrivilegeService {

	/**
	 * 新增一条AdminPrivilege记录
	 * 要求:AdminPrivilege中字段除createTime和updateTime均不能为null
	 * @param adminPrivilege
	 * @throws Exception
	 */
    void insertAdminPrivilege(AdminPrivilege adminPrivilege) throws Exception;
    
    /**
     * 批量新增AdminPrivilege记录
	 * 要求:AdminPrivilege中字段除createTime和updateTime均不能为null
     * @param adminPrivileges
     */
    void batchInsertAdminPrivilege(List<AdminPrivilege> adminPrivileges) throws Exception;
    
   /**
    * 新增一条AdminPrivilege记录,会返回主键
	* 要求:AdminPrivilege中字段除createTime和updateTime均不能为null
    * @param adminPrivilege
    */
    void insertAdminPrivilegeAnduseGeneratedKeys(AdminPrivilege adminPrivilege) throws Exception;
}
