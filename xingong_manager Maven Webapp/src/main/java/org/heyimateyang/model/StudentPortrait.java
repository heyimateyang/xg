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
 * @Description 学生照片model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_studentportrait")
public class StudentPortrait implements Serializable{

	private static final long serialVersionUID = -6635700982553577047L;
	
	private int portrait_Id;				//表id
	private String portrait;			   //照片
	private Set<StudentMessage> studentMessage;//一对一映射关系,对应学生信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getPortrait_Id() {
		return portrait_Id;
	}
	public String getPortrait() {
		return portrait;
	}
	
	@Column(nullable = false)    //非空处理,赋予默认值为0
	public void setPortrait_Id(int portrait_Id) {
		this.portrait_Id = portrait_Id;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "student_messageId")
	public Set<StudentMessage> getStudentMessage() {
		return studentMessage;
	}
	public void setStudentMessage(Set<StudentMessage> studentMessage) {
		this.studentMessage = studentMessage;
	}

}
