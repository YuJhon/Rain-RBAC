package com.jhon.rain.aop;

import com.jhon.rain.helper.CustomBeanValidator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>功能描述</br> 参数校验的AOP</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName BeanCheckAOP
 * @date 2017/11/18 19:53
 */
@Component
@Aspect
public class BeanCheckAOP {

	/**
	 * 指定切入点【指定参数类型为VO包中的类】
	 **/
	@Pointcut("execution(* com.jhon.rain.service..*.*(com.jhon.rain.pojo.vo.*))")
	public void executeService() {

	}

	/**
	 * 前置通知的参数校验
	 * @param jp
	 */
	@Before("executeService()")
	public void doBeforeAdvice(JoinPoint jp) {
		Object[] args = jp.getArgs();
		CustomBeanValidator.check(args[0]);
	}
}
