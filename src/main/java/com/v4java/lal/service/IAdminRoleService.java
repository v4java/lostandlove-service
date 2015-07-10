package com.v4java.lal.service;

import com.v4java.lal.pojo.AdminRole;

public interface IAdminRoleService {

	
	/**
	 * 新增一条管理员角色
	 * @param adminRole
	 * @return
	 */
	int insertAdminRole(AdminRole adminRole) throws Exception;

	
	/**
	 * 新增一条管理员角色,实体类会返回主键
	 * @param adminRole
	 * @return
	 */
	int insertAdminRoleAnduseGeneratedKeys(AdminRole adminRole) throws Exception;
	
}
