package com.v4java.lal.service;

import java.util.List;

import com.v4java.lal.pojo.AdminUser;
import com.v4java.lal.query.admin.AdminUserQuery;
import com.v4java.lal.view.admin.AdminUserVO;

public interface IAdminUserService {

	/**
	 * 插入一条管理员用户
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	int insertAdminUser(AdminUser adminUser) throws Exception;

	/**
	 * 插入一条管理员用户,实体类返回主键
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public int insertAdminUserAnduseGeneratedKeys(AdminUser adminUser) throws Exception ;
	
	/**
	 * 根据帐号查询用户
	 * @param account
	 * @return
	 * @throws Exception
	 */
	public AdminUserVO selectAdminUserVOByAccount(String account) throws Exception;

	
	/**
	 * 查询管理员用户
	 * @param adminUserQuery
	 * @return
	 * @throws Exception
	 */
	public List<AdminUserVO> selectAdminUserVO(AdminUserQuery adminUserQuery) throws Exception;

	/**
	 * 查询管理员用户count
	 * @param adminUserQuery
	 * @return
	 * @throws Exception
	 */
	public Integer selectAdminUserVOCount(AdminUserQuery adminUserQuery) throws Exception;
	
	/**
	 * 更新管理员用户状态
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public Integer updateAdminUserStatus(AdminUser adminUser) throws Exception ;
	
	/**
	 * 更新管理员用户删除状态
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public Integer updateAdminUserIsDelete(AdminUser adminUser) throws Exception ;
}
