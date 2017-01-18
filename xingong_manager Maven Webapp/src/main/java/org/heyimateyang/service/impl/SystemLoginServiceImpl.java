package org.heyimateyang.service.impl;

import java.io.Serializable;

import org.heyimateyang.dao.ISystemLoginDao;
import org.heyimateyang.model.SystemLogin;
import org.heyimateyang.service.SystemLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("SystemLoginServiceImpl")
public class SystemLoginServiceImpl implements SystemLoginService,Serializable{

	private static final long serialVersionUID = -76399540968554492L;
	
	@Autowired
	private ISystemLoginDao systemLoginDao;

	public void setSystemLoginDao(ISystemLoginDao systemLoginDao) {
		this.systemLoginDao = systemLoginDao;
	}


	
	public void addLoginIp(SystemLogin systemLogin) {
		this.systemLoginDao.addIp(systemLogin);
	}

}
