package org.heyimateyang.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.heyimateyang.ajax.AjaxEmail;
import org.heyimateyang.service.SystemEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Description 发送邮件
 * @version 1.0
 * @author heyimateyang
 *
 */

@Controller
public class Contorller {
	
	@Autowired
	private SystemEmailService systemEmailService;
	
	public void setSystemEmailService(SystemEmailService systemEmailService) {
		this.systemEmailService = systemEmailService;
	}

	@RequestMapping(value = "/ajax" , method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> sendEmail(@ModelAttribute AjaxEmail ajaxEmail ,HttpServletRequest request,HttpServletResponse response) throws Exception{
		systemEmailService.SendEmail(ajaxEmail.getSendName(), 
				ajaxEmail.getSendEmail(), ajaxEmail.getEmailMessage());
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("msg", "成功");  
        return map;  
	}
	
	
}
	
	

