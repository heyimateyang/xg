package org.heyimateyang.escape;

import java.util.List;

/**
 * @Description 转义和过滤字符
 * @Description 接口,方便将来重写多参数进行转义
 * @version 1.0版本
 * @author heyimateyang
 * 
 */


public interface EscapeUnitl {
	
	public List<String> escapeUnitl(String loginName 
			, String loginPassword) throws Exception;

}
