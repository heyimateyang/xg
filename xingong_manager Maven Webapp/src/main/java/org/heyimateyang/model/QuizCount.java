package org.heyimateyang.model;

import java.io.Serializable;
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
 * @Description 提问信息统计model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_quizcount")
public class QuizCount implements Serializable{
	
	private static final long serialVersionUID = -1493827237951459671L;
	
	private int quiz_countId;              //表id
	private int quiz_count;               //回复数
	private int quiz_click;              //点击数
	private Set<QuizMessage> quizMessage;    //一对一映射关系  对应问题回复model
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getQuiz_countId() {
		return quiz_countId;
	}
	public void setQuiz_countId(int quiz_countId) {
		this.quiz_countId = quiz_countId;
	}
	
	@Column(nullable=false)    //非空处理,赋予默认值为0
	public int getQuiz_count() {
		return quiz_count;
	}
	public void setQuiz_count(int quiz_count) {
		this.quiz_count = quiz_count;
	}
	
	@Column(nullable=false)    //非空处理,赋予默认值为0
	public int getQuiz_click() {
		return quiz_click;
	}
	public void setQuiz_click(int quiz_click) {
		this.quiz_click = quiz_click;
	}
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "quiz_id")
	public Set<QuizMessage> getQuizMessage() {
		return quizMessage;
	}
	public void setQuizMessage(Set<QuizMessage> quizMessage) {
		this.quizMessage = quizMessage;
	}
	

}
