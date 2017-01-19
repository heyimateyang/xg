package org.heyimateyang.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.heyimateyang.model.AdminLogin;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



/**
 * @Description 发布系统公告权限拦截器
 * @version 1.0版本
 * @author heyimateyang
 *
 */

public class Jurisdictioninterceptor extends HandlerInterceptorAdapter{

	@SuppressWarnings("deprecation")
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler) throws Exception {
		
		//获取管理员角色
		AdminLogin adminLogin = (AdminLogin) request.getSession().getValue("adminMessage");
		
		if(handler.getClass().isAssignableFrom(HandlerMethod.class)){
			//获取注解类
			Jurisdictport jurisdictport = ((HandlerMethod) handler)
					.getMethodAnnotation(Jurisdictport.class);
			//没有声明权限情况下放行
			if(jurisdictport == null || jurisdictport.validate() == false){
				
				return true;
			}else{
				//根据adminMessage对象值进行判断
				if(adminLogin.getJurisdiction().getAdd_systemmessage()==0){
					//权限不足后跳转的地方
					response.sendRedirect(request.getContextPath() + "/Juristion");
					return false;
				}else{
					//权限足够返回请求页面
					return true;
				}
				
			}
		}
		
		return true;
	}

}
