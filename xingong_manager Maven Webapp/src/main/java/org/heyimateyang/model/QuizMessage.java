package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Date;

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
 * @Description 提问信息model
 * @Description 实现Serializable接口实现序列化
 */


@Entity
@Table(name = "tbl_quizmessage")
public class QuizMessage implements Serializable{

	private static final long serialVersionUID = 1513804562879531305L;
	
	private int quiz_id;				//表id
	private Date start_data;		   //发表日期
	private String quiz_message;	  //提问内容
	private String quiz_name;		 //提问人名字
	private Date end_data;			//结贴日期
	private int solve;			   //问题解决标签
	private QuizCount count;	  //信息统计表 一对一映射
	private ReplyQuiz replyQuiz; //信息回复表 一对多映射
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getQuiz_id() {
		return quiz_id;
	}
	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}
	
	@Column(nullable=false)    //非空处理
	public Date getStart_data() {
		return start_data;
	}
	public void setStart_data(Date start_data) {
		this.start_data = start_data;
	}
	
	@Column(nullable=false)    //非空处理
	public String getQuiz_message() {
		return quiz_message;
	}
	public void setQuiz_message(String quiz_message) {
		this.quiz_message = quiz_message;
	}
	
	@Column(nullable=false)    //非空处理
	public String getQuiz_name() {
		return quiz_name;
	}
	public void setQuiz_name(String quiz_name) {
		this.quiz_name = quiz_name;
	}
	
	@Column(nullable=false)    //非空处理
	public Date getEnd_data() {
		return end_data;
	}
	public void setEnd_data(Date end_data) {
		this.end_data = end_data;
	}
	
	@Column(nullable=false)    //非空处理
	public int getSolve() {
		return solve;
	}
	public void setSolve(int solve) {
		this.solve = solve;
	}
	
	//使用了懒加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //一对一关系共享主键映射,对应信息统计表
	@JoinColumn(name = "quiz_countId")
	public QuizCount getCount() {
		return count;
	}
	public void setCount(QuizCount count) {
		this.count = count;
	}
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "reply_quizid")
	public ReplyQuiz getReplyQuiz() {
		return replyQuiz;
	}
	public void setReplyQuiz(ReplyQuiz replyQuiz) {
		this.replyQuiz = replyQuiz;
	}
	 

}
