package com.v4java.lal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.AdminUserDao;
import com.v4java.lal.pojo.AdminUser;
import com.v4java.lal.query.admin.AdminUserQuery;
import com.v4java.lal.service.IAdminUserService;
import com.v4java.lal.view.admin.AdminUserVO;



@Service("adminUserService")
public class AdminUserServiceImpl implements IAdminUserService{

	@Autowired
	private AdminUserDao adminUserDao;

	@Override
	public int insertAdminUser(AdminUser adminUser) throws Exception {
		return adminUserDao.insertAdminUser(adminUser);
	}
	@Override
	public int insertAdminUserAnduseGeneratedKeys(AdminUser adminUser)throws Exception {
		return adminUserDao.insertAdminUserAnduseGeneratedKeys(adminUser);
	}
	@Override
	public AdminUserVO selectAdminUserVOByAccount(String account)throws Exception {
		return adminUserDao.selectAdminUserVOByAccount(account);
	}
	@Override
	public List<AdminUserVO> selectAdminUserVO(AdminUserQuery adminUserQuery)throws Exception {
		return adminUserDao.selectAdminUserVO(adminUserQuery);
	}
	@Override
	public Integer selectAdminUserVOCount(AdminUserQuery adminUserQuery)throws Exception {
		return adminUserDao.selectAdminUserVOCount(adminUserQuery);
	}
	@Override
	public Integer updateAdminUserStatus(AdminUser adminUser) throws Exception {
		return adminUserDao.updateAdminUserStatus(adminUser);
	}
	@Override
	public Integer updateAdminUserIsDelete(AdminUser adminUser)throws Exception {
		return adminUserDao.updateAdminUserIsDelete(adminUser);
	}

}
