package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author heyimateyang
 * @Description 超级管理员信息model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_superadminmessage")
public class SuperAdminMessage implements Serializable{

	private static final long serialVersionUID = -3604728844564783840L;
	
	private int super_AdminmessageId;
	private String super_adminname;
	private String super_adminportrait;            //超级管理员头像
	private String super_adminqq;
	private String super_adminwecat;
	private Set<SuperAdminLogin> superAdminLogin;	  //一对一映射关系,对应超级管理员登录信息model
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getSuper_AdminmessageId() {
		return super_AdminmessageId;
	}
	public void setSuper_AdminmessageId(int super_AdminmessageId) {
		this.super_AdminmessageId = super_AdminmessageId;
	}
	
	@Column(nullable = false)
	public String getSuper_adminname() {
		return super_adminname;
	}
	public void setSuper_adminname(String super_adminname) {
		this.super_adminname = super_adminname;
	}
	
	@Column(nullable = false)
	public String getSuper_adminportrait() {
		return super_adminportrait;
	}
	public void setSuper_adminportrait(String super_adminportrait) {
		this.super_adminportrait = super_adminportrait;
	}
	
	@Column()
	public String getSuper_adminqq() {
		return super_adminqq;
	}
	public void setSuper_adminqq(String super_adminqq) {
		this.super_adminqq = super_adminqq;
	}
	
	@Column()
	public String getSuper_adminwecat() {
		return super_adminwecat;
	}
	public void setSuper_adminwecat(String super_adminwecat) {
		this.super_adminwecat = super_adminwecat;
	}
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "super_adminloginId")
	public Set<SuperAdminLogin> getSuperAdminLogin() {
		return superAdminLogin;
	}
	public void setSuperAdminLogin(Set<SuperAdminLogin> superAdminLogin) {
		this.superAdminLogin = superAdminLogin;
	}
	
	
	

}
