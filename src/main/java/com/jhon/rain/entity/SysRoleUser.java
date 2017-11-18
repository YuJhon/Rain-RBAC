package com.jhon.rain.entity;

import java.util.Date;

/**
 * <p>功能描述</br>角色和用户的关联关系</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysRoleUser
 * @date 2017/11/18 9:09
 */
public class SysRoleUser {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 角色id
	 */
	private Integer roleId;

	/**
	 * 用户Id
	 */
	private Integer userId;

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

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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