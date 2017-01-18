package org.heyimateyang.interceptor;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @Description 注解类
 * @Description 用于验证表单非空
 * @version 1.0版本
 * @author heyimateyang
 *
 */

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthPassport {
	
	 boolean validate() default true;

}
