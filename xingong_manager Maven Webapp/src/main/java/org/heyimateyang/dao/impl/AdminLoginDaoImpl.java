package org.heyimateyang.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.heyimateyang.dao.IAdminLoginDao;
import org.heyimateyang.model.AdminLogin;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 管理员登录DAO层
 * 实现序列化
 * @author heyimateyang
 *
 */

@Repository("adminLoginDaoImpl")
public class AdminLoginDaoImpl implements IAdminLoginDao,Serializable{
	
	private static final long serialVersionUID = -5922152908282556384L;

	private Query query;
	
	@Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
	
    @Transactional(readOnly = true)
	public AdminLogin login_admin(String admin_user) {
		query = (Query) sessionFactory.
				getCurrentSession().
				createQuery("from AdminLogin where admin_user = ?");
		query.setParameter(0, admin_user);
		return (AdminLogin) query.uniqueResult();
	}
    
    
    @Transactional(readOnly = true)
	public AdminLogin login_adminPwd(String admin_password) {
    	query = (Query) sessionFactory.
				getCurrentSession().
				createQuery("from AdminLogin where admin_password = ?");
		query.setParameter(0, admin_password);
		return (AdminLogin) query.uniqueResult();
	}

    //添加登录次数
    @Transactional(readOnly=false)
	public void add_attempts(String admin_user) {
    	query = sessionFactory.getCurrentSession().
    			createSQLQuery("UPDATE tbl_adminlogin SET attempts=attempts+1 WHERE admin_user=?").addEntity(AdminLogin.class);
    	query.setParameter(0, admin_user);
    	query.executeUpdate();
	}

    //初始化登录次数
    @Transactional(readOnly=false)
	public void Initialization_attempts(String admin_user) {
    	query = sessionFactory.getCurrentSession().
    			createSQLQuery("UPDATE tbl_adminlogin SET attempts=0,loginDate=now() WHERE admin_user=?").addEntity(AdminLogin.class);
    	query.setParameter(0, admin_user);
    	query.executeUpdate();
		
	}

    //锁定帐号
    @Transactional(readOnly=false)
	public void lock(String admin_user) {
    	query = sessionFactory.getCurrentSession().
    			createSQLQuery("UPDATE tbl_adminlogin SET locked=1 WHERE admin_user=?").addEntity(AdminLogin.class);
    	query.setParameter(0, admin_user);
    	query.executeUpdate();
	}

}
