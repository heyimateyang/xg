package org.heyimateyang.controller;

import javax.servlet.http.HttpSession;

import org.heyimateyang.interceptor.AuthPassport;
import org.heyimateyang.model.SystemEmail;
import org.heyimateyang.service.SystemEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class UpdateEmailContorller {
	
	@Autowired
	private SystemEmailService systemEmailService;
	
	public void setSystemEmailService(SystemEmailService systemEmailService) {
		this.systemEmailService = systemEmailService;
	}
	
	/**
	 * @Description  Ajax异步修改邮箱
	 * @version 1.0
	 * @param systemEmail
	 * @return systemEmail
	 */
	@RequestMapping(value="/kvsource",method = RequestMethod.GET)
	@AuthPassport
	public @ResponseBody  SystemEmail kvsource ( SystemEmail systemEmail,HttpSession session){
		String system_email = systemEmail.getSystem_email();
		String system_emailPwd = systemEmail.getSystem_emailPwd();
		String email_server = systemEmail.getEmail_server();
		
		systemEmail.setSystem_email(system_email);
		systemEmail.setEmail_server(email_server);
		systemEmail.setSystem_emailPwd(system_emailPwd);
		//更新邮箱信息
	    this.systemEmailService.updateEmail(systemEmail);
		return systemEmail;
	}
	

}
