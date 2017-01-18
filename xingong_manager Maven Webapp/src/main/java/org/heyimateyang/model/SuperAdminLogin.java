package org.heyimateyang.model;

import java.io.Serializable;

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

/**
 * 
 * @author heyimateyang
 * @Description 超级管理员登录model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_superadminlogin")
public class SuperAdminLogin implements Serializable{
	private static final long serialVersionUID = -7531166493212397168L;
	
	private int super_adminloginId;							//表Id	
	private String super_adminuser;						   //超级管理员登录帐号
	private String super_adminpassword;					  //超级管理员登录密码
	private SuperAdminSalt superAdminSalt;				 //一对一映射关系,对应超级管理员随机盐model
	private SuperAdminMessage superAdminMessage;		//一对一映射关系,对应超级管理员信息model
	private Jurisdiction jurisdiction;				   //多对一映射关系,对应权限model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getSuper_adminloginId() {
		return super_adminloginId;
	}
	public void setSuper_adminloginId(int super_adminloginId) {
		this.super_adminloginId = super_adminloginId;
	}
	
	@Column()
	public String getSuper_adminuser() {
		return super_adminuser;
	}
	public void setSuper_adminuser(String super_adminuser) {
		this.super_adminuser = super_adminuser;
	}
	
	@Column()
	public String getSuper_adminpassword() {
		return super_adminpassword;
	}
	public void setSuper_adminpassword(String super_adminpassword) {
		this.super_adminpassword = super_adminpassword;
	}
	
	//使用懒加载
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //一对一关系共享主键映射,对超级管理员随机盐model
    @JoinColumn(name = "super_adminsaltId")
	public SuperAdminSalt getSuperAdminSalt() {
		return superAdminSalt;
	}
	public void setSuperAdminSalt(SuperAdminSalt superAdminSalt) {
		this.superAdminSalt = superAdminSalt;
	}
	
	//使用懒加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //一对一关系共享主键映射,对辅导员信息表
    @JoinColumn(name = "super_AdminmessageId")
	public SuperAdminMessage getSuperAdminMessage() {
		return superAdminMessage;
	}
	public void setSuperAdminMessage(SuperAdminMessage superAdminMessage) {
		this.superAdminMessage = superAdminMessage;
	}
	

	//懒加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //多对一关系共享主键映射,对权限表
	@JoinColumn(name = "jurisdiction_Id")    
	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

}
