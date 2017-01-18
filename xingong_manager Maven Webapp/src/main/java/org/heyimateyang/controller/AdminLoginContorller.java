package org.heyimateyang.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.heyimateyang.interceptor.AuthPassport;
import org.heyimateyang.model.AdminLogin;
import org.heyimateyang.model.SystemEmail;
import org.heyimateyang.service.AdminLoginService;
import org.heyimateyang.service.SystemEmailService;
import org.heyimateyang.unit.Base64Unitl;
import org.heyimateyang.unit.CaptchaUtil;
import org.heyimateyang.unit.GETIP_Unitl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Description 设置默认首页
 * @Description 管理员登录等功能
 * @author heyimateyang
 *
 */

@Controller
@RequestMapping("/*")
public class AdminLoginContorller {
	
	@Autowired
	private AdminLoginService adminLoginService;
	@Autowired
	private GETIP_Unitl getip_Unitl;
	@Autowired
	private SystemEmailService systemEmailService;
	@Autowired
	private Base64Unitl base64Unitl;

	public void setBase64Unitl(Base64Unitl base64Unitl) {
		this.base64Unitl = base64Unitl;
	}

	public void setSystemEmailService(SystemEmailService systemEmailService) {
		this.systemEmailService = systemEmailService;
	}

	public void setGetip_Unitl(GETIP_Unitl getip_Unitl) {
		this.getip_Unitl = getip_Unitl;
	}

	public void setAdminLoginService(AdminLoginService adminLoginService) {
		this.adminLoginService = adminLoginService;
	}

	/***
	 * 
	 * @Description 创建adminLogin对象传到页面表达式
	 * @return String
	 */
	@RequestMapping(value = "/AdminLogin" , method = RequestMethod.GET)	
	public String AdminLoginModel(Model model){
		if(!model.containsAttribute("adminLogin")){
            model.addAttribute("adminLogin", new AdminLogin());
        }
		return "AdminLogin"; 
	}
	
	/***
	 * 
	 * @Description 管理员登录,实现转义过滤字符,
	 * @Description 获取客户端IP,页面验证码
	 * @Description 服务器端非空验证
	 * @return String
	 */
	@RequestMapping(value = "/Login" , method = RequestMethod.POST)
	public String LoginAdmin(HttpServletRequest request
			, HttpServletResponse response, Model model,
			@Valid @ModelAttribute("adminLogin")AdminLogin AdminLogin,SystemEmail systemEmail,
			BindingResult result,HttpSession session, 
			@RequestParam(value = "admin_user", required = false)String admin_user,
			@RequestParam(value = "admin_password", required = false)String admin_password,
			@RequestParam(value = "captcha", required = false)String captcha,
			@RequestParam(value = "level_id", required = false)String level_id
			)throws NoSuchAlgorithmException{
		//读取登录客户端的IP地址
		String ip = getip_Unitl.getIp2(request);
		//从session获取验证码
		String random_String = session.getAttribute("randomString").toString();
		if(result.hasErrors()){
			return AdminLoginModel(model);
		}else if (level_id.equals("1")) {
			
		}else if(level_id.equals("2")){
			//添加一次登录次数
			adminLoginService.add_attempts(admin_user);
			
			if(captcha.toString()==""){
				request.setAttribute("error", "验证码不能为空");
				return "AdminLogin";
			}if(captcha.toString().equals(random_String)==false){
				request.setAttribute("error", "验证码错误");
				return "AdminLogin";
			}
			AdminLogin = adminLoginService.login_admin(admin_user, admin_password,ip);
			if(AdminLogin==null ){
				request.setAttribute("error", "帐号或密码输入错误");
				return "AdminLogin";
			}else if(AdminLogin!=null && captcha.toString().equals(random_String.toString())){
				
				if(AdminLogin.getLocked()==1){
					request.setAttribute("error", "该帐号已被锁定,请联系管理员解锁");
					return "AdminLogin";
				}else{
					//存入管理员信息session	
					session.setAttribute("adminMessage", AdminLogin);				
					return "redirect:/Login_Ok";
				}					
			}

		}else if (level_id.equals("3")) {
			System.out.println("辅导员");
		}else if (level_id.equals("4")) {
			System.out.println("辅导员助理");
		}
		
		return null;
	}
	
	/**
	 * @Description 暂时解决方案 解决重复登录问题
	 * @version 1.0版本
	 * @return String
	 */
	@SuppressWarnings("static-access")
	@RequestMapping(value = "/Login_Ok" )
	@AuthPassport
	public String OkContorller(SystemEmail systemEmail,HttpSession session){
		//读取系统默认邮箱信息
		systemEmail = this.systemEmailService.findSystemEmail();
		session.setAttribute("Email", systemEmail);
	    //解密邮箱验证码
		String emailPwd = base64Unitl.getFromBase64(systemEmail.getSystem_emailPwd());
		session.setAttribute("EmailPwd", emailPwd);
		return "redirect:/AdminLoginIndex";
	}
	
	
	/**
	 * 
	 * @Description 暂时解决方案 解决重复登录问题
	 * @version 1.0版本
	 * @return String
	 */
	@RequestMapping(value = "/AdminLoginIndex")
	@AuthPassport
	public String OkContorller(){
		return "/AdminWeb/AdminIndex";
	}
	
	
	/**
	 * 
	 * @Description 页面生成验证码图片
	 * @version 1.0版本
	 * @return void
	 */
	@RequestMapping(value = "/captcha", method = RequestMethod.GET)
    @ResponseBody
    public void captcha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CaptchaUtil.outputCaptcha(request, response);
    }
	

}
