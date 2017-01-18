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
 * @Description 届数信息model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_yearcount")
public class YearCount implements Serializable{

	private static final long serialVersionUID = -6923319585992158205L;
	
	private int year_countId; 					      //表Id
	private int year_number;				          //年级届数
	private Set<ClassMessage> classMessages;		  //一对多映射关系,对应学生信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getYear_countId() {
		return year_countId;
	}
	public void setYear_countId(int year_countId) {
		this.year_countId = year_countId;
	}
	
	@Column(nullable = false)
	public int getYear_number() {
		return year_number;
	}
	public void setYear_number(int year_number) {
		this.year_number = year_number;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="classmessage_Id") 
	public Set<ClassMessage> getClassMessages() {
		return classMessages;
	}
	public void setClassMessages(Set<ClassMessage> classMessages) {
		this.classMessages = classMessages;
	}
	

}
