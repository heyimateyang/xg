package org.heyimateyang.service;

import org.heyimateyang.model.AdminLogin;


/**
 * @Description 管理员业务逻辑层
 * @author heyimateyang
 *
 */

public interface AdminLoginService {
	
	public AdminLogin login_admin(String admin_user , String admin_password,String Ip); 
	
	//添加登录次数
	public void add_attempts(String admin_user);
	
	//锁定帐号
	public void lock(String admin_user);
	
}
