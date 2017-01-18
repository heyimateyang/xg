package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
 * @author heyimateyang
 * @Description 助理私聊model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_assistantchat")
public class AssistantChat implements Serializable{

	private static final long serialVersionUID = 2602324933965070926L;
	
	private int assistant_chatId;												//表Id
	private String assistant_content;										   //私聊内容
	private Date create_date;												  //发表日期
	private String picture;													 //图片
	private AssistantChatReply assistantChatReply;							//一对多映射关系,对应私聊回复model
	private Set<AssistantInstructorMessage> assistantInstructorMessages;   //多对一映射关系,对应助理信息model
	private Set<StudentMessage> studentMessages;						  //多对一映射关系,对应学生信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getAssistant_chatId() {
		return assistant_chatId;
	}
	public void setAssistant_chatId(int assistant_chatId) {
		this.assistant_chatId = assistant_chatId;
	}
	
	@Column(nullable = false)
	public String getAssistant_content() {
		return assistant_content;
	}
	public void setAssistant_content(String assistant_content) {
		this.assistant_content = assistant_content;
	}
	
	@Column(nullable = false)
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
	@Column()
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "chat_replyId")
	public AssistantChatReply getAssistantChatReply() {
		return assistantChatReply;
	}
	public void setAssistantChatReply(AssistantChatReply assistantChatReply) {
		this.assistantChatReply = assistantChatReply;
	}
	
	@OneToMany(mappedBy = "assistant_instructormessageId")
	public Set<AssistantInstructorMessage> getAssistantInstructorMessages() {
		return assistantInstructorMessages;
	}
	public void setAssistantInstructorMessages(
			Set<AssistantInstructorMessage> assistantInstructorMessages) {
		this.assistantInstructorMessages = assistantInstructorMessages;
	}
	
	@OneToMany(mappedBy = "student_messageId")
	public Set<StudentMessage> getStudentMessages() {
		return studentMessages;
	}
	public void setStudentMessages(Set<StudentMessage> studentMessages) {
		this.studentMessages = studentMessages;
	}
	
	
	

}
