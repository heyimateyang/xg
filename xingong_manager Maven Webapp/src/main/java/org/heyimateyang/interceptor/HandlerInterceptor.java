package org.heyimateyang.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

/**
 * @Description 拦截器接口
 * @author heyimateyang
 * @preHandle 执行action里面的处理逻辑之前执行，返回的是boolean
 * @postHandle 在执行action里面的逻辑后返回视图之前执行
 * @afterCompletion 在action返回视图后执行
 */
public interface HandlerInterceptor {  
    boolean preHandle(  
            HttpServletRequest request, HttpServletResponse response,   
            Object handler)   
            throws Exception;  
  
    void postHandle(  
            HttpServletRequest request, HttpServletResponse response,   
            Object handler, ModelAndView modelAndView)   
            throws Exception;  
  
    void afterCompletion(  
            HttpServletRequest request, HttpServletResponse response,   
            Object handler, Exception ex)  
            throws Exception;  
}
