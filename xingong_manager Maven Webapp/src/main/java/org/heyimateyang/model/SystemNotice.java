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
 * @author heyimateyang
 * @Description 系统公告model
 * @Description 实现Serializable接口实现序列化
 * 
 */


@Entity
@Table(name = "tbl_systemnotice")
public class SystemNotice implements Serializable{
	
	private static final long serialVersionUID = -347031885334010772L;
	
	private int system_noticeId;        //表id
	private Date systemNotice_data;	   //发表日期
	private String notice_message;	  //公告内容
	private String notice_name;		 //发起公告人
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getSystem_noticeId() {
		return system_noticeId;
	}
	public void setSystem_noticeId(int system_noticeId) {
		this.system_noticeId = system_noticeId;
	}
	
	@Column(nullable = false)    //非空设置
	public Date getSystemNotice_data() {
		return systemNotice_data;
	}
	public void setSystemNotice_data(Date systemNotice_data) {
		this.systemNotice_data = systemNotice_data;
	}
	
	@Column(nullable = false)    //非空设置
	public String getNotice_message() {
		return notice_message;
	}
	public void setNotice_message(String notice_message) {
		this.notice_message = notice_message;
	}
	
	@Column(nullable = false)    //非空设置
	public String getNotice_name() {
		return notice_name;
	}
	public void setNotice_name(String notice_name) {
		this.notice_name = notice_name;
	}

}
