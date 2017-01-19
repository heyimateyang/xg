package org.heyimateyang.controller;

import org.heyimateyang.interceptor.AuthPassport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Description 管理员控制器
 * @author heyimateyang
 *
 */


@Controller
public class AdminContorller {
	
	//跳转发布公告
	@RequestMapping(value = "/updateAdminMessage")
	@AuthPassport
	public String add_Notice(){
		return "/AdminWeb/AdminUpdateMessage";
	}

}
