package org.heyimateyang.service.impl;

import org.heyimateyang.dao.ISystemEmailDao;
import org.heyimateyang.email.SendEmailUnitl;
import org.heyimateyang.model.SystemEmail;
import org.heyimateyang.service.SystemEmailService;
import org.heyimateyang.unit.Base64Unitl;
import org.heyimateyang.unit.StringEscapeUtilsTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("SystemEmailServiceImpl")
public class SystemEmailServiceImpl implements SystemEmailService{
	
	@Autowired
	private ISystemEmailDao systemEmailDao;
	@Autowired
	private SendEmailUnitl sendEmailUnitl;
	@Autowired
	private Base64Unitl base64Unitl;
	
	//转义工具类
	@Autowired
	private StringEscapeUtilsTools escapeUtilsTools;
	

	public void setBase64Unitl(Base64Unitl base64Unitl) {
		this.base64Unitl = base64Unitl;
	}

	public void setSystemEmailDao(ISystemEmailDao systemEmailDao) {
		this.systemEmailDao = systemEmailDao;
	}

	public void setSendEmailUnitl(SendEmailUnitl sendEmailUnitl) {
		this.sendEmailUnitl = sendEmailUnitl;
	}
	
	//发送邮件
	@SuppressWarnings("static-access")
	public void SendEmail(String sendName,String title,String content) throws Exception {
		
		//读取资料
		SystemEmail systemEmail = systemEmailDao.readSystemMessage();
		//解密
		String basePWS = base64Unitl.getFromBase64(systemEmail.getSystem_emailPwd());
		//调用工具类发送
		sendEmailUnitl.EmailServer(systemEmail.getSystem_email(), 
				basePWS, systemEmail.getEmail_server(), 
				sendName, systemEmail.getSystem_email(), title, content);	
	}
	
	
	//查询系统默认邮箱信息
	public SystemEmail findSystemEmail() {
		SystemEmail systemEmail = systemEmailDao.readSystemMessage();
		return systemEmail;
	}

	//修改邮箱设置
	public void updateEmail(SystemEmail systemEmail) {
	  
	   //转义过滤处理
	   SystemEmail email = new SystemEmail();
	   email.setEmail_server( escapeUtilsTools.HTML_ESCAPE(systemEmail.getEmail_server()));
	   email.setSystem_email(escapeUtilsTools.HTML_ESCAPE(systemEmail.getSystem_email()));
	   //密码加密
	   email.setSystem_emailPwd(Base64Unitl.getBase64(systemEmail.getSystem_emailPwd()));
	   
	   this.systemEmailDao.updateEmail(email);
	}

}
