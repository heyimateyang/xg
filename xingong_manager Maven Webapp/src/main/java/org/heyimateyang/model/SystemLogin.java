package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author heyimateyang
 * @Description 系统登录人员记录model
 * @Description 实现Serializable接口实现序列化
 */


@Entity
@Table(name = "tbl_systemlogin")
public class SystemLogin implements Serializable{

	private static final long serialVersionUID = 2843976617707235556L;
	
	private int system_loginId;      //表id
	private String login_ip;		//登录IP
	private Date login_data;	   //登录日期
	private String login_user;	  //登录人帐号
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getSystem_loginId() {
		return system_loginId;
	}
	public void setSystem_loginId(int system_loginId) {
		this.system_loginId = system_loginId;
	}
	
	@Column(nullable = false)    //非空设置
	public String getLogin_ip() {
		return login_ip;
	}
	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}
	
	@Column(nullable = false)    //非空设置
	public Date getLogin_data() {
		return login_data;
	}
	public void setLogin_data(Date login_data) {
		this.login_data = login_data;
	}
	
	@Column(nullable = false)    //非空设置
	public String getLogin_user() {
		return login_user;
	}
	public void setLogin_user(String login_user) {
		this.login_user = login_user;
	}
	
	

}
