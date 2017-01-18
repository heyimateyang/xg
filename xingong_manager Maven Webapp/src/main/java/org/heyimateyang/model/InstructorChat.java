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
 * @Description 私聊辅导员信息model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_instructorchat")
public class InstructorChat implements Serializable{

	private static final long serialVersionUID = -6757867212557856939L;
	
	
	private int instructor_chatId;
	private String instructor_content;
	private Date create_date;												  //发表日期
	private String picture;		
	private InstructorReply instructorReply;
	private Set<StudentMessage> studentMessages;
	private Set<InstructorMessage> instructorMessages;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getInstructor_chatId() {
		return instructor_chatId;
	}
	public void setInstructor_chatId(int instructor_chatId) {
		this.instructor_chatId = instructor_chatId;
	}
	
	
	@Column(nullable = false)
	public String getInstructor_content() {
		return instructor_content;
	}
	public void setInstructor_content(String instructor_content) {
		this.instructor_content = instructor_content;
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
	@JoinColumn(name = "instructor_chatreplyId")
	public InstructorReply getInstructorReply() {
		return instructorReply;
	}
	public void setInstructorReply(InstructorReply instructorReply) {
		this.instructorReply = instructorReply;
	}
	
	@OneToMany(mappedBy = "student_messageId")
	public Set<StudentMessage> getStudentMessages() {
		return studentMessages;
	}
	public void setStudentMessages(Set<StudentMessage> studentMessages) {
		this.studentMessages = studentMessages;
	}
	
	@OneToMany(mappedBy = "instructor_messageId")
	public Set<InstructorMessage> getInstructorMessages() {
		return instructorMessages;
	}
	public void setInstructorMessages(Set<InstructorMessage> instructorMessages) {
		this.instructorMessages = instructorMessages;
	}
}
