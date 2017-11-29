package com.jhon.rain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


/**
 * <p>功能描述</br>用户实体</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysUser
 * @date 2017/11/18 9:09
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SysUser {

	/**
	 * 用户id
	 */
	private Integer id;

	/**
	 * 用户名称
	 */
	private String username;

	/**
	 * 手机号
	 */
	private String telephone;

	/**
	 * 邮箱
	 */
	private String mail;

	/**
	 * 加密后的密码
	 */
	private String password;

	/**
	 * 用户所在部门的id
	 */
	private Integer deptId;

	/**
	 * 状态，1：正常，0：冻结状态，2：删除
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
	 * 最后一次更新时间
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail == null ? null : mail.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
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