package org.heyimateyang.service.impl;

import javax.annotation.Resource;

import org.heyimateyang.dao.UserDao;
import org.heyimateyang.model.User;
import org.heyimateyang.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

	@Resource
	UserDao userDao;
	
	@Transactional
	public void addUser(User user) {
		this.userDao.add(user);
	}

}
