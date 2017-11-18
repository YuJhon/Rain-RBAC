package com.jhon.rain.entity;

import java.util.Date;

/**
 * <p>功能描述</br>部门实体类 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysDept
 * @date 2017/11/18 9:09
 */
public class SysDept {
	/**
	 * 部门id
	 */
	private Integer id;
	/**
	 * 部门名称
	 */
	private String name;

	/**
	 * 上级部门id
	 */
	private Integer parentId;

	/**
	 * 部门层级
	 */
	private String level;

	/**
	 * 部门在当前层级下的顺序，从小到大
	 */
	private Integer seq;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 操作者
	 */
	private String operator;

	/**
	 * 操作时间
	 */
	private Date operateTime;

	/**
	 * 操作者的ip
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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level == null ? null : level.trim();
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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