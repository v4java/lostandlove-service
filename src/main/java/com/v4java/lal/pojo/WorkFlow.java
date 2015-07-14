package com.v4java.lal.pojo;

import java.sql.Timestamp;

public class WorkFlow implements Pojo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5418867925197378044L;

	
	private Integer id ;//int primary key  AUTO_INCREMENT,
	private Integer busyTypeId ;// '业务类型id',
	private String name ;// '审批工作名',
	private String description ;// '审批工作描述',
	private Integer modelId ;// ,
	private Integer jobsId;// '待审批岗位id',
	private Integer workflowNode ;// '下一个审批节点',
	private Integer status ;// '0 未开始审批，可以编辑更改 1 正在审批，不可以编辑更改 2 审批结束，不可以编辑更改',
	private Timestamp createTime ;//
	private Timestamp updateTime ;//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBusyTypeId() {
		return busyTypeId;
	}
	public void setBusyTypeId(Integer busyTypeId) {
		this.busyTypeId = busyTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getJobsId() {
		return jobsId;
	}
	public void setJobsId(Integer jobsId) {
		this.jobsId = jobsId;
	}
	public Integer getWorkflowNode() {
		return workflowNode;
	}
	public void setWorkflowNode(Integer workflowNode) {
		this.workflowNode = workflowNode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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