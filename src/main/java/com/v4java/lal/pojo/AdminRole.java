package com.v4java.lal.pojo;

import java.sql.Timestamp;

public class AdminRole implements Pojo{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8693205822941447054L;
	//主键。，自增
    private Integer id;
    //角色名
    private String name;
    //
    private Integer isAdmin;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
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