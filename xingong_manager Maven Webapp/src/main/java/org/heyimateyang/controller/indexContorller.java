package org.heyimateyang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 
 * @Description 发送邮件
 * @Description Ajax异步提交
 * @Description 跳转到默认首页
 * @version 1.0
 * @author heyimateyang
 *
 */

@Controller
public class indexContorller {
	
	
	/***
	 * 
	 * @Description 创建Email对象传到页面表达式
	 * @return String
	 */
	@RequestMapping(value = "/index" , method = RequestMethod.GET)
	public String index(){
		return "index"; 
	}
}
