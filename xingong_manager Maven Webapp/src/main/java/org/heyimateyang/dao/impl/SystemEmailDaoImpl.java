package org.heyimateyang.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.heyimateyang.dao.ISystemEmailDao;
import org.heyimateyang.model.SystemEmail;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("SystemEmailDaoImpl")
public class SystemEmailDaoImpl implements ISystemEmailDao,Serializable{

	private static final long serialVersionUID = 137425707745494125L;
	
	private Query query;

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
    
    
    //查询系统邮箱
    @Transactional(readOnly = true)
	public SystemEmail readSystemMessage() {
    	query = sessionFactory.
    			getCurrentSession().createQuery("from SystemEmail");
		return (SystemEmail) query.uniqueResult();
	}

    
    //更新邮箱设置
    @Transactional(readOnly = false)
	public void updateEmail(SystemEmail systemEmail) {
    	query = sessionFactory.getCurrentSession().
    			createSQLQuery("UPDATE tbl_systememail SET email_server=?,system_email=?,system_emailPwd=? WHERE system_emailId=1").addEntity(SystemEmail.class);
    	query.setParameter(0, systemEmail.getEmail_server());
    	query.setParameter(1, systemEmail.getSystem_email());
    	query.setParameter(2, systemEmail.getSystem_emailPwd());
    	query.executeUpdate();
	}

}
