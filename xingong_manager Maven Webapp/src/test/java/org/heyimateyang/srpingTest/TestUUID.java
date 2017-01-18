package org.heyimateyang.srpingTest;

import org.heyimateyang.dao.IAdminLoginDao;
import org.heyimateyang.dao.impl.AdminLoginDaoImpl;
import org.heyimateyang.model.AdminLogin;
import org.heyimateyang.service.AdminLoginService;
import org.heyimateyang.service.UserService;
import org.heyimateyang.unit.UUID_Unitl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml","classpath*:spring-hibernate.xml"})
public class TestUUID {
	
	@Autowired
	AdminLoginService adminLoginService;
	
	@Test
	public void UUIDTest(){
	/*	UUID_Unitl uuid_Unitl = new UUID_Unitl();
		String a = uuid_Unitl.UUID_Number();
		System.out.println(a);*/
		
		
		AdminLogin adminLogin = adminLoginService.login_admin("andy","123");
		System.out.println(adminLogin.getAdmin_password());
	}

}
