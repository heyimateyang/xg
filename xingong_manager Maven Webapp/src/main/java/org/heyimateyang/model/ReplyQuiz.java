package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
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
 * @Description 回复提问model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_replyquiz")
public class ReplyQuiz implements Serializable{

	private static final long serialVersionUID = 7922206844904992129L;
	
	private int reply_quizid;			 //表id
	private Date reply_date;	   		//回复日期
	private String reply_name;	  	   //回复人名字
	private Set<QuizMessage> quizMessage;  //多对一映射关系
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getReply_quizid() {
		return reply_quizid;
	}
	public void setReply_quizid(int reply_quizid) {
		this.reply_quizid = reply_quizid;
	}
	
	@Column(nullable=false)    //非空处理,赋予默认值为0
	public Date getReply_date() {
		return reply_date;
	}
	public void setReply_date(Date reply_date) {
		this.reply_date = reply_date;
	}
	
	@Column(nullable=false)    //非空处理,赋予默认值为0
	public String getReply_name() {
		return reply_name;
	}
	public void setReply_name(String reply_name) {
		this.reply_name = reply_name;
	}
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="quiz_id")    //一对多映射关系
	public Set<QuizMessage> getQuizMessage() {
		return quizMessage;
	}
	public void setQuizMessage(Set<QuizMessage> quizMessage) {
		this.quizMessage = quizMessage;
	}

}
