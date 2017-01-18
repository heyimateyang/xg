package org.heyimateyang.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.heyimateyang.dao.ISystemLoginDao;
import org.heyimateyang.model.SystemLogin;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 获取IP实现接口
 * @author heyimateyang
 *
 */

@Repository("SystemLoginDaoImpl")
public class SystemLoginDaoImpl implements ISystemLoginDao,Serializable{
	
	private static final long serialVersionUID = 8920217664909662239L;
	
	@Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

	@Transactional
	public void addIp(SystemLogin systemLogin) {
		this.sessionFactory.getCurrentSession().save(systemLogin);
	}

}
