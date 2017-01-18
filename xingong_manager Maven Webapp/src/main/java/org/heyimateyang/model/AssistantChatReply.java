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
 * @Description 助理回复model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_assistantchatreply")
public class AssistantChatReply implements Serializable{

	private static final long serialVersionUID = -3964027786260518377L;
	
	private int chat_replyId;                             //表Id
	private Date reply_date;							 //回复时间
	private String reply_content;					    //回复内容
	private String picture;							   //图片
	private String reply_name;						  //回复人名字
	private Set<AssistantChat> assistantChats;       //多对一映射关系,对应助理私聊model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getChat_replyId() {
		return chat_replyId;
	}
	public void setChat_replyId(int chat_replyId) {
		this.chat_replyId = chat_replyId;
	}
	
	@Column(nullable = false)
	public Date getReply_date() {
		return reply_date;
	}
	public void setReply_date(Date reply_date) {
		this.reply_date = reply_date;
	}
	
	
	@Column(nullable = false)
	public String getReply_content() {
		return reply_content;
	}
	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}
	
	@Column()
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	@Column(nullable = false)
	public String getReply_name() {
		return reply_name;
	}
	public void setReply_name(String reply_name) {
		this.reply_name = reply_name;
	}
	
	@OneToMany(mappedBy = "assistant_chatId")
	public Set<AssistantChat> getAssistantChats() {
		return assistantChats;
	}
	public void setAssistantChats(Set<AssistantChat> assistantChats) {
		this.assistantChats = assistantChats;
	} 
	

}
