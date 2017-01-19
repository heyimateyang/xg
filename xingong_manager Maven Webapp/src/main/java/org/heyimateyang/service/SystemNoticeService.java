package org.heyimateyang.service;

import org.heyimateyang.model.SystemNotice;


/**
 * @Description 公告业务逻辑接口
 * @author heyimateyang
 *
 */

public interface SystemNoticeService{
	
	//发布公告
	public SystemNotice add_Notice(String notice_message,String notice_name);

}
