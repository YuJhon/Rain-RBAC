package com.jhon.rain.entity;

/**
 * <p>功能描述</br>日志记录的新旧值的记录表</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysLogWithBLOBs
 * @date 2017/11/18 9:09
 */
public class SysLogWithBLOBs extends SysLog {
	/**
	 * 旧值(text)
	 */
	private String oldValue;

	/**
	 * 新值(text)
	 */
	private String newValue;

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue == null ? null : oldValue.trim();
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue == null ? null : newValue.trim();
	}
}