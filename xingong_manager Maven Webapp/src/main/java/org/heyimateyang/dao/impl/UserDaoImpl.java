package org.heyimateyang.dao.impl;

import javax.annotation.Resource;

import org.heyimateyang.dao.UserDao;
import org.heyimateyang.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
	
	
	@Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

	public void add(User user) {
		this.sessionFactory.getCurrentSession().save(user);
		
	}
	
	

}
