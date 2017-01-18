package org.heyimateyang.unit;

import org.apache.commons.lang.StringEscapeUtils;
import org.junit.Test;
import org.springframework.stereotype.Repository;


/**
 * @Description Java字符转义工具类
 * @Description (SQL,XML,HTML)
 * @version 1.0版本
 * @author heyimateyang
 *
 */


@Repository("StringEscapeUtilsTools")
public class StringEscapeUtilsTools {
	
	
	//防SQL注入
	public String SQL_ESCAPE(String url){
		String URL = StringEscapeUtils.escapeSql(url);
		return URL;
	}
	
	//转义HTML
	public String HTML_ESCAPE(String html){
		String HTML = StringEscapeUtils.escapeHtml(html);
		return HTML;
	}
	//反转义HTML
	public String HTML_UNESCAPEHTML(String html){
		String HTML = StringEscapeUtils.unescapeHtml(html);
		return HTML;
	}
	
	//转义XML
	public String XML_ESCAPE(String xml){
		return StringEscapeUtils.escapeXml(xml);
	}
	//反转义XML
	public String XML_UNESCAPE(String xml){
		return StringEscapeUtils.unescapeXml(xml);
	}
	
	
	//转成Unicode编码	
	public String Escape_Java(String escape){
		return StringEscapeUtils.escapeJava(escape);
	}
	
	@Test
	public void Test_HTML(){
		StringEscapeUtilsTools escapeUtilsTools = new StringEscapeUtilsTools();
		System.out.println(escapeUtilsTools.HTML_ESCAPE("andy"));
	}

}
