package org.heyimateyang.service.impl;

import java.io.Serializable;

import org.heyimateyang.dao.IAdminSaltDao;
import org.heyimateyang.service.AdminSaltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 查找随机盐
 * @version 1.0版本
 * @author heyimateyang
 *
 */

@Service("adminSaltServiceImpl")
public class AdminSaltServiceImpl implements AdminSaltService,Serializable{
	private static final long serialVersionUID = 5660819210841461112L;
	
	@Autowired
	private IAdminSaltDao adminSaltDao;

	public void setAdminSaltDao(IAdminSaltDao adminSaltDao) {
		this.adminSaltDao = adminSaltDao;
	}

	public String find_admin_salt(int id) {
		String admin_salt = adminSaltDao.find_admin_salt(id);
		return admin_salt;
	}

}
