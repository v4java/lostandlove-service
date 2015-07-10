package com.v4java.lal.query.admin;

import com.v4java.lal.query.Query;


public class AdminUserQuery extends Query{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8831394734825702021L;
	
	private Integer adminRoleId;
    //管理员账号
    private String account;

	public Integer getAdminRoleId() {
		return adminRoleId;
	}
	public void setAdminRoleId(Integer adminRoleId) {
		this.adminRoleId = adminRoleId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
}
