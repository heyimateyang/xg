package org.heyimateyang.service;

import org.heyimateyang.model.SystemEmail;


/**
 *
 * @param session 和服务器交互的会话
 * @param sendMail 发件人邮箱
 * @param receiveMail 收件人邮箱
 * @param sendName 发件人名字
 * @return int
 */
public interface SystemEmailService {
	
	public void SendEmail(String sendName,String title,String content)throws Exception;
	
	public SystemEmail findSystemEmail();
	
	//修改邮箱信息
	public void updateEmail(SystemEmail systemEmail);
}
