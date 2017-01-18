package org.heyimateyang.model;

import java.io.Serializable;
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
 * @Description 权限model
 * @Description 0权限为允许,1权限为不允许
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_jurisdiction")
public class Jurisdiction implements Serializable{

	private static final long serialVersionUID = -3055025678355775557L;
	
	private int jurisdiction_Id;					                 //表id
	private int junrisdiction_state;							    //判断用户权限  0学生1辅导员助理2辅导员3管理员4超级管理员
	private int login_jurisdiction;				                   //登录权限
	private int add_jurisdiction;				                  //添加信息权限
	private int delete_jurisdiction;			                 //删除信息权限
	private int update_jurisdiction;			                //更新权限权限
	private int add_adminjurisdiction;		                   //添加管理员权限
	private int delete_adminjurisdiction;	                  //删除管理员权限
	private int add_instructorjurisdiction;	                 //添加辅导员权限
	private int delete_instructorjurisdiction;              //删除辅导员权限
	private int add_assistantjurisdiction;		           //添加辅导员助理权限
	private int delete_assistantjurisdiction;	          //删除辅导员助理权限
	private int add_studentjurisdiction;	             //添加学生权限
	private int delete_studentjurisdiction;             //删除学生权限
	private int delete_systemmessage;                  //删除系统公告权限
	private int delete_post;				          //删除帖子权限
	private Set<StudentLogin> studentLogins;         //一对多映射关系   对应学生登录信息表
	private Set<InstructorLogin> instructorLogins;  //一对多映射关系   对应辅导员登录信息表
	private Set<SuperAdminLogin> superAdminLogins ;//一对多映射关系   对应超级管理员登录信息表
	private Set<AdminLogin> adminLogins;		  //多对一映射关系,对应管理员登录信息表
	private Set<AssistantInstructorLogin> assistantInstructorLogins;//多对一映射关系,对应助理辅导员登录信息表
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getJurisdiction_Id() {
		return jurisdiction_Id;
	}
	public void setJurisdiction_Id(int jurisdiction_Id) {
		this.jurisdiction_Id = jurisdiction_Id;
	}
	
	
	@Column(nullable = false)
	public int getJunrisdiction_state() {
		return junrisdiction_state;
	}
	public void setJunrisdiction_state(int junrisdiction_state) {
		this.junrisdiction_state = junrisdiction_state;
	}
	
	@Column(nullable = false)
	public int getLogin_jurisdiction() {
		return login_jurisdiction;
	}
	public void setLogin_jurisdiction(int login_jurisdiction) {
		this.login_jurisdiction = login_jurisdiction;
	}
	
	@Column(nullable = false)
	public int getAdd_jurisdiction() {
		return add_jurisdiction;
	}
	public void setAdd_jurisdiction(int add_jurisdiction) {
		this.add_jurisdiction = add_jurisdiction;
	}
	
	@Column(nullable = false)
	public int getDelete_jurisdiction() {
		return delete_jurisdiction;
	}
	public void setDelete_jurisdiction(int delete_jurisdiction) {
		this.delete_jurisdiction = delete_jurisdiction;
	}
	
	@Column(nullable = false)
	public int getUpdate_jurisdiction() {
		return update_jurisdiction;
	}
	public void setUpdate_jurisdiction(int update_jurisdiction) {
		this.update_jurisdiction = update_jurisdiction;
	}
	
	@Column(nullable = false)
	public int getAdd_adminjurisdiction() {
		return add_adminjurisdiction;
	}
	public void setAdd_adminjurisdiction(int add_adminjurisdiction) {
		this.add_adminjurisdiction = add_adminjurisdiction;
	}
	
	@Column(nullable = false)
	public int getDelete_adminjurisdiction() {
		return delete_adminjurisdiction;
	}
	public void setDelete_adminjurisdiction(int delete_adminjurisdiction) {
		this.delete_adminjurisdiction = delete_adminjurisdiction;
	}
	
	@Column(nullable = false)
	public int getAdd_instructorjurisdiction() {
		return add_instructorjurisdiction;
	}
	public void setAdd_instructorjurisdiction(int add_instructorjurisdiction) {
		this.add_instructorjurisdiction = add_instructorjurisdiction;
	}
	
	@Column(nullable = false)
	public int getDelete_instructorjurisdiction() {
		return delete_instructorjurisdiction;
	}
	public void setDelete_instructorjurisdiction(int delete_instructorjurisdiction) {
		this.delete_instructorjurisdiction = delete_instructorjurisdiction;
	}
	
	@Column(nullable = false)
	public int getAdd_assistantjurisdiction() {
		return add_assistantjurisdiction;
	}
	public void setAdd_assistantjurisdiction(int add_assistantjurisdiction) {
		this.add_assistantjurisdiction = add_assistantjurisdiction;
	}
	
	@Column(nullable = false)
	public int getDelete_assistantjurisdiction() {
		return delete_assistantjurisdiction;
	}
	public void setDelete_assistantjurisdiction(int delete_assistantjurisdiction) {
		this.delete_assistantjurisdiction = delete_assistantjurisdiction;
	}
	
	@Column(nullable = false)
	public int getAdd_studentjurisdiction() {
		return add_studentjurisdiction;
	}
	public void setAdd_studentjurisdiction(int add_studentjurisdiction) {
		this.add_studentjurisdiction = add_studentjurisdiction;
	}
	
	@Column(nullable = false)
	public int getDelete_studentjurisdiction() {
		return delete_studentjurisdiction;
	}
	public void setDelete_studentjurisdiction(int delete_studentjurisdiction) {
		this.delete_studentjurisdiction = delete_studentjurisdiction;
	}
	
	@Column(nullable = false)
	public int getDelete_systemmessage() {
		return delete_systemmessage;
	}
	public void setDelete_systemmessage(int delete_systemmessage) {
		this.delete_systemmessage = delete_systemmessage;
	}

	public int getDelete_post() {
		return delete_post;
	}
	public void setDelete_post(int delete_post) {
		this.delete_post = delete_post;
	}
	
	@OneToMany(mappedBy = "student_loginId")
	public Set<StudentLogin> getStudentLogins() {
		return studentLogins;
	}
	public void setStudentLogins(Set<StudentLogin> studentLogins) {
		this.studentLogins = studentLogins;
	}
	
	@OneToMany(mappedBy = "instructor_loginId")
	public Set<InstructorLogin> getInstructorLogins() {
		return instructorLogins;
	}
	public void setInstructorLogins(Set<InstructorLogin> instructorLogins) {
		this.instructorLogins = instructorLogins;
	}
	
	@OneToMany(mappedBy = "super_adminloginId")
	public Set<SuperAdminLogin> getSuperAdminLogins() {
		return superAdminLogins;
	}
	public void setSuperAdminLogins(Set<SuperAdminLogin> superAdminLogins) {
		this.superAdminLogins = superAdminLogins;
	}
	
	@OneToMany(mappedBy = "admin_loginId")
	public Set<AdminLogin> getAdminLogins() {
		return adminLogins;
	}
	public void setAdminLogins(Set<AdminLogin> adminLogins) {
		this.adminLogins = adminLogins;
	}
	
	@OneToMany(mappedBy = "assistant_instructorId")
	public Set<AssistantInstructorLogin> getAssistantInstructorLogins() {
		return assistantInstructorLogins;
	}
	public void setAssistantInstructorLogins(
			Set<AssistantInstructorLogin> assistantInstructorLogins) {
		this.assistantInstructorLogins = assistantInstructorLogins;
	}

}
