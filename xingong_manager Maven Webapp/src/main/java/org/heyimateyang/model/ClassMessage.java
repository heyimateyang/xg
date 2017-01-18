package org.heyimateyang.model;

import java.io.Serializable;
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
 * @Description 班级信息model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_classmessage")
public class ClassMessage implements Serializable{
	
	private static final long serialVersionUID = 9113409492532505260L;
	
	private int classmessage_Id;				          //表Id
	private String classname;					         //班级名称
	private int classqq;						        //班级QQ群
	private String classwecat;					       //班级微信
	private String slogan;						      //口号
	private Profession profession;			         //多对一映射关系, 对应专业表
	private InstructorMessage instructorMessage;    //多对一映射关系,对应班级model
	private YearCount yearCount;				   //多对一映射关系,对应届数model
	private Set<StudentMessage> studentMessages;  //一对多映射关系,对应学生信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getClassmessage_Id() {
		return classmessage_Id;
	}
	public void setClassmessage_Id(int classmessage_Id) {
		this.classmessage_Id = classmessage_Id;
	}
	
	@Column(nullable = false)
	public String getClassname() {
		return classname;
	}	
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	@Column()
	public int getClassqq() {
		return classqq;
	}
	public void setClassqq(int classqq) {
		this.classqq = classqq;
	}
	
	@Column()
	public String getClasswecat() {
		return classwecat;
	}
	public void setClasswecat(String classwecat) {
		this.classwecat = classwecat;
	}
	
	@Column()
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	
	//懒加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //多对一关系共享主键映射,对辅导员信息表
	@JoinColumn(name = "instructor_messageId")  
	public InstructorMessage getInstructorMessage() {
		return instructorMessage;
	}
	public void setInstructorMessage(InstructorMessage instructorMessage) {
		this.instructorMessage = instructorMessage;
	}
	
	//懒加载
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //多对一关系共享主键映射,对专业表
	@JoinColumn(name = "profession_Id")  
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	
	@OneToMany(mappedBy = "student_messageId")
	public Set<StudentMessage> getStudentMessages() {
		return studentMessages;
	}
	public void setStudentMessages(Set<StudentMessage> studentMessages) {
		this.studentMessages = studentMessages;
	}
	
	//懒加载
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)    //多对一关系共享主键映射,对届数model
	@JoinColumn(name = "year_countId") 
	public YearCount getYearCount() {
		return yearCount;
	}
	public void setYearCount(YearCount yearCount) {
		this.yearCount = yearCount;
	}
	
	

}
