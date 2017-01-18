package org.heyimateyang.dao;

import org.heyimateyang.model.SystemLogin;


/**
 * 
 * @author heyimateyang
 * @Description 记录登录人员IP地址,进行验证操作
 */

public interface ISystemLoginDao {
	
	//添加登录IP
	public void addIp(SystemLogin systemLogin);

}
