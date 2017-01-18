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
 * @Description 请假modle
 * @Description 实现Serializable接口实现序列化
 */

@Entity
@Table(name = "tbl_studentleave")
public class StudentLeave implements Serializable{

	private static final long serialVersionUID = -5209120177236089171L;
	
	
	private int student_leaveId;
	private Date start_leave;					       //请假起始日期
	private Date end_leace;						      //结束日期
	private String leave_content;			   	     //请假内容
	private int satrt_count;				  	    //从某节开始请假
	private int end_count;					       //结束节数
	private int count_number;	                  //总节数
	private int approval;					     //0为没批准1为批准
	private Set<StudentMessage> studentMessages;//多对一映射关系,对应学生信息model
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getStudent_leaveId() {
		return student_leaveId;
	}
	public void setStudent_leaveId(int student_leaveId) {
		this.student_leaveId = student_leaveId;
	}
		
	@Column(nullable = false)
	public Date getStart_leave() {
		return start_leave;
	}
	public void setStart_leave(Date start_leave) {
		this.start_leave = start_leave;
	}
	
	@Column(nullable = false)
	public Date getEnd_leace() {
		return end_leace;
	}
	public void setEnd_leace(Date end_leace) {
		this.end_leace = end_leace;
	}
	
	@Column(nullable = false)
	public String getLeave_content() {
		return leave_content;
	}
	public void setLeave_content(String leave_content) {
		this.leave_content = leave_content;
	}
	
	@Column(nullable = false)
	public int getSatrt_count() {
		return satrt_count;
	}
	public void setSatrt_count(int satrt_count) {
		this.satrt_count = satrt_count;
	}
	
	@Column(nullable = false)
	public int getEnd_count() {
		return end_count;
	}
	public void setEnd_count(int end_count) {
		this.end_count = end_count;
	}
	
	@Column(nullable = false)
	public int getCount_number() {
		return count_number;
	}
	public void setCount_number(int count_number) {
		this.count_number = count_number;
	}
	
	@Column(nullable = false)
	public int getApproval() {
		return approval;
	}
	public void setApproval(int approval) {
		this.approval = approval;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="student_messageId")    //一对多映射关系，对应学生信息表
	public Set<StudentMessage> getStudentMessages() {
		return studentMessages;
	}
	public void setStudentMessages(Set<StudentMessage> studentMessages) {
		this.studentMessages = studentMessages;
	}

}
