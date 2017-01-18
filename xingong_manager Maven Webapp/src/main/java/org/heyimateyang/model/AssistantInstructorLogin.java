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
 * @Description 助理辅导员登录model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_assistantinstructorlogin")
public class AssistantInstructorLogin implements Serializable{

	private static final long serialVersionUID = -8915132292277281530L;
	
	private int assistant_instructorId;								    //表Id
	private String assistant_user;								       //登陆名字
	private String assistant_password;							  	  //登录密码
	private Jurisdiction jurisdiction;							 	 //多对一映射关系,对应权限model
	private AssistantInstructorSalt assistantInstructorSalt;    	//一对一映射关系,对应随机盐model
	private AssistantInstructorMessage assistantInstructorMessage; //一对多映射关系,对应助理辅导员model
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getAssistant_instructorId() {
		return assistant_instructorId;
	}
	public void setAssistant_instructorId(int assistant_instructorId) {
		this.assistant_instructorId = assistant_instructorId;
	}
	
	@Column(nullable = false)
	public String getAssistant_user() {
		return assistant_user;
	}
	public void setAssistant_user(String assistant_user) {
		this.assistant_user = assistant_user;
	}
	
	@Column(nullable = false)
	public String getAssistant_password() {
		return assistant_password;
	}
	public void setAssistant_password(String assistant_password) {
		this.assistant_password = assistant_password;
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
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //多对一关系共享主键映射,对权限表
	@JoinColumn(name = "assistant_saltId") 
	public AssistantInstructorSalt getAssistantInstructorSalt() {
		return assistantInstructorSalt;
	}
	public void setAssistantInstructorSalt(
			AssistantInstructorSalt assistantInstructorSalt) {
		this.assistantInstructorSalt = assistantInstructorSalt;
	}
	
	//懒加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //多对一关系共享主键映射,对助理辅导员model
	@JoinColumn(name = "assistant_instructormessageId") 
	public AssistantInstructorMessage getAssistantInstructorMessage() {
		return assistantInstructorMessage;
	}
	public void setAssistantInstructorMessage(
			AssistantInstructorMessage assistantInstructorMessage) {
		this.assistantInstructorMessage = assistantInstructorMessage;
	}

}
