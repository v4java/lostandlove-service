package com.v4java.lal.view.admin;

import java.util.List;

import com.v4java.lal.pojo.AdminPrivilege;
import com.v4java.lal.view.View;

public class AdminPrivilegeVO extends AdminPrivilege implements View{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9214834457065983587L;

	private List<AdminPrivilegeVO> adminPrivilegeVOs;
	
	public AdminPrivilegeVO() {
		super();
	}

	public List<AdminPrivilegeVO> getAdminPrivilegeVOs() {
		return adminPrivilegeVOs;
	}

	public void setAdminPrivilegeVOs(List<AdminPrivilegeVO> adminPrivilegeVOs) {
		this.adminPrivilegeVOs = adminPrivilegeVOs;
	}

	
	
}
