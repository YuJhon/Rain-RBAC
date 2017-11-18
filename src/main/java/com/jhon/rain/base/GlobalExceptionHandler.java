package com.jhon.rain.base;

import com.jhon.rain.constants.RespCodeConstants;
import com.jhon.rain.helper.RbacParamException;
import com.jhon.rain.helper.ResponseData;
import com.jhon.rain.helper.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>功能描述</br> 全局的异常处理器 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName GlobalExceptionHandler
 * @date 2017/11/18 15:28
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(value = RbacParamException.class)
	public ResponseData<?> rbacParamsValidateExceptionHandler(HttpServletRequest request,
	                                                          RbacParamException paramException) {
		return ResponseUtil.error(RespCodeConstants.REQUEST_PARAMS_VALIDATE_EXCEP, paramException.getMessage());
	}
}
