package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

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
 * @Description 管理员信息model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_adminmessage")
public class AdminMessage implements Serializable{

	private static final long serialVersionUID = 1884254544629416890L;
	
	private int admin_messageId;						//表Id	
	private String admin_name;						   //管理员名字
	private Date create_date;						  //创建日期
	private String admin_wechat;				     //管理员微信
	private int admin_qq;							//管理员QQ号码
	private String admin_portrait;				   //管理员头像
	private Set<AdminLogin> adminLogin;			  //多对一映射关系,对应管理员登陆信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getAdmin_messageId() {
		return admin_messageId;
	}
	public void setAdmin_messageId(int admin_messageId) {
		this.admin_messageId = admin_messageId;
	}
	
	@Column(nullable = false)
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	
	@Column(nullable = false)
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
	@Column()
	public String getAdmin_wechat() {
		return admin_wechat;
	}
	public void setAdmin_wechat(String admin_wechat) {
		this.admin_wechat = admin_wechat;
	}
	
	@Column()
	public int getAdmin_qq() {
		return admin_qq;
	}
	public void setAdmin_qq(int admin_qq) {
		this.admin_qq = admin_qq;
	}
	
	@Column()
	public String getAdmin_portrait() {
		return admin_portrait;
	}
	public void setAdmin_portrait(String admin_portrait) {
		this.admin_portrait = admin_portrait;
	}
	
	@OneToMany(mappedBy = "admin_loginId")
	public Set<AdminLogin> getAdminLogin() {
		return adminLogin;
	}
	public void setAdminLogin(Set<AdminLogin> adminLogin) {
		this.adminLogin = adminLogin;
	}
	
	
}
