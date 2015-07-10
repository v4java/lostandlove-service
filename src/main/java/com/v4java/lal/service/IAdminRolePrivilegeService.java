package com.v4java.lal.service;

import java.util.List;

import com.v4java.lal.pojo.AdminRolePrivilege;
import com.v4java.lal.view.admin.AdminPrivilegeVO;

public interface IAdminRolePrivilegeService {

	
	/**
	 * 批量添加角色权限对应表
	 * @param adminRolePrivileges
	 * @return
	 * @throws Exception
	 */
	int batchInsertAdminRolePrivilege(List<AdminRolePrivilege> adminRolePrivileges) throws Exception;
	

	
	/**
	 * 根据角色得到权限
	 * @param adminRoleId
	 * @return
	 */
	List<AdminPrivilegeVO> selectAdminRolePrivilegeByRoleId(Integer adminRoleId);
}
