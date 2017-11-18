package com.jhon.rain.constants;

/**
 * <p>功能描述</br> 返回码定义 :</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName RespCodeConstants
 * @date 2017/11/18 13:31
 */
public class RespCodeConstants {

	/** 默认成功返回码 **/
	public static final String SYS_DEFAULT_SUCCESS = "0";

	/** 默认系统异常返回码 **/
	public static final String SYS_DEFAULT_EXCEPTION = "999999";

	/** 按照业务逻辑模块来区分不同的返回码 ：通过第一个数字来区分 **/

	/** 参数异常的默认错误码 **/
	public static final String REQUEST_PARAMS_VALIDATE_EXCEP = "800000";
}
