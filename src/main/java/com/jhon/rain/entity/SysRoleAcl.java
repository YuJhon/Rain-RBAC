package com.jhon.rain.entity;

import java.util.Date;

/**
 * <p>功能描述</br>角色和权限表关系</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysRoleAcl
 * @date 2017/11/18 9:09
 */
public class SysRoleAcl {
	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 角色id
	 */
	private Integer roleId;

	/**
	 * 权限id
	 */
	private Integer aclId;

	/**
	 * 操作者
	 */
	private String operator;

	/**
	 * 最后一次更新的时间
	 */
	private Date operateTime;

	/**
	 * 最后一次更新者的ip
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

	public Integer getAclId() {
		return aclId;
	}

	public void setAclId(Integer aclId) {
		this.aclId = aclId;
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