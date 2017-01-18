package org.heyimateyang.escape;

import java.util.ArrayList;
import java.util.List;

import org.heyimateyang.unit.HtmlUtils;
import org.heyimateyang.unit.StringEscapeUtilsTools;
import org.springframework.stereotype.Repository;



/**
 * @Description 转义和过滤字符
 * @Description 公用类
 * @version 1.0版本
 * @author heyimateyang
 * @return List
 */

@Repository("escapeUnitlImpl")
public class EscapeUnitlImpl implements EscapeUnitl{
	
	private HtmlUtils htmlUtils = new HtmlUtils();
	private StringEscapeUtilsTools 
		stringEscapeUtilsTools = new StringEscapeUtilsTools();

	public List<String> escapeUnitl(String loginName, 
			String loginPassword) throws Exception{
		
		loginName = htmlUtils.htmltoText(loginName);
		loginPassword = htmlUtils.htmltoText(loginPassword);
		
		loginName = stringEscapeUtilsTools.HTML_ESCAPE(loginName);
		loginPassword = stringEscapeUtilsTools.HTML_ESCAPE(loginPassword);
		
		List<String> list = new ArrayList<String>();  
		list.add(loginName);  
		list.add(loginPassword);
		return list;
	}
	
	/*@Test
	public void String_unitl(){
		String a = "3232sd";
		String b = "123"; 
		EscapeUnitl escapeUnitl = new EscapeUnitlImpl();
		List<String> arr = escapeUnitl.escapeUnitl(a, b);
		//System.out.println(arr);
		String loginName = arr.get(0);
		System.out.println(loginName);
		String loginPassword = null;
		for (int i = 1; i < arr.size(); i++) {
			
			
		}
	}*/
	
	
	

}
