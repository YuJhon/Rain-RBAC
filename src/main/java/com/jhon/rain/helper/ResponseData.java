package com.jhon.rain.helper;

import lombok.Data;

/**
 * <p>功能描述</br> 返回对象的定义 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName ResponseData
 * @date 2017/11/18 13:26
 */
@Data
public class ResponseData<T> {

	/**
	 * 返回码
	 **/
	private String code;

	/**
	 * 返回消息
	 */
	private String msg;

	/**
	 * 返回对象
	 */
	private T data;

	public ResponseData(){}

	public ResponseData(String code, T data) {
		this.code = code;
		this.data = data;
	}

	public ResponseData(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public ResponseData(String code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
}
