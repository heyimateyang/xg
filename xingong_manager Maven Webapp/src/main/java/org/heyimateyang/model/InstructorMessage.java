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
 * @Description 辅导员信息model
 * @Description 实现Serializable接口实现序列化
 */


@Entity
@Table(name = "tbl_instructormessage")
public class InstructorMessage implements Serializable{

	private static final long serialVersionUID = -5441860348062011064L;
	
	private int instructor_messageId;						   //表Id
	private String instructor_name;							  //辅导员名字
	private long instructor_qqnumber;					     //辅导员Q号码
	private String instructor_wechat;						//辅导员微信
	private Date create_date;							   //创建日期
	private String instructor_portrait;					  //头像图片
	private int chat_state;							     //私聊回复状态 初始化为0,当点击进去后,恢复为0
	private InstructorChat instructorChat;              //一对多映射关系,对应辅导员私聊model
	private Set<InstructorLogin> instructorLogin;           //一对一映射关系,对应辅导员登录model
	private Set<ClassMessage> classMessages;		  //一对多映射关系,对应班级信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getInstructor_messageId() {
		return instructor_messageId;
	}
	public void setInstructor_messageId(int instructor_messageId) {
		this.instructor_messageId = instructor_messageId;
	}
	
	@Column(nullable=false)
	public String getInstructor_name() {
		return instructor_name;
	}
	public void setInstructor_name(String instructor_name) {
		this.instructor_name = instructor_name;
	}
	
	@Column
	public long getInstructor_qqnumber() {
		return instructor_qqnumber;
	}
	public void setInstructor_qqnumber(long instructor_qqnumber) {
		this.instructor_qqnumber = instructor_qqnumber;
	}
	
	@Column
	public String getInstructor_wechat() {
		return instructor_wechat;
	}
	public void setInstructor_wechat(String instructor_wechat) {
		this.instructor_wechat = instructor_wechat;
	}
	
	@Column(nullable = false)
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
	@Column
	public String getInstructor_portrait() {
		return instructor_portrait;
	}
	public void setInstructor_portrait(String instructor_portrait) {
		this.instructor_portrait = instructor_portrait;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "instructor_loginId")
	public Set<InstructorLogin> getInstructorLogin() {
		return instructorLogin;
	}
	public void setInstructorLogin(Set<InstructorLogin> instructorLogin) {
		this.instructorLogin = instructorLogin;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "classmessage_Id")
	public Set<ClassMessage> getClassMessages() {
		return classMessages;
	}
	public void setClassMessages(Set<ClassMessage> classMessages) {
		this.classMessages = classMessages;
	}
	
	@Column(nullable = false)
	public int getChat_state() {
		return chat_state;
	}
	public void setChat_state(int chat_state) {
		this.chat_state = chat_state;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "instructor_chatId")
	public InstructorChat getInstructorChat() {
		return instructorChat;
	}
	public void setInstructorChat(InstructorChat instructorChat) {
		this.instructorChat = instructorChat;
	}

}
