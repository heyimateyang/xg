package org.heyimateyang.dao;

import org.heyimateyang.model.SystemNotice;

/**
 * @Description 系统公告接口
 * @author heyimateyang
 *
 */

public interface ISystemNoticeDao {
	
	//发布公告
	public int add_Notice(SystemNotice systemNotice);

}
