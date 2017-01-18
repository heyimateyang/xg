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
 * @Description 政治面貌model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_politicallandscape")
public class PoliticalLandscape implements Serializable{

	private static final long serialVersionUID = -6910488404695707444L;
	
	private int political_landscapeId;						//表Id
	private String political_name;						   //政治面貌
	private Set<StudentMessage> studentMessages; 		  //一对多映射关系,对应学生信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getPolitical_landscapeId() {
		return political_landscapeId;
	}
	public void setPolitical_landscapeId(int political_landscapeId) {
		this.political_landscapeId = political_landscapeId;
	}
	
	@Column()
	public String getPolitical_name() {
		return political_name;
	}
	public void setPolitical_name(String political_name) {
		this.political_name = political_name;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="student_messageId")    //一对多映射关系，对应学生信息表
	public Set<StudentMessage> getStudentMessages() {
		return studentMessages;
	}	
	public void setStudentMessages(Set<StudentMessage> studentMessages) {
		this.studentMessages = studentMessages;
	}

}
