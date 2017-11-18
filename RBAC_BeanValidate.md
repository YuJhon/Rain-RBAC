#### SpringBoot中自定义CustomBeanValidator
* 效果图如下：
![BeanValidateUsageResult](./photos/BeanValidateUsageResult.png)

* 自定义BeanValidate
```java
package com.jhon.rain.helper;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.*;

/**
 * <p>功能描述</br> 自定义的bean的校验器 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CustomBeanValidator
 * @date 2017/11/18 14:38
 */
public class CustomBeanValidator {

	private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

	/**
	 * <pre> 校验器 </pre>
	 *
	 * @param t
	 * @param groups
	 * @param <T>
	 * @return
	 */
	public static <T> Map<String, String> validate(T t, Class<?>... groups) {
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<T>> validateResult = validator.validate(t, groups);
		if (validateResult.isEmpty()) {
			return Collections.emptyMap();
		} else {
			LinkedHashMap errors = Maps.newLinkedHashMap();
			Iterator<ConstraintViolation<T>> iterator = validateResult.iterator();
			while (iterator.hasNext()) {
				ConstraintViolation<T> violation = iterator.next();
				errors.put(violation.getPropertyPath().toString(), violation.getMessage());
			}
			return errors;
		}
	}

	/**
	 * <pre>集合的校验</pre>
	 *
	 * @param collection
	 * @return
	 */
	public static Map<String, String> validateList(Collection<?> collection) {
		Preconditions.checkNotNull(collection);
		Iterator<?> iterator = collection.iterator();
		Map errors;

		do {
			if (!iterator.hasNext()) {
				return Collections.emptyMap();
			} else {
				Object object = iterator.next();
				errors = validate(object, new Class[0]);
			}
		} while (errors.isEmpty());
		return errors;
	}

	/**
	 * <pre>统一的校验方法 </pre>
	 *
	 * @param first
	 * @param objects
	 * @return
	 */
	public static Map<String, String> validateObject(Object first, Object... objects) {
		if (objects != null && objects.length > 0) {
			return validateList(Lists.asList(first, objects));
		} else {
			return validate(first, new Class[0]);
		}
	}

	/**
	 * <pre>VO参数的校验入口</pre>
	 *
	 * @param param
	 */
	public static void check(Object param) {
		Map<String, String> map = CustomBeanValidator.validateObject(param);
		if (MapUtils.isNotEmpty(map)) {
			throw new RbacParamException(map.toString());
		}
	}
}
```

* 自定义RBACParamException,实现异常的统一拦截
```java
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

```

* 编写测试类
```java
package com.jhon.rain.controller;

import com.jhon.rain.entity.SysUser;
import com.jhon.rain.helper.ResponseData;
import com.jhon.rain.helper.ResponseUtil;
import com.jhon.rain.pojo.dto.SysUserDTO;
import com.jhon.rain.pojo.vo.SysUserVO;
import com.jhon.rain.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

/**
 * <p>功能描述</br> 用户控制器 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysUserController
 * @date 2017/11/15 9:09
 */
@RestController
@RequestMapping("/sys/user")
@Slf4j
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	/**
	 * <pre>查询用户信息</pre>
	 *
	 * @param id 用户主键
	 * @return
	 */
	@RequestMapping("/{id}")
	public ResponseData<SysUser> getRecordById(@PathVariable(name = "id", required = true) Integer id) {
		log.info("INFO Log Level,UserId={}", id);
		return ResponseUtil.success(sysUserService.findById(id));
	}

	/**
	 * <pre>查询所有的记录</pre>
	 * @return
	 */
	@RequestMapping("/list")
	public ResponseData<List<SysUser>> getRecords() {
		return ResponseUtil.success(sysUserService.findAll());
	}

	/**
	 * <pre>新增用户</pre>
	 * @param sysUserVO
	 * @return
	 */
	@PostMapping
	public ResponseData<SysUserVO> save(@RequestBody SysUserVO sysUserVO){
		return ResponseUtil.success(sysUserService.save(sysUserVO));
	}
}
```