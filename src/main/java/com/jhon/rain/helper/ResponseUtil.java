package com.jhon.rain.helper;

import com.jhon.rain.constants.RespCodeConstants;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>功能描述</br> 返回类的工具处理 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName ResponseUtil
 * @date 2017/11/18 13:34
 */
@Slf4j
public class ResponseUtil {

	private ResponseUtil() {
	}

	/**
	 * <pre>生成返回结果</pre>
	 *
	 * @param code 返回码
	 * @param msg  返回消息
	 * @param data 返回对象
	 * @param <T>  泛型
	 * @return
	 */
	public static <T> ResponseData<T> genResult(String code, String msg, T data) {
		ResponseData<T> result = new ResponseData<>();
		result.setCode(code);
		result.setMsg(msg);
		result.setData(data);
		if (log.isDebugEnabled()) {
			log.debug("Response REST Result:{}", result);
		}
		return result;
	}

	/**
	 * <pre>成功返回对象封装 </pre>
	 *
	 * @param data 返回结果数据
	 * @return
	 */
	public static <T> ResponseData<T> success(T data) {
		return genResult(RespCodeConstants.SYS_DEFAULT_SUCCESS, "", data);
	}

	/**
	 * <pre>默认的成功返回结果</pre>
	 *
	 * @return
	 */
	public static ResponseData success() {
		return genResult(RespCodeConstants.SYS_DEFAULT_SUCCESS, "", null);
	}

	/**
	 * <pre>错误结果组装</pre>
	 *
	 * @param code 错误码
	 * @param msg  错误码对应的消息
	 * @return
	 */
	public static <T> ResponseData<T> error(String code, String msg) {
		return genResult(code, msg, null);
	}

	/**
	 * <pre>错误结果返回组装</pre>
	 *
	 * @param code 错误码
	 * @param msg  错误码对应的消息
	 * @param data 附带信息
	 * @return
	 */
	public static <T> ResponseData<T> error(String code, String msg, T data) {
		return genResult(code, msg, data);
	}
}
