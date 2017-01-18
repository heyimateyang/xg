package org.heyimateyang.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.heyimateyang.dao.IAdminLoginDao;
import org.heyimateyang.dao.IAdminSaltDao;
import org.heyimateyang.escape.EscapeUnitl;
import org.heyimateyang.model.AdminLogin;
import org.heyimateyang.model.SystemLogin;
import org.heyimateyang.service.AdminLoginService;
import org.heyimateyang.service.SystemLoginService;
import org.heyimateyang.unit.MD5Salt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Description 管理员登录业务逻辑层
 * @Description 实现序列化接口
 * @version  1.0版本
 * @author heyimateyang
 *
 */


@Service("AdminLoginServiceImpl")
public class AdminLoginServiceImpl implements Serializable , AdminLoginService{
	private static final long serialVersionUID = 8706244783593521349L;
	
	private MD5Salt md5Salt = new MD5Salt();
	
	
	@Autowired
	private IAdminLoginDao adminLoginDao;
	@Autowired
	private IAdminSaltDao adminSaltDao;
	@Autowired
	private EscapeUnitl escapeUnitl;
	@Autowired
	private SystemLoginService systemLoginServicel;
	
	public void setSystemLoginServicel(SystemLoginService systemLoginServicel) {
		this.systemLoginServicel = systemLoginServicel;
	}

	public void setAdminSaltDao(IAdminSaltDao adminSaltDao) {
		this.adminSaltDao = adminSaltDao;
	}

	public void setEscapeUnitl(EscapeUnitl escapeUnitl) {
		this.escapeUnitl = escapeUnitl;
	}

	public void setAdminLoginDao(IAdminLoginDao adminLoginDao) {
		this.adminLoginDao = adminLoginDao;
	}

	
	public AdminLogin login_admin(String admin_user, String admin_password,String Ip) {
		List<String> list =null;
		try {
			list = escapeUnitl.escapeUnitl(admin_user, admin_password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//存入当前客户端IP  
		SystemLogin systemLogin = new SystemLogin();
		systemLogin.setLogin_data(new Date());       //当前时间
		systemLogin.setLogin_ip(Ip);				//客户端IP
		systemLogin.setLogin_user(admin_user);     //登录帐号
		systemLoginServicel.addLoginIp(systemLogin);   //存入数据库
		
		//过滤处理
		admin_user = list.get(0);
		admin_password = list.get(1);
		//加一登录次数
		adminLoginDao.add_attempts(admin_user);
		AdminLogin adminLogin = adminLoginDao.login_admin(admin_user);
		AdminLogin adminLoginMessage = null;
		
		if(adminLogin==null){
			return adminLogin;
		}
		if(adminLogin.getAttempts()>=10){
			//登录错误超过十次锁定帐号
			lock(admin_user);
			return adminLogin;
		}
		if(adminLogin!=null){
			if(adminLogin.getLocked()==0){
				String admin_salt = adminSaltDao.find_admin_salt(adminLogin.getAdmin_loginId());
				//验证成功,初始化为0登录次数
				adminLoginDao.Initialization_attempts(admin_user);
				//重新加密后验证
				String salt = md5Salt.md5_salt(admin_password, admin_salt);
				adminLoginMessage = adminLoginDao.login_adminPwd(salt);
				return adminLoginMessage;
			}
		}
		return adminLoginMessage;
	}


	public void add_attempts(String admin_user) {
		this.adminLoginDao.add_attempts(admin_user);
	}


	public void lock(String admin_user) {
		this.adminLoginDao.lock(admin_user);
		
	}

}
