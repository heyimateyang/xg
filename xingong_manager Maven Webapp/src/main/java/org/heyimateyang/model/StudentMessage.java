package org.heyimateyang.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author heyimateyang
 * @Description StudentMessage信息model
 * @Description 实现Serializable接口实现序列化
 *
 */

@Entity
@Table(name = "tbl_studemnmessage")
public class StudentMessage implements Serializable{

	private static final long serialVersionUID = -2292470297599405909L;
	
	private int student_messageId;						                              //表id
	private int student_number;							                             //学号
	private String student_name;                                                    //姓名
	private String student_Idcard;                                                 //身份证号码
	private String place_origin;					                              //籍贯
	private double height;						                                 //身高
	private double weight;						                                //体重
	private String nation;						                               //民族
	private long phone_number;					                              //手机电话号码
	private String address;					                                 //家庭住址
	private String home_number;				                                //家庭电话
	private String emergency_contact;		                               //紧急联系人
	private long emergency_number;			                              //紧急联系人电话号码
	private long qq_number;				                                 //QQ号码
	private String wechat;				                                //微信
	private String email;				                               //电子邮件
	private int sex;					                              //性别
	private Date birthday;			                                 //生日
	private Date entrance_date;		                                //入学日期
	private String interest;		                               //兴趣爱好
	private String association_name;                              //参加的组织
	private String association_duties;                           //组织职务
	private int poor;				                            //判定是否贫困生       0否1是
	private String remarks;			                           //备注
	private int state;			                              //在读状态 		   0否1是  
	private int political_state;						     //政治面貌审批状态  0没审批,1辅导员助理,2辅导员,3管理员
	private String dormitory;                               //宿舍
	private String school_name;	                           //学校名字
	private int chat_state;								  //回复信息状态,初始化为0，当点击进去后,恢复为0
	private StudentPortrait studentPortrait;             //学生照片一对一映射关系,对应照片表
	private ClassPost classPost;						//多对一映射关系,对应班级职务表
	private PoliticalLandscape politicalLandscape;     //多对一映射关系,对应政治面貌model
	private StudentLeave studentLeave;                //多对一映射关系,对应请假model
	private ClassMessage classMessage;				 //多对一映射关系,对应班级model
	private StudentWinning studentWinning;			//多对一映射关系,对应学生奖状model
	private AssistantChat assistantChat;		   //多对一映射关系,对应私聊助理信息model
	private InstructorChat instructorChat;		  //多对一映射关系,对应私聊辅导员model
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //主键策略为自动,方便系统移植
	public int getStudent_messageId() {
		return student_messageId;
	}
	
	@Column(nullable = false)
	public int getStudent_number() {
		return student_number;
	}
	
	@Column(nullable = false)
	public String getStudent_name() {
		return student_name;
	}
	
	@Column(nullable = false)
	public String getStudent_Idcard() {
		return student_Idcard;
	}
	
	@Column(nullable = false)
	public String getPlace_origin() {
		return place_origin;
	}
	
	@Column(nullable = false)
	public double getHeight() {
		return height;
	}
	
	@Column()
	public double getWeight() {
		return weight;
	}
	
	@Column(nullable = false)
	public String getNation() {
		return nation;
	}
	
	@Column(nullable = false)
	public long getPhone_number() {
		return phone_number;
	}
	
	@Column(nullable = false)
	public String getAddress() {
		return address;
	}
	
	@Column(nullable = false)
	public String getHome_number() {
		return home_number;
	}
	
	@Column(nullable = false)
	public String getEmergency_contact() {
		return emergency_contact;
	}
	
	@Column(nullable = false)
	public long getEmergency_number() {
		return emergency_number;
	}
	
	@Column(nullable = false)
	public long getQq_number() {
		return qq_number;
	}
	
	@Column(nullable = false)
	public String getWechat() {
		return wechat;
	}
	
	@Column(nullable = false)
	public String getEmail() {
		return email;
	}
	
	@Column(nullable = false)
	public int getSex() {
		return sex;
	}
	
	@Column(nullable = false)
	public Date getBirthday() {
		return birthday;
	}
	
	@Column(nullable = false)
	public Date getEntrance_date() {
		return entrance_date;
	}
	
	@Column(nullable = false)
	public String getInterest() {
		return interest;
	}
	
	@Column(nullable = false)
	public String getAssociation_name() {
		return association_name;
	}
	
	@Column(nullable = false)
	public String getAssociation_duties() {
		return association_duties;
	}
	
	@Column(nullable = false)
	public int getPoor() {
		return poor;
	}
	
	@Column(nullable = false)
	public String getRemarks() {
		return remarks;
	}
	
	@Column(nullable = false)
	public int getState() {
		return state;
	}
	
	@Column(nullable = false)
	public int getPolitical_state() {
		return political_state;
	}
	
	@Column(nullable = false)
	public String getDormitory() {
		return dormitory;
	}
	
	@Column(nullable = false)
	public String getSchool_name() {
		return school_name;
	}
	
	@Column(nullable = false)
	public int getChat_state() {
		return chat_state;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "portrait_Id")
	public StudentPortrait getStudentPortrait() {
		return studentPortrait;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "classpost_Id")
	public ClassPost getClassPost() {
		return classPost;
	}
	
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "political_landscapeId")
	public PoliticalLandscape getPoliticalLandscape() {
		return politicalLandscape;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "student_leaveId")
	public StudentLeave getStudentLeave() {
		return studentLeave;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "classmessage_Id")
	public ClassMessage getClassMessage() {
		return classMessage;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "student_winningId")
	public StudentWinning getStudentWinning() {
		return studentWinning;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "assistant_chatId")
	public AssistantChat getAssistantChat() {
		return assistantChat;
	}
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)        //多对一的映射关系
	@JoinColumn(name = "instructor_chatId")
	public InstructorChat getInstructorChat() {
		return instructorChat;
	}
	
	
	
	public void setStudent_messageId(int student_messageId) {
		this.student_messageId = student_messageId;
	}
	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public void setStudent_Idcard(String student_Idcard) {
		this.student_Idcard = student_Idcard;
	}
	public void setPlace_origin(String place_origin) {
		this.place_origin = place_origin;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setHome_number(String home_number) {
		this.home_number = home_number;
	}
	public void setEmergency_contact(String emergency_contact) {
		this.emergency_contact = emergency_contact;
	}
	public void setEmergency_number(long emergency_number) {
		this.emergency_number = emergency_number;
	}
	public void setQq_number(long qq_number) {
		this.qq_number = qq_number;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setEntrance_date(Date entrance_date) {
		this.entrance_date = entrance_date;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public void setAssociation_name(String association_name) {
		this.association_name = association_name;
	}
	public void setAssociation_duties(String association_duties) {
		this.association_duties = association_duties;
	}
	public void setPoor(int poor) {
		this.poor = poor;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public void setState(int state) {
		this.state = state;
	}
	public void setPolitical_state(int political_state) {
		this.political_state = political_state;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public void setChat_state(int chat_state) {
		this.chat_state = chat_state;
	}
	public void setStudentPortrait(StudentPortrait studentPortrait) {
		this.studentPortrait = studentPortrait;
	}
	public void setClassPost(ClassPost classPost) {
		this.classPost = classPost;
	}
	public void setPoliticalLandscape(PoliticalLandscape politicalLandscape) {
		this.politicalLandscape = politicalLandscape;
	}
	public void setStudentLeave(StudentLeave studentLeave) {
		this.studentLeave = studentLeave;
	}
	public void setClassMessage(ClassMessage classMessage) {
		this.classMessage = classMessage;
	}
	public void setStudentWinning(StudentWinning studentWinning) {
		this.studentWinning = studentWinning;
	}
	public void setAssistantChat(AssistantChat assistantChat) {
		this.assistantChat = assistantChat;
	}
	public void setInstructorChat(InstructorChat instructorChat) {
		this.instructorChat = instructorChat;
	}
	
	

}
