package org.heyimateyang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Description 注销控制
 * @Description 所有注销登录都在这个Controller上完成
 * @author heyimateyang
 * @return index
 *
 */

@Controller
public class RemoveSessionController {

	@RequestMapping(value = "/RemoveAdmin")	
	public String exeitAdminLogin(HttpServletRequest request
			, HttpServletResponse response,HttpSession session){
		
		//移除当前用户登录状态
		session.removeAttribute("adminMessage");
		session.removeAttribute("Email");
		return "index";
	}
}
