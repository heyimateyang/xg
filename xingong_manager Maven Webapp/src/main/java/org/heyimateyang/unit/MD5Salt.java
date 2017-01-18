package org.heyimateyang.unit;

import org.junit.Test;


/**
 * @Description Md5加盐
 * @version 1.0版本
 * @author heyimateyang
 *
 */

public class MD5Salt {
	
	private MD5_Unilt md5_Unilt = new MD5_Unilt();
	
	public String md5_salt(String loginPassword,String passowrd_salt){
		//System.out.println(loginPassword);
		//System.out.println(passowrd_salt);
		String salte 
			= loginPassword + passowrd_salt;
		salte = md5_Unilt.MD5(salte);
		return salte;
	}
	
	@Test
	public void salteTest(){
		System.out.println(md5_salt("123", "4681D0D2CEFE9CD61D114BDF99DA80A1"));
	}

}
