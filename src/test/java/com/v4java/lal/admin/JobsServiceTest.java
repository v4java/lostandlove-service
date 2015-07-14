/*package com.v4java.lal.admin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.lal.pojo.Jobs;
import com.v4java.lal.service.IJobsService;


public class JobsServiceTest extends TestCase{

	private IJobsService jobsService;

	public JobsServiceTest(String name) {
		super(name);
		ApplicationContext context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		jobsService =(IJobsService) context.getBean("jobsService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("JobsServiceTest接口测试");
		//test.addTest(new AdminUserTest("insertSelective"));
		test.addTest(new JobsServiceTest("insertJobs"));
		
		return test;
	}
		
	public void insertJobs() throws Exception{
		Jobs jobs = new Jobs();
		jobs.setName("审批2");
		jobs.setDescription("审批2");
		jobs.setStatus(0);
		int n = jobsService.insertJobs(jobs);
		System.err.println(n);
	}
}
*/