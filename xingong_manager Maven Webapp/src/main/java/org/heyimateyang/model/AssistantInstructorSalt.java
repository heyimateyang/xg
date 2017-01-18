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
 * @Description 助理辅导员随机盐model
 * @Description 实现Serializable接口实现序列化
 *
 */


@Entity
@Table(name = "tbl_assistantinstructorsalt")
public class AssistantInstructorSalt implements Serializable{

	private static final long serialVersionUID = 7489898702998432350L;
	
	private int assistant_saltId;									//表Id
	private String assistant_salt;								   //随机盐
	private Set<AssistantInstructorLogin> assistantInstructorLogin;	  //一对一映射关系,对应助理辅导员登录model
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getAssistant_saltId() {
		return assistant_saltId;
	}
	public void setAssistant_saltId(int assistant_saltId) {
		this.assistant_saltId = assistant_saltId;
	}
	
	@Column(nullable = false)
	public String getAssistant_salt() {
		return assistant_salt;
	}
	public void setAssistant_salt(String assistant_salt) {
		this.assistant_salt = assistant_salt;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "assistant_instructorId")
	public Set<AssistantInstructorLogin> getAssistantInstructorLogin() {
		return assistantInstructorLogin;
	}
	public void setAssistantInstructorLogin(
			Set<AssistantInstructorLogin> assistantInstructorLogin) {
		this.assistantInstructorLogin = assistantInstructorLogin;
	}
	
	

}
