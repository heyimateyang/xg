package org.heyimateyang.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.heyimateyang.ajax.AjaxEmail;
import org.heyimateyang.service.SystemEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @Description 发送邮件
 * @Description Ajax异步提交
 * @version 1.0
 * @author heyimateyang
 *
 */

@Controller
public class SendEmailContorller {
	
	@Autowired
	private SystemEmailService systemEmailService;
	
	public void setSystemEmailService(SystemEmailService systemEmailService) {
		this.systemEmailService = systemEmailService;
	}

	/**
	 * @Description 实现异步提交
	 * @param ajaxEmail
	 * @throws Exception
	 */
	@RequestMapping(value = "/SendEmail" , method = RequestMethod.GET)
	public @ResponseBody void sendEmail(HttpServletRequest request
			, HttpServletResponse response, Model model,
			@ModelAttribute AjaxEmail ajaxEmail,
			BindingResult result) throws Exception{
		
		systemEmailService.SendEmail(ajaxEmail.getSendName(), 
				ajaxEmail.getSendEmail(), ajaxEmail.getEmailMessage());	
	}
	
	
}
	
	

