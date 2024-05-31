package com.hunter.order.pojo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.lang.Integer;
/****
 * @Author:shenkunlin
 * @Description:Order构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Order",value = "Order")
@Table(name="task_order")
public class Order implements Serializable{

	@ApiModelProperty(value = "",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "task_id")
	private Integer taskId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "acceptor_id")
	private Integer acceptorId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "accept_time")
	private Date acceptTime;//



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public Integer getTaskId() {
		return taskId;
	}

	//set方法
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	//get方法
	public Integer getAcceptorId() {
		return acceptorId;
	}

	//set方法
	public void setAcceptorId(Integer acceptorId) {
		this.acceptorId = acceptorId;
	}
	//get方法
	public Date getAcceptTime() {
		return acceptTime;
	}

	//set方法
	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}


}
