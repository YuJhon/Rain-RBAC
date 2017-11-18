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
