package com.v4java.lal.view.admin;

import java.util.List;

import com.v4java.lal.pojo.AdminPrivilege;
import com.v4java.lal.view.View;

public class AdminPrivilegeVO extends AdminPrivilege implements View{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9214834457065983587L;

	private List<AdminPrivilege> adminPrivileges;
	
	public AdminPrivilegeVO() {
		super();
	}

	public List<AdminPrivilege> getAdminPrivileges() {
		return adminPrivileges;
	}

	public void setAdminPrivileges(List<AdminPrivilege> adminPrivileges) {
		this.adminPrivileges = adminPrivileges;
	}
	
	
}
