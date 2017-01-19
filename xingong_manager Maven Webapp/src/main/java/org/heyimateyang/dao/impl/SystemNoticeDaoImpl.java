package org.heyimateyang.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.heyimateyang.dao.ISystemNoticeDao;
import org.heyimateyang.model.SystemNotice;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Description 系统公告实现接口
 * @author heyimateyang
 *
 */

@Repository("SystemNoticeDaoImpl")
public class SystemNoticeDaoImpl implements ISystemNoticeDao,Serializable{
	
	private static final long serialVersionUID = -6318387078941130217L;
	
	@Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Transactional
	public int add_Notice(SystemNotice systemNotice) {
    	if(this.sessionFactory.getCurrentSession().save(systemNotice)==null){
    		return 0;
    	}else{
    		return 1;
    	}
		
	}

}
