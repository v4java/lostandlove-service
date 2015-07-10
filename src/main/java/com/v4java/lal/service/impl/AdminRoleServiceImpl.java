package com.v4java.lal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.AdminRoleDao;
import com.v4java.lal.pojo.AdminRole;
import com.v4java.lal.service.IAdminRoleService;

@Service("adminRoleService")
public class AdminRoleServiceImpl implements IAdminRoleService{

	@Autowired
	private AdminRoleDao adminRoleDao; 
	
	@Override
	public int insertAdminRole(AdminRole adminRole) throws Exception {
		return adminRoleDao.insertAdminRole(adminRole);
	}

	@Override
	public int insertAdminRoleAnduseGeneratedKeys(AdminRole adminRole)throws Exception {
		return adminRoleDao.insertAdminRoleAnduseGeneratedKeys(adminRole);
	}

}
