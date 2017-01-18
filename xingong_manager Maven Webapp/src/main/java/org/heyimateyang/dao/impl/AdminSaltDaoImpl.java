package org.heyimateyang.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.heyimateyang.dao.IAdminSaltDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("adminSaltDaoImpl")
public class AdminSaltDaoImpl  implements IAdminSaltDao , Serializable{
	private static final long serialVersionUID = -7408661961427167510L;
	
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
	public String find_admin_salt(int id) {
    	query = (Query) sessionFactory.getCurrentSession().
				createQuery("select admin_salt from AdminSalt where admin_saltId = ?");
    	query.setParameter(0, id);
		return (String) query.uniqueResult();
	}
    
    @Test
    public void TestYang(){
    	AdminSaltDaoImpl adminSaltDao = new AdminSaltDaoImpl();
    	adminSaltDao.find_admin_salt(1);
    }

}
