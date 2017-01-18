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
 * @Description 助理辅导员信息model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_assistantinstructormessage")
public class AssistantInstructorMessage implements Serializable{

	private static final long serialVersionUID = -3082634950199044141L;
		
	private int assistant_instructormessageId;									 //表Id
	private String assistant_name;											    //助理辅导员名字
	private Date create_date;												   //创建日期
	private long assistant_qq;												  //QQ号码
	private String assistant_wecat;											 //微信
	private String assistant_portrait;									    //头像图片
	private int chat_state;												   //私聊回复状态 初始化为0,当点击进去后,恢复为0
	private Set<AssistantInstructorLogin> assistantInstructorLogins;	  //一对多映射关系,对应助理辅导员登录Model
	private AssistantChat assistantChat;
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getAssistant_instructormessageId() {
		return assistant_instructormessageId;
	}
	public void setAssistant_instructormessageId(int assistant_instructormessageId) {
		this.assistant_instructormessageId = assistant_instructormessageId;
	}
	
	@Column(nullable = false)
	public String getAssistant_name() {
		return assistant_name;
	}
	public void setAssistant_name(String assistant_name) {
		this.assistant_name = assistant_name;
	}
	
	@Column(nullable = false)
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
	@Column()
	public long getAssistant_qq() {
		return assistant_qq;
	}
	public void setAssistant_qq(long assistant_qq) {
		this.assistant_qq = assistant_qq;
	}
	
	@Column()
	public String getAssistant_wecat() {
		return assistant_wecat;
	}
	public void setAssistant_wecat(String assistant_wecat) {
		this.assistant_wecat = assistant_wecat;
	}
	
	@Column()
	public String getAssistant_portrait() {
		return assistant_portrait;
	}
	public void setAssistant_portrait(String assistant_portrait) {
		this.assistant_portrait = assistant_portrait;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "assistant_instructorId")
	public Set<AssistantInstructorLogin> getAssistantInstructorLogins() {
		return assistantInstructorLogins;
	}
	public void setAssistantInstructorLogins(
			Set<AssistantInstructorLogin> assistantInstructorLogins) {
		this.assistantInstructorLogins = assistantInstructorLogins;
	}
	
	@Column(nullable = false)
	public int getChat_state() {
		return chat_state;
	}
	public void setChat_state(int chat_state) {
		this.chat_state = chat_state;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "assistant_chatId")
	public AssistantChat getAssistantChat() {
		return assistantChat;
	}
	public void setAssistantChat(AssistantChat assistantChat) {
		this.assistantChat = assistantChat;
	}

}
