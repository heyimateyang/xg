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
 * @Description 辅导员登录信息model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_instructorlogin")
public class InstructorLogin implements Serializable{

	private static final long serialVersionUID = -5677878805621046606L;
	
	private int instructor_loginId;					 //表Id
	private String instructor_user;				    //辅导员登录名字
	private String instructor_password;			   //登录密码
	private InstructorSalt instructorSalt;		  //加盐密码,一对一对应映射关系,对应加盐model
	private Jurisdiction jurisdiction;			 //多对一映射关系,对应权限model
	private InstructorMessage instructorMessage;//一对一的映射关系,对应辅导员信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getInstructor_loginId() {
		return instructor_loginId;
	}
	public void setInstructor_loginId(int instructor_loginId) {
		this.instructor_loginId = instructor_loginId;
	}
	
	@Column(nullable=false)    //非空处理
	public String getInstructor_user() {
		return instructor_user;
	}
	public void setInstructor_user(String instructor_user) {
		this.instructor_user = instructor_user;
	}
	
	@Column(nullable=false)    //非空处理
	public String getInstructor_password() {
		return instructor_password;
	}
	public void setInstructor_password(String instructor_password) {
		this.instructor_password = instructor_password;
	}
	
	//使用懒加载
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //一对一关系共享主键映射,对辅导员随机盐model
    @JoinColumn(name = "instructor_saltId")
	public InstructorSalt getInstructorSalt() {
		return instructorSalt;
	}
	public void setInstructorSalt(InstructorSalt instructorSalt) {
		this.instructorSalt = instructorSalt;
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
	
	//使用懒加载
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //一对一关系共享主键映射,对辅导员信息表
    @JoinColumn(name = "instructor_messageId")
	public InstructorMessage getInstructorMessage() {
		return instructorMessage;
	}
	public void setInstructorMessage(InstructorMessage instructorMessage) {
		this.instructorMessage = instructorMessage;
	}

}
