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
 * @Description 获奖等级model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_winninggrade")
public class WinningGrade implements Serializable{

	private static final long serialVersionUID = 5602800795069813377L;
	
	private int winning_gradeId;							//表Id
	private String winning_grade;						   //奖状等级
	private Set<StudentWinning> studentWinning;			  //一对多映射关系,对应学生奖状信息model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getWinning_gradeId() {
		return winning_gradeId;
	}
	public void setWinning_gradeId(int winning_gradeId) {
		this.winning_gradeId = winning_gradeId;
	}
	
	@Column(nullable = false)
	public String getWinning_grade() {
		return winning_grade;
	}
	public void setWinning_grade(String winning_grade) {
		this.winning_grade = winning_grade;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="student_winningId")
	public Set<StudentWinning> getStudentWinning() {
		return studentWinning;
	}
	public void setStudentWinning(Set<StudentWinning> studentWinning) {
		this.studentWinning = studentWinning;
	}
	
	
	
}
