package org.heyimateyang.email;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Date;
import java.util.Properties;

import org.junit.Test;
import org.springframework.stereotype.Repository;

/**
 * @Description 发送只带文本的邮件
 * @version 1.0
 * @return message
 * @author heyimateyang
 *
 */


@Repository("SendEmail")
public class SendEmailUnitl {
	
	
	//传入七个参数,分别是邮箱帐号,邮箱验证码,邮箱服务器地址,发件人名字,发件人邮箱,主题,内容
	public void EmailServer(String EmailAccount,
			String EmailPassword,String EmailSMTPHost,
			String sendName,String sendEmail,String title,String content) throws Exception{
		
		//创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();                     // 参数配置
        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.host", EmailSMTPHost);         // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");          // 请求认证，参数名称与具体实现有关
        
        //根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);                             //设置为debug模式查看详细的发送 log

        //创建一封邮件
        MimeMessage message = createMimeMessage(session, EmailAccount, 
        		EmailAccount,sendName,sendEmail,title,content);
        //根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();
        //使用 邮箱账号 和 密码 连接邮件服务器
        //认证的邮箱必须与 message 中的发件人邮箱一致，否则报错
        transport.connect(EmailAccount, EmailPassword);
        //发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());
        //关闭连接
        transport.close();
	}
	
	 /**
     * 创建一封只包含文本的简单邮件
     *
     * @param session 和服务器交互的会话
     * @param sendMail 发件人邮箱
     * @param receiveMail 收件人邮箱
     * @param sendName 发件人名字
     * @return
     * @throws Exception
     */
	public static MimeMessage createMimeMessage(Session session, 
			String EmailAccount, String receiveAccount,
			String sendName,String sendEmail,String title,String content) throws Exception {
		
		//创建一封邮件
        MimeMessage message = new MimeMessage(session);
        //From: 发件人
        message.setFrom(new InternetAddress(EmailAccount, sendName, "UTF-8"));
        //To: 收件人
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveAccount, EmailAccount, "UTF-8"));
        //Subject: 邮件主题
        message.setSubject(title, "UTF-8");
        //Content: 邮件正文（可以使用html标签）
        message.setContent(content, "text/html;charset=UTF-8");
        //设置发件时间
        message.setSentDate(new Date());
        //保存设置
        message.saveChanges();
		return message;
	}
	
	@Test
	public void Test_email() throws Exception{
	}

}
