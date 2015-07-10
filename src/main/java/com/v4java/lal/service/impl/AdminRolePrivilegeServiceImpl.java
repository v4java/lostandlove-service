package com.v4java.lal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.lal.dao.AdminRolePrivilegeDao;
import com.v4java.lal.pojo.AdminRolePrivilege;
import com.v4java.lal.service.IAdminRolePrivilegeService;
import com.v4java.lal.view.admin.AdminPrivilegeVO;


@Service("adminRolePrivilegeService")
public class AdminRolePrivilegeServiceImpl implements IAdminRolePrivilegeService{

	@Autowired
	private AdminRolePrivilegeDao adminRolePrivilegeDao; 
	@Override
	public int batchInsertAdminRolePrivilege(List<AdminRolePrivilege> adminRolePrivileges) throws Exception {
		return adminRolePrivilegeDao.batchInsertAdminRolePrivilege(adminRolePrivileges);
	}
	@Override
	public List<AdminPrivilegeVO> selectAdminRolePrivilegeByRoleId(Integer adminRoleId) {
		return adminRolePrivilegeDao.selectAdminRolePrivilegeByRoleId(adminRoleId);
	}

}
