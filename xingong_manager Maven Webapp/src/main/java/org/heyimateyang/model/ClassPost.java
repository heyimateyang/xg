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
 * @Description 班级职务model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_classpost")
public class ClassPost implements Serializable{

	private static final long serialVersionUID = -2637585814034780178L;
	
	private int classpost_Id;
	private String post;					//职位
	private Set<StudentMessage> set;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getClasspost_Id() {
		return classpost_Id;
	}
	public void setClasspost_Id(int classpost_Id) {
		this.classpost_Id = classpost_Id;
	}
	
	@Column(nullable=false)    //非空处理,赋予默认值为0
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="student_messageId")    //一对多映射关系，对应学生信息表
	public Set<StudentMessage> getSet() {
		return set;
	}
	public void setSet(Set<StudentMessage> set) {
		this.set = set;
	}

}
