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
 * @Description 专业model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_profession")
public class Profession implements Serializable{

	private static final long serialVersionUID = 9095050638631656074L;
	
	private int profession_Id;						//表Id
	private String profession_name;				   //专业名称
	private College college;					  //多对一映射关系,对应学院表
	private Set<ClassMessage> classMessages;	 //一对多映射关系,对应班级model
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getProfession_Id() {
		return profession_Id;
	}
	public void setProfession_Id(int profession_Id) {
		this.profession_Id = profession_Id;
	}
	
	@Column(nullable=false)    //非空处理,赋予默认值为0
	public void setProfession_name(String profession_name) {
		this.profession_name = profession_name;
	}
	public String getProfession_name() {
		return profession_name;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "college_Id")								   //对应的是提问表的Id
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "classmessage_Id")
	public Set<ClassMessage> getClassMessages() {
		return classMessages;
	}
	public void setClassMessages(Set<ClassMessage> classMessages) {
		this.classMessages = classMessages;
	}

}
