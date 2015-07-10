package com.v4java.lal.pojo;

import java.sql.Timestamp;

/**
 * 管理员表
 * @author vincent
 **@Project Name:lostandlove-service 
 * @File Name:AdminUser.java 
 * @Package Name:com.v4java.lal.pojo 
 * @Date:2015年5月25日下午12:40:11 
 * @Copyright (c) 2015, 15091627595@163.com All Rights Reserved.
 */
public class AdminUser implements Pojo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8171161656805930382L;
	//管理员id，主键 ，自增
    private Integer id;
    //管理员角色id
    private Integer adminRoleId;
    //管理员账号
    private String account;
    //管理员密码
    private String password;
    //状态
    private Integer status;
    //是否删除
    private Integer isDelete;
    //创建时间
    private Timestamp createTime;
    //修改时间
    private Timestamp updateTime;
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
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	
    
}