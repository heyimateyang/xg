package org.heyimateyang.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.heyimateyang.dao.ISystemNoticeDao;
import org.heyimateyang.escape.EscapeUnitl;
import org.heyimateyang.model.SystemNotice;
import org.heyimateyang.service.SystemNoticeService;
import org.heyimateyang.unit.StringEscapeUtilsTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 * @Description 公告业务逻辑实现
 * @author heyimateyang
 *
 */
@Repository("SystemNoticeServiceImpl")
public class SystemNoticeServiceImpl implements SystemNoticeService,Serializable{

	private static final long serialVersionUID = 3386525144471933648L;

	@Autowired
	private ISystemNoticeDao systemNoticeDao;
	@Autowired
	private EscapeUnitl escapeUnitl;
	@Autowired
	private StringEscapeUtilsTools stringEscapeUtilsTools;
	
	public SystemNotice add_Notice(String notice_message, String notice_name) {
		
		//过滤处理
		List<String> list =null;
		try {
			list = escapeUnitl.escapeUnitl(notice_message, notice_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		notice_message = list.get(0);
		notice_name = list.get(0);
		
		//转义处理
		notice_message = stringEscapeUtilsTools.HTML_ESCAPE(notice_message);
		notice_name = stringEscapeUtilsTools.HTML_ESCAPE(notice_name);
		
		//创建对象
		SystemNotice systemNotice = new SystemNotice();
		//存入对象
		systemNotice.setNotice_message(notice_message);
		systemNotice.setNotice_name(notice_name);
		systemNotice.setSystemNotice_data(new Date());
		
		if(this.systemNoticeDao.add_Notice(systemNotice)==0){
			return null;
		}else{
			return systemNotice;
		}
	}

}
