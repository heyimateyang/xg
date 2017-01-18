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
 * @Description 随机盐密码model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_studentsalt")
public class StudentSalt implements Serializable{

	private static final long serialVersionUID = -576463283774757805L;
	
	private int salt_Id;						//表id
	private long random_salte;				   //随机盐数字
	private Set<StudentLogin> studentLogin; 		  //一对一映射关系,对应studentModel
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getSalt_Id() {
		return salt_Id;
	}
	
	public void setSalt_Id(int salt_Id) {
		this.salt_Id = salt_Id;
	}
	
	@Column(nullable=false)    //非空处理,赋予默认值为0
	public long getRandom_salte() {
		return random_salte;
	}
	public void setRandom_salte(long random_salte) {
		this.random_salte = random_salte;
	}

	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "student_loginId")
	public Set<StudentLogin> getStudentLogin() {
		return studentLogin;
	}

	public void setStudentLogin(Set<StudentLogin> studentLogin) {
		this.studentLogin = studentLogin;
	}
	
	

}
