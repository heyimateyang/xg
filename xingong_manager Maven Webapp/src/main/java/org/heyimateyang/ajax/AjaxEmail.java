package org.heyimateyang.ajax;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * 
 * @Description 实现发送邮件异步服务
 * @version 1.0
 * @author heyimateyang
 *
 */

public class AjaxEmail {
	
	@NotEmpty(message = "发送人名字不能为空")
	private String SendName;
	@NotEmpty(message = "发送人邮箱不能为空")
	private String SendEmail;
	@NotEmpty(message = "邮件内容不能为空")
	private String emailMessage;
	
	
	public String getSendName() {
		return SendName;
	}
	public String getSendEmail() {
		return SendEmail;
	}
	public String getEmailMessage() {
		return emailMessage;
	}
	public void setSendName(String sendName) {
		SendName = sendName;
	}
	public void setSendEmail(String sendEmail) {
		SendEmail = sendEmail;
	}
	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}
	

}
