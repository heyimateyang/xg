package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author heyimateyang
 * @Description 系统操作记录modle
 * @Description 实现Serializable接口实现序列化
 */

@Entity
@Table(name = "tbl_systemoperate")
public class SystemOperate implements Serializable{

	private static final long serialVersionUID = -6846263297789947246L;
	
	private int system_operateId;        //表Id
	private Date system_operateDate;	//操作记录日期
	private String operate_message;	   //操作内容
	private String operate_name; 	  //操作人名字
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getSystem_operateId() {
		return system_operateId;
	}
	public void setSystem_operateId(int system_operateId) {
		this.system_operateId = system_operateId;
	}
	
	@Column(nullable = false)    //非空设置
	public Date getSystem_operateDate() {
		return system_operateDate;
	}
	public void setSystem_operateDate(Date system_operateDate) {
		this.system_operateDate = system_operateDate;
	}
	
	@Column(nullable = false)    //非空设置
	public String getOperate_message() {
		return operate_message;
	}
	public void setOperate_message(String operate_message) {
		this.operate_message = operate_message;
	}
	
	@Column(nullable = false)    //非空设置
	public String getOperate_name() {
		return operate_name;
	}
	public void setOperate_name(String operate_name) {
		this.operate_name = operate_name;
	}

}
