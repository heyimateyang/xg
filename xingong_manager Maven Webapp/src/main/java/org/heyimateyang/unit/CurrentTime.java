package org.heyimateyang.unit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * @Description 获取当前时间
 * @version 1.0版本
 * @author heyimatyang
 *
 */
public class CurrentTime {
	
	public String TimeMessage(){
		Date dt=new Date();//如果不需要格式,可直接用dt,dt就是当前系统时间
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置显示格式
		String nowTime="";
		nowTime= df.format(dt);//yyyy/MM/dd HH:mm:ss格式显示
		System.out.println(dt);
		Date d  = new java.util.Date();
		System.out.println(new Date());
		return nowTime;
	}
	
	@Test
	public void StringTime(){
		String timeDate = TimeMessage();
		System.out.println(timeDate);
	}

}
