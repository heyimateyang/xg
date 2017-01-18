package org.heyimateyang.dao;

/**
 * @Description 管理员随机盐
 * @Description 查找随机盐
 * @author heyimateyang
 *
 */

public interface IAdminSaltDao {
	
	//按id查找密码
	public String find_admin_salt(int id);

}
