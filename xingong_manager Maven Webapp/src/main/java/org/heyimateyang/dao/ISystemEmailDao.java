package org.heyimateyang.dao;

import org.heyimateyang.model.SystemEmail;


/**
 * @Description 读取系统信息
 * @version 1.0
 * @author heyimateyang
 *
 */

public interface ISystemEmailDao {

	//获取系统邮箱
	public SystemEmail readSystemMessage();
	
	//修改邮箱信息
	public void updateEmail(SystemEmail systemEmail);
}
