package com.hunter.task.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/****
 * @Author:shenkunlin
 * @Description:Task构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Task",value = "Task")
@Table(name="task")
public class Task implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//id

	@ApiModelProperty(value = "发起人id",required = false)
    @Column(name = "sponsor_id")
	private Integer sponsorId;//发起人id

	@ApiModelProperty(value = "类型",required = false)
    @Column(name = "type")
	private String type;//类型

	@ApiModelProperty(value = "内容",required = false)
    @Column(name = "content")
	private String content;//内容

	@ApiModelProperty(value = "联系方式",required = false)
    @Column(name = "contact")
	private String contact;//联系方式

	@ApiModelProperty(value = "价格",required = false)
    @Column(name = "money")
	private Double money;//价格

	@ApiModelProperty(value = "是否已被接收",required = false)
    @Column(name = "is_accepted")
	private String isAccepted;//是否已被接收

	@ApiModelProperty(value = "",required = false)
    @Column(name = "sponser_time")
	private Date sponserTime;//



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public Integer getSponsorId() {
		return sponsorId;
	}

	//set方法
	public void setSponsorId(Integer sponsorId) {
		this.sponsorId = sponsorId;
	}
	//get方法
	public String getType() {
		return type;
	}

	//set方法
	public void setType(String type) {
		this.type = type;
	}
	//get方法
	public String getContent() {
		return content;
	}

	//set方法
	public void setContent(String content) {
		this.content = content;
	}
	//get方法
	public String getContact() {
		return contact;
	}

	//set方法
	public void setContact(String contact) {
		this.contact = contact;
	}
	//get方法
	public Double getMoney() {
		return money;
	}

	//set方法
	public void setMoney(Double money) {
		this.money = money;
	}
	//get方法
	public String getIsAccepted() {
		return isAccepted;
	}

	//set方法
	public void setIsAccepted(String isAccepted) {
		this.isAccepted = isAccepted;
	}
	//get方法
	public Date getSponserTime() {
		return sponserTime;
	}

	//set方法
	public void setSponserTime(Date sponserTime) {
		this.sponserTime = sponserTime;
	}


}
