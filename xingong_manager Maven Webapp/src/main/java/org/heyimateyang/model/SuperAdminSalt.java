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
 * @Description 超级管理员随机盐model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_superadminsalt")
public class SuperAdminSalt implements Serializable{

	private static final long serialVersionUID = 3862270362515155680L;
	
	private int super_adminsaltId;						//表Id
	private String super_adminsalt;				       //超级管理员随机盐
	private Set<SuperAdminLogin> superAdminLogin;		  //一对一映射关系,对应超级管理员model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getSuper_adminsaltId() {
		return super_adminsaltId;
	}
	public void setSuper_adminsaltId(int super_adminsaltId) {
		this.super_adminsaltId = super_adminsaltId;
	}
	
	@Column(nullable = false)
	public String getSuper_adminsalt() {
		return super_adminsalt;
	}
	public void setSuper_adminsalt(String super_adminsalt) {
		this.super_adminsalt = super_adminsalt;
	}
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "super_adminloginId")
	public Set<SuperAdminLogin> getSuperAdminLogin() {
		return superAdminLogin;
	}
	public void setSuperAdminLogin(Set<SuperAdminLogin> superAdminLogin) {
		this.superAdminLogin = superAdminLogin;
	}

}
