package org.heyimateyang.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @Description 系统信息记录
 * @Description 
 * @version 1.0
 * @author heyimateyang
 *
 */


@Entity
@Table(name = "tbl_systememail")
public class SystemEmail implements Serializable{
	
	private static final long serialVersionUID = -6872942707931352766L;
	
	private int system_emailId;			//表ID
	private String system_email;	   //系统自带邮箱地址
	private String system_emailPwd;   //密码
	private String email_server;     //邮箱服务器地址
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getSystem_emailId() {
		return system_emailId;
	}
	public void setSystem_emailId(int system_emailId) {
		this.system_emailId = system_emailId;
	}
	
	@Column(nullable = false)
	public String getSystem_email() {
		return system_email;
	}
	public void setSystem_email(String system_email) {
		this.system_email = system_email;
	}
	
	@Column(nullable = false)
	public String getSystem_emailPwd() {
		return system_emailPwd;
	}
	public void setSystem_emailPwd(String system_emailPwd) {
		this.system_emailPwd = system_emailPwd;
	}  
	
	
	@Column(nullable = false)
	public String getEmail_server() {
		return email_server;
	}
	public void setEmail_server(String email_server) {
		this.email_server = email_server;
	}
	
	
	
	
}
