package org.heyimateyang.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author heyimateyang
 * @Description 系统IP黑名单modle
 * @Description 实现Serializable接口实现序列化
 */


@Entity
@Table(name = "tbl_blackip")
public class BlacklistIp implements Serializable{

	private static final long serialVersionUID = 8999142801894409639L;
	
	private int black_ipId;					//表Id
	private String black_ip;			   //黑名单Ip
	private int locked;                   //IP状态1为锁住
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getBlack_ipId() {
		return black_ipId;
	}
	public void setBlack_ipId(int black_ipId) {
		this.black_ipId = black_ipId;
	}
	
	@Column()
	public int getLocked() {
		return locked;
	}
	public void setLocked(int locked) {
		this.locked = locked;
	}
	
	@Column()
	public String getBlack_ip() {
		return black_ip;
	}
	public void setBlack_ip(String black_ip) {
		this.black_ip = black_ip;
	}

}
