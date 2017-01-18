package org.heyimateyang.dao;

import org.heyimateyang.model.AdminLogin;


/**
 * @Description 管理员登录DAO
 * @author heyimateyang
 *
 */

public interface IAdminLoginDao {
	
	//查询登录帐号
	public AdminLogin login_admin(String admin_user); 
	
	//查询登录密码
	public AdminLogin login_adminPwd(String admin_password);
	
	//添加登录次数
	public void add_attempts(String admin_user);
	
	//初始化登录次数
	public void Initialization_attempts(String admin_user);
	
	//锁定帐号
	public void lock(String admin_user);

}
