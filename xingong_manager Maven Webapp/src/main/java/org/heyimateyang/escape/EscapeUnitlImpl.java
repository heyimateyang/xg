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

}
