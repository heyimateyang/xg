package org.heyimateyang.unit;

import java.util.UUID;

import org.junit.Test;


/**
 * 生成全球唯一识别码
 * UUID
 * (随机盐)
 * @author heyimateyang
 *
 */

public class UUID_Unitl {
	
	/** 
     * 获得一个UUID 
     * @return String UUID 
     */ 
	public static String getUUID(){ 
        String s = UUID.randomUUID().toString(); 
        //去掉“-”符号 
        return s.substring(0,8)+s.substring(9,13)+
        		s.substring(14,18)+s.substring(19,23)+s.substring(24); 
    }
	
	/** 
     * 获得指定数目的UUID 
     * @param number int 需要获得的UUID数量 
     * @return String[] UUID数组 
     */ 
    public static String[] getUUID(int number){ 
        if(number < 1){ 
            return null; 
        } 
        String[] ss = new String[number]; 
        for(int i=0;i<number;i++){ 
            ss[i] = getUUID(); 
        } 
        return ss; 
    } 
    
    
    /**
     * 返回系统自动生成的UUID值
     * 
     * @return UUID
     */
    public String UUID_Number(){
    	String[] ss = getUUID(1); 
    	String UUID = null;
    	for(int i=0;i<ss.length;i++){ 
           
            UUID = ss[i];
        } 
    	return UUID;
    }
    
    @Test
    public void TestUUID(){
    	String[] ss = getUUID(1); 
    	String a = null;
    	for(int i=0;i<ss.length;i++){ 
            //System.out.println(ss[i]); 
            a = ss[i];
        } 
    	System.out.println(a);
    }

}
