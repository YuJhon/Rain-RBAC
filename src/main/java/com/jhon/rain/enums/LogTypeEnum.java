package com.jhon.rain.enums;

import lombok.Getter;

/**
 * <p>功能描述</br> 日志类型</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName LogTypeEnum
 * @date 2017/11/18 10:54
 */
@Getter
public enum LogTypeEnum {

	DEPT(1, "DEPT"),
	USER(2, "USER"),
	ACL_MODULE(3, "ACL_MODULE"),
	ACL(4, "ACL"),
	ROLE(5, "ROLE"),
	ROLE_ACL(6, "ROLE_ACL"),
	ROLE_USER(7, "ROLE_USER");

	private int value;

	private String desc;

	LogTypeEnum(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}


}
