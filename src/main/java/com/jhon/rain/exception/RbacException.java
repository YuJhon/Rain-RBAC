package com.jhon.rain.exception;

/**
 * <p>功能描述</br> 自定义参数异常 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName RbacException
 * @date 2017/11/18 14:58
 */
public class RbacException extends RuntimeException {

	public RbacException(String msg) {
		super(msg);
	}
}
