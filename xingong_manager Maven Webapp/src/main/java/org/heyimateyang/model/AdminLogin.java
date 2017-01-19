package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;



/**
 * 
 * @author heyimateyang
 * @Description 管理员登录信息model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_adminlogin")
public class AdminLogin implements Serializable{

	private static final long serialVersionUID = -2040417826886969777L;
	
	private int admin_loginId;					//表Id
	@NotEmpty(message = "登录帐号不能为空")
	private String admin_user;				   //管理员名字
	@NotEmpty(message = "登录密码不能为空")
	private String admin_password;			   //管理员密码
	private int locked;                       //帐号状态1为锁住
	private int attempts;					 //登录次数
	private Date loginDate;					//记录最后一次登录时间
	private Jurisdiction jurisdiction;		 //一对多映射关系,对应权限model
	private AdminSalt adminSalt;		    //一对一映射关系,对应随机盐model
	private AdminMessage adminMessage;	   //一对多映射关系,对应管理员信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getAdmin_loginId() {
		return admin_loginId;
	}
	public void setAdmin_loginId(int admin_loginId) {
		this.admin_loginId = admin_loginId;
	}
	
	@Column(nullable = false)
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	
	@Column(nullable = false)
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	
	@Column(nullable = false)
	public int getLocked() {
		return locked;
	}
	public void setLocked(int locked) {
		this.locked = locked;
	}
	
	@Column(nullable = false)
	public String getAdmin_user() {
		return admin_user;
	}
	public void setAdmin_user(String admin_user) {
		this.admin_user = admin_user;
	}
	
	@Column(nullable = false)
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
	//急加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)    //多对一关系共享主键映射,对权限表
	@JoinColumn(name = "jurisdiction_Id") 
	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	
	//使用急加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)    //多对一关系共享主键映射,对权限表
    @JoinColumn(name = "admin_saltId")
	public AdminSalt getAdminSalt() {
		return adminSalt;
	}
	public void setAdminSalt(AdminSalt adminSalt) {
		this.adminSalt = adminSalt;
	}
	
	//急加载,牺牲性能,但是做到了我想要的效果
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)    //多对一关系共享主键映射,对管理员model
	@JoinColumn(name = "admin_messageId") 
	public AdminMessage getAdminMessage() {
		return adminMessage;
	}
	public void setAdminMessage(AdminMessage adminMessage) {
		this.adminMessage = adminMessage;
	}

}
