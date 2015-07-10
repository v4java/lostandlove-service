/*package com.v4java.lal.admin;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.lal.pojo.AdminUser;
import com.v4java.lal.query.admin.AdminUserQuery;
import com.v4java.lal.service.IAdminUserService;
import com.v4java.lal.view.admin.AdminUserVO;

public class AdminUserTest extends TestCase{

	
	private IAdminUserService adminUserService;
	public AdminUserTest(String name) {
		super(name);
		ApplicationContext context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		adminUserService =(IAdminUserService) context.getBean("adminUserService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("AdminUserTest接口测试");
		//test.addTest(new AdminUserTest("insertSelective"));
		test.addTest(new AdminUserTest("selectAdminUserVO"));
		
		return test;
	}
	
	public void insertSelective(){
		AdminUser adminUser =new AdminUser();
		adminUser.setAccount("377");
		adminUser.setAdminRoleId(1);
		adminUser.setPassword("dadadaf");
		int a = 0;
		try {
			a = adminUserService.insertAdminUser(adminUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("返回值"+a);
		System.err.println(adminUser.toString());
	}
	
	public void selectAdminUserVO() throws Exception{
		AdminUserQuery adminUserQuery =new AdminUserQuery();
		List<AdminUserVO> adminUserVOs = adminUserService.selectAdminUserVO(adminUserQuery);
		for (AdminUserVO adminUserVO : adminUserVOs) {
			System.err.println(adminUserVO.getAccount());
		}
		Integer count = adminUserService.selectAdminUserVOCount(adminUserQuery);
		System.err.println(count);
	}
}
*/