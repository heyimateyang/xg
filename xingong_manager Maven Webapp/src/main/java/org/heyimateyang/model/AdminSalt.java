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
 * @Description 管理员随机盐model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_adminsalt")
public class AdminSalt implements Serializable{

	private static final long serialVersionUID = -2518174566205807485L;
	
	private int admin_saltId;						//表Id
	private String admin_salt;					   //管理员随机盐
	private Set<AdminLogin> adminLogin;			  //一对一映射关系,对应管理员登录model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getAdmin_saltId() {
		return admin_saltId;
	}
	public void setAdmin_saltId(int admin_saltId) {
		this.admin_saltId = admin_saltId;
	}
	
	@Column(nullable = false)
	public String getAdmin_salt() {
		return admin_salt;
	}
	public void setAdmin_salt(String admin_salt) {
		this.admin_salt = admin_salt;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "admin_loginId")
	public Set<AdminLogin> getAdminLogin() {
		return adminLogin;
	}
	public void setAdminLogin(Set<AdminLogin> adminLogin) {
		this.adminLogin = adminLogin;
	}

}
