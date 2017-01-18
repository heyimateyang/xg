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
 * @Description 学院model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_college")
public class College implements Serializable{

	private static final long serialVersionUID = 5079774290601983521L;
	
	private int college_Id;
	private String college_name;
	private Set<Profession> set;				//一对多的映射关系,对应专业表
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getCollege_Id() {
		return college_Id;
	}
	public void setCollege_Id(int college_Id) {
		this.college_Id = college_Id;
	}
	
	@Column(nullable=false)    //非空处理
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getCollege_name() {
		return college_name;
	}
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "profession_Id")    //一对多映射关系
	public Set<Profession> getSet() {
		return set;
	}
	public void setSet(Set<Profession> set) {
		this.set = set;
	}

}
