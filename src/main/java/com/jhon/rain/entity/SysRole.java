package com.jhon.rain.entity;

import java.util.Date;

/**
 * <p>功能描述</br>角色表</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysRole
 * @date 2017/11/18 9:09
 */
public class SysRole {

	/**
	 * 角色id
	 */
	private Integer id;

	/**
	 * 角色名称
	 */
	private String name;

	/**
	 * 角色的类型，1：管理员角色，2：其他
	 */
	private Integer type;

	/**
	 * 状态，1：可用，0：冻结
	 */
	private Integer status;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 操作者
	 */
	private String operator;

	/**
	 * 最后一次更新的时间
	 */
	private Date operateTime;

	/**
	 * 最后一次更新者的ip地址
	 */
	private String operateIp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator == null ? null : operator.trim();
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperateIp() {
		return operateIp;
	}

	public void setOperateIp(String operateIp) {
		this.operateIp = operateIp == null ? null : operateIp.trim();
	}
}