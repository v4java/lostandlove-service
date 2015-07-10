package com.v4java.lal.pojo;

/**
 * 系统角色权限关联
 * @author vincent
 **@Project Name:lostandlove-service 
 * @File Name:AdminRolePrivilege.java 
 * @Package Name:com.v4java.lal.pojo 
 * @Date:2015年5月25日下午12:44:12 
 * @Copyright (c) 2015, 15091627595@163.com All Rights Reserved.
 */
public class AdminRolePrivilege implements Pojo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8329726771995566019L;
	//主键，自增id
    private Integer id;
    //角色id
    private Integer adminRoleId;
    //权限id
    private Integer adminPrivilegeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(Integer adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public Integer getAdminPrivilegeId() {
        return adminPrivilegeId;
    }

    public void setAdminPrivilegeId(Integer adminPrivilegeId) {
        this.adminPrivilegeId = adminPrivilegeId;
    }
}