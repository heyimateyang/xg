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
 * @Description 回复私聊辅导员信息model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_instructorreply")
public class InstructorReply implements Serializable{

	private static final long serialVersionUID = -6060048860729910711L;
	
	private int instructor_chatreplyId;                   //表Id
	private Date reply_date;							 //回复时间
	private String reply_content;					    //回复内容
	private String picture;							   //图片
	private String reply_name;						  //回复人名字
	private Set<InstructorChat> instructorChats;     //多对一映射关系,对应助理私聊model
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植                        
	public int getInstructor_chatreplyId() {
		return instructor_chatreplyId;
	}
	public void setInstructor_chatreplyId(int instructor_chatreplyId) {
		this.instructor_chatreplyId = instructor_chatreplyId;
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
	
	@OneToMany(mappedBy = "instructor_chatId")
	public Set<InstructorChat> getInstructorChats() {
		return instructorChats;
	}
	public void setInstructorChats(Set<InstructorChat> instructorChats) {
		this.instructorChats = instructorChats;
	}

	
}
