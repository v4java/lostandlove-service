package com.v4java.lal.pojo;

import java.sql.Timestamp;

/**
 * 权限表
 * @author vincent
 **@Project Name:lostandlove-service 
 * @File Name:AdminPrivilege.java 
 * @Package Name:com.v4java.lal.pojo 
 * @Date:2015年5月25日下午12:47:52 
 * @Copyright (c) 2015, 15091627595@163.com All Rights Reserved.
 */
public class AdminPrivilege implements Pojo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8183372967719469761L;
	//主键，自增
    private Integer id;
    //权限名称
    private String name;
    //父权限id
    private Integer parentId;
    //权限地址
    private String url;
    //是否显示
    private Integer isShow;
    //是否删除
    private Integer isDelete;
    //操作编码
    private String code;
    //排序
    private Integer sort;
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
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getIsShow() {
		return isShow;
	}
	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
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
	@Override
	public String toString() {
		return "AdminPrivilege [id=" + id + ", name=" + name + ", parentId="
				+ parentId + ", url=" + url + ", isShow=" + isShow
				+ ", isDelete=" + isDelete + ", code=" + code + ", sort="
				+ sort + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}

	
    
}