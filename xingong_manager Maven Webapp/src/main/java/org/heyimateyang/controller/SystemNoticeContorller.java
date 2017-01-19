package org.heyimateyang.controller;


import org.heyimateyang.interceptor.AuthPassport;
import org.heyimateyang.interceptor.Jurisdictport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @Description 发布公告控制器
 * @author heyimateyang
 *
 */

@Controller
public class SystemNoticeContorller {
	
	
	//跳转发布公告
	@RequestMapping(value = "/sendNotice")
	@AuthPassport
	@Jurisdictport
	public String add_Notice(){
		return "/AdminWeb/AdminNotice";
	}
	
	//权限控制
	@RequestMapping(value = "/Juristion")
	@AuthPassport
	public String Juristion(){
		return "/AdminWeb/Jurisdiction";
	}

}
