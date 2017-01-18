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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author heyimateyang
 * @Description Student登录信息model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_studenlogin")
public class StudentLogin implements Serializable{

	private static final long serialVersionUID = 1698294151084238456L;
	
	private int student_loginId;				   //表id
	private String student_loginname;			  //登录帐号
	private String md5_password;				 //md5加密密码
	private StudentSalt studentSalt;		    //一对一共享主键映射关系 对应的是随机盐model
	private Jurisdiction jurisdiction;		   //多对一的映射关系    对应权限表
	private StudentMessage studentMessage;    //一对一共享主键映射关系 对应的是学生信息表
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getStudent_loginId() {
		return student_loginId;
	}
	public void setStudent_loginId(int student_loginId) {
		this.student_loginId = student_loginId;
	}
	
	@Column(nullable=false)    //非空处理
	public String getStudent_loginname() {
		return student_loginname;
	}
	public void setStudent_loginname(String student_loginname) {
		this.student_loginname = student_loginname;
	}
	
	@Column(nullable=false)    //非空处理
	public String getMd5_password() {
		return md5_password;
	}
	public void setMd5_password(String md5_password) {
		this.md5_password = md5_password;
	}
	
	//使用懒加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //一对一关系共享主键映射,对应信息统计表
	@JoinColumn(name = "salt_Id")
	public StudentSalt getStudentSalt() {
		return studentSalt;
	}
	public void setStudentSalt(StudentSalt studentSalt) {
		this.studentSalt = studentSalt;
	}
	
	//懒加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //多对一关系共享主键映射,对权限表
	@JoinColumn(name = "jurisdiction_Id")                            //对应权限表id
	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	//使用懒加载
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //一对一关系共享主键映射,对学生信息表
	@JoinColumn(name = "student_messageId") 
	public StudentMessage getStudentMessage() {
		return studentMessage;
	}
	public void setStudentMessage(StudentMessage studentMessage) {
		this.studentMessage = studentMessage;
	}
	
	
}
