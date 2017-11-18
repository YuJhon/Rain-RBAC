package com.jhon.rain.entity;

import java.util.Date;

/**
 * <p>功能描述</br>系统权限变更日志表 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysLog
 * @date 2017/11/18 9:09
 */
public class SysLog {

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 权限更新的类型，1：部门，2：用户，3：权限模块，4：权限，5：角色，6：角色用户关系，7：角色权限关系
	 */
	private Integer type;

	/**
	 * 基于type后指定的对象id，比如用户、权限、角色等表的主键
	 */
	private Integer targetId;

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

	/**
	 * 当前是否复原过，0：没有，1：复原过
	 */
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getTargetId() {
		return targetId;
	}

	public void setTargetId(Integer targetId) {
		this.targetId = targetId;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}