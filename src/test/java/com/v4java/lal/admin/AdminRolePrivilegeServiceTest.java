/*package com.v4java.lal.admin;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.lal.pojo.AdminPrivilege;
import com.v4java.lal.service.IAdminRolePrivilegeService;
import com.v4java.lal.view.admin.AdminPrivilegeVO;

public class AdminRolePrivilegeServiceTest extends TestCase {

	private IAdminRolePrivilegeService adminRolePrivilegeService;
	
	public AdminRolePrivilegeServiceTest(String name) {
		super(name);
		ApplicationContext context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		adminRolePrivilegeService =(IAdminRolePrivilegeService) context.getBean("adminRolePrivilegeService");
	}

	
	public static Test suite(){
		TestSuite test = new TestSuite("adminRolePrivilegeService接口测试");
		//test.addTest(new AdminUserTest("insertSelective"));
		test.addTest(new AdminRolePrivilegeServiceTest("selectAdminRolePrivilegeByRoleId"));
		return test;
	}
	
	
	public void selectAdminRolePrivilegeByRoleId(){
		List<AdminPrivilegeVO> adminPrivilegeVOs = adminRolePrivilegeService.selectAdminRolePrivilegeByRoleId(1);
		for (AdminPrivilegeVO adminPrivilegeVO : adminPrivilegeVOs) {
			System.err.println("1:  "+adminPrivilegeVO.getName());
			for (AdminPrivilegeVO adminPrivilegeVO1:adminPrivilegeVO.getAdminPrivilegeVOs()) {
				System.err.println("2:  "+adminPrivilegeVO.getName());
				for (AdminPrivilege adminPrivilegeVO2:adminPrivilegeVO1.getAdminPrivilegeVOs()) {
					System.err.println("3:  "+adminPrivilegeVO2.getName());
				}
			}
		}
	}
}
*/