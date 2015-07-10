package com.v4java.lal.pojo;


/**
 * 系统用户角色关联
 * @author vincent
 **@Project Name:lostandlove-service 
 * @File Name:AdminUserRole.java 
 * @Package Name:com.v4java.lal.pojo 
 * @Date:2015年5月25日下午12:38:56 
 * @Copyright (c) 2015, 15091627595@163.com All Rights Reserved.
 */
public class AdminUserRole implements Pojo{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4011185011461879021L;

	//主键，自增id
	private Integer id;
	//管理员id
    private Integer adminUserId;
    //管理元角色id
    private Integer adminRoleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    public Integer getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(Integer adminRoleId) {
        this.adminRoleId = adminRoleId;
    }
}