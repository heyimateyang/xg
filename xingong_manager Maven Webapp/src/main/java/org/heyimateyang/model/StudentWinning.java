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
 * @Description 获奖信息model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_studentwinning")
public class StudentWinning implements Serializable{

	private static final long serialVersionUID = -6667146996045162724L;
	
	private int student_winningId;				         //表Id
	private Date winn_date;						        //获奖日期
	private Date establish_date;					   //发布日期
	private int winn_state;					   		  //奖项审批情况 0没审批,1辅导员助理审批,2辅导员审批,3管理员审批
	private String winn_name;				  	     //获奖名称
	private String winn_content;			 	    //奖状内容
	private String winn_title;				       //奖状标题
	private String winn_picture;		   		  //奖状图片
	private WinningGrade winningGrade;	  		 //一对多映射关系,对应奖状等级model
	private Set<StudentMessage> studentMessages;//多对一映射关系,对应学生信息model   
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getStudent_winningId() {
		return student_winningId;
	}
	public void setStudent_winningId(int student_winningId) {
		this.student_winningId = student_winningId;
	}
	
	@Column(nullable = false)
	public Date getWinn_date() {
		return winn_date;
	}
	public void setWinn_date(Date winn_date) {
		this.winn_date = winn_date;
	}
	
	@Column(nullable = false)
	public Date getEstablish_date() {
		return establish_date;
	}
	public void setEstablish_date(Date establish_date) {
		this.establish_date = establish_date;
	}
	
	@Column(nullable = false)
	public int getWinn_state() {
		return winn_state;
	}
	public void setWinn_state(int winn_state) {
		this.winn_state = winn_state;
	}
	
	@Column(nullable = false)
	public String getWinn_name() {
		return winn_name;
	}
	public void setWinn_name(String winn_name) {
		this.winn_name = winn_name;
	}
	
	@Column(nullable = false)
	public String getWinn_content() {
		return winn_content;
	}
	public void setWinn_content(String winn_content) {
		this.winn_content = winn_content;
	}
	
	@Column(nullable = false)
	public String getWinn_title() {
		return winn_title;
	}
	public void setWinn_title(String winn_title) {
		this.winn_title = winn_title;
	}
	
	@Column(nullable = false)
	public String getWinn_picture() {
		return winn_picture;
	}
	public void setWinn_picture(String winn_picture) {
		this.winn_picture = winn_picture;
	}
	
	//延迟加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "winning_gradeId")
	public WinningGrade getWinningGrade() {
		return winningGrade;
	}
	public void setWinningGrade(WinningGrade winningGrade) {
		this.winningGrade = winningGrade;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="student_messageId") 
	public Set<StudentMessage> getStudentMessages() {
		return studentMessages;
	}
	public void setStudentMessages(Set<StudentMessage> studentMessages) {
		this.studentMessages = studentMessages;
	}
	
	

}
