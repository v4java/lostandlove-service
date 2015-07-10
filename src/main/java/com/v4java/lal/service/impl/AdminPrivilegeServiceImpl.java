package com.v4java.lal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.AdminPrivilegeDao;
import com.v4java.lal.pojo.AdminPrivilege;
import com.v4java.lal.service.IAdminPrivilegeService;

@Service("adminPrivilegeService")
public class AdminPrivilegeServiceImpl implements IAdminPrivilegeService{

	@Autowired
	private AdminPrivilegeDao adminPrivilegeDao;

	@Override
	public void insertAdminPrivilege(AdminPrivilege adminPrivilege)  throws Exception{
			adminPrivilegeDao.insertAdminPrivilege(adminPrivilege);
	}

	@Override
	public void batchInsertAdminPrivilege(List<AdminPrivilege> adminPrivileges)  throws Exception {
			adminPrivilegeDao.batchInsertAdminPrivilege(adminPrivileges);
	}

	@Override
	public void insertAdminPrivilegeAnduseGeneratedKeys(AdminPrivilege adminPrivilege)throws Exception {
			adminPrivilegeDao.insertAdminPrivilegeAnduseGeneratedKeys(adminPrivilege);
	}

}
