package com.jhon.rain.base;

import com.jhon.rain.constants.RespCodeConstants;
import com.jhon.rain.exception.RbacException;
import com.jhon.rain.exception.RbacViewException;
import com.jhon.rain.helper.ResponseData;
import com.jhon.rain.helper.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class GlobalExceptionHandler {

  @ExceptionHandler(value = RbacException.class)
  public ResponseData<?> rbacParamsValidateExceptionHandler(HttpServletRequest request,
                                                            RbacException rbacException) {
    if (rbacException instanceof RbacViewException) {
      /** 可见类型异常 **/
      log.error("来源于{}，异常接口请求{}：异常信息为：{}",request.getRemoteAddr(),request.getRequestURI(),rbacException.getMessage());
      return ResponseUtil.error(RespCodeConstants.REQUEST_PARAMS_VALIDATE_EXCEP, rbacException.getMessage());
    } else {
      /** 不可见类型异常  **/
      rbacException.printStackTrace();
      return ResponseUtil.error(RespCodeConstants.SYS_DEFAULT_EXCEPTION, "系统繁忙，请稍后再试！");
    }
  }
}
