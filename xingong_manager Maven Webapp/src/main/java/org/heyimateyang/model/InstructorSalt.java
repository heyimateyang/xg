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
 * @Description 辅导员随机盐model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_instructorsalt")
public class InstructorSalt implements Serializable{

	private static final long serialVersionUID = -2640713798693958378L;
	
	private int instructor_saltId;				//表Id
	private String instructor_salt;			   //辅导员密码随机盐
	private Set<InstructorLogin> instructorLogin;  //一对一映射关系,对应辅导员model
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getInstructor_saltId() {
		return instructor_saltId;
	}
	public void setInstructor_saltId(int instructor_saltId) {
		this.instructor_saltId = instructor_saltId;
	}
	
	@Column(nullable=false)    //非空处理
	public String getInstructor_salt() {
		return instructor_salt;
	}
	public void setInstructor_salt(String instructor_salt) {
		this.instructor_salt = instructor_salt;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "instructor_loginId")
	public Set<InstructorLogin> getInstructorLogin() {
		return instructorLogin;
	}
	public void setInstructorLogin(Set<InstructorLogin> instructorLogin) {
		this.instructorLogin = instructorLogin;
	}
	
	
	
	

}
