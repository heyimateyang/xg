package org.heyimateyang.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @Description Token锁,判断唯一提交
 * @version 1.0版本
 * @author heyimateyang
 *
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Token {
	
	 boolean save() default false;

	 boolean remove() default false;
}
