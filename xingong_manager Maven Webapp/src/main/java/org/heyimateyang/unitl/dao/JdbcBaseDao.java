package org.heyimateyang.unitl.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author heyimateyang
 * 
 */
public class JdbcBaseDao extends JdbcDaoSupport {

	@Resource(name = "DataSource")
	public void setDS(DataSource dataSource) {
		setDataSource(dataSource);
	}

}
