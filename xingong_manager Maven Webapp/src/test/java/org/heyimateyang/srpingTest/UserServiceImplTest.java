package org.heyimateyang.srpingTest;



import java.util.Date;

import org.heyimateyang.model.QuizCount;
import org.heyimateyang.model.QuizMessage;
import org.heyimateyang.model.ReplyQuiz;
import org.heyimateyang.model.User;
import org.heyimateyang.service.AdminLoginService;
import org.heyimateyang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;





/**
 * 
 * @author heyimateyang
 * 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml","classpath*:spring-hibernate.xml"})
public class UserServiceImplTest  {
	
	@Autowired
	UserService userServiceImpl;
	@Autowired
	AdminLoginService adminLoginService;
	
	@Test
	public void testCheckLogin() {
		System.out.println(new Date());
		/*User user =new User();
		user.setUserName("andy");
		user.setPassWord("123");
		userServiceImpl.addUser(user);*/
		
		
		
	}
	
	
/*
	@Autowired
	UserService userServiceImpl;
	@Test
	public void testCheckLogin() {
		fail("Not yet implemented");
	}

	@Test	
	@Repeat(30)
	public void testAddUser() {
		
		User user =new User();
		user.setUserName("Test");
		user.setPassWord("123");
		userServiceImpl.addUser(user);
		
	}


	@Test
	public void testUserList() {
		
		
	}
	
	@Test
	public void testUpdate()
	{
		User user =new User();
		user.setId(1);
		user.setUserName("Tency1");
		user.setPassWord("123");
		userServiceImpl.updateUser(user);
	}
	
	public void testFind()
	{
		
	}*/
}
