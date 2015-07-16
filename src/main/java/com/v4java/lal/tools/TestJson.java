package com.v4java.lal.tools;

import java.io.Serializable;

public class TestJson implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String test;
	
	private Integer target;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}
	
	
	
	
}
