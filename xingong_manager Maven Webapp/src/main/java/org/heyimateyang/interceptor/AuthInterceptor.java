package org.heyimateyang.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * @Description 登录拦截器
 * @Description 基于session会话验证
 * @version 1.0版本
 * @author heyimateyang
 *
 */

public class AuthInterceptor extends HandlerInterceptorAdapter{
	
	private static final String SESSION_ADMIN = "adminMessage";
	
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler) throws Exception {
		
		@SuppressWarnings("deprecation")
		Object object = request.getSession().getValue(SESSION_ADMIN);
		
		if(handler.getClass().isAssignableFrom(HandlerMethod.class)){
			//获取注解类
			AuthPassport authPassport = ((HandlerMethod) handler)
					.getMethodAnnotation(AuthPassport.class);
			//没有声明权限情况下放行
			if(authPassport == null || authPassport.validate() == false){
				return true;
			}else{
				//根据session 值进行判断,没登录返回首页
				if(object == null){
					
					response.sendRedirect(request.getContextPath() + "/index.do");
					return false;
				}
				
			}
		}
		return true;
	}
}

