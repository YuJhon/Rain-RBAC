package com.jhon.rain.entity;

import java.util.Date;

/**
 * <p>功能描述</br>权限表实体 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysAcl
 * @date 2017/11/18 9:09
 */
public class SysAcl {

	/**
	 * 权限id
	 */
	private Integer id;

	/**
	 * 权限码
	 */
	private String code;

	/**
	 * 权限名称
	 */
	private String name;

	/**
	 * 权限所在的权限模块id
	 */
	private Integer aclModuleId;

	/**
	 * 请求的url, 可以填正则表达式
	 */
	private String url;

	/**
	 * 类型，1：菜单，2：按钮，3：其他
	 */
	private Integer type;

	/**
	 * 状态，1：正常，0：冻结
	 */
	private Integer status;

	/**
	 * 权限在当前模块下的顺序，由小到大
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
	 * 最后一次更新时间
	 */
	private Date operateTime;

	/**
	 * 最后一个更新者的ip地址
	 */
	private String operateIp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getAclModuleId() {
		return aclModuleId;
	}

	public void setAclModuleId(Integer aclModuleId) {
		this.aclModuleId = aclModuleId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
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