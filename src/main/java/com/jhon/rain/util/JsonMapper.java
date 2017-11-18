package com.jhon.rain.util;

import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;
import org.codehaus.jackson.type.TypeReference;

/**
 * <p>功能描述</br>Json工具类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName JsonMapper
 * @date 2017/11/18 19:32
 */
@Slf4j
public class JsonMapper {

	private static ObjectMapper objectMapper = new ObjectMapper();

	static {
		objectMapper.disable(DeserializationConfig.Feature.FAIL_ON_NULL_FOR_PRIMITIVES);
		objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.setFilters(new SimpleFilterProvider().setFailOnUnknownId(false));
		objectMapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
	}

	/**
	 * <pre>对象转换为json string</pre>
	 *
	 * @param src
	 * @param <T>
	 * @return
	 */
	public static <T> String obj2Str(T src) {
		if (src == null) {
			return null;
		}
		try {
			return src instanceof String ? (String) src : objectMapper.writeValueAsString(src);
		} catch (Exception e) {
			log.warn("parse object to String exception, error:{}", e);
			return null;
		}
	}

	/**
	 * <pre>json string转换为指定类型的对象 </pre>
	 *
	 * @param src
	 * @param typeReference
	 * @param <T>
	 * @return
	 */
	public static <T> T str2Obj(String src, TypeReference<T> typeReference) {
		if (src == null || typeReference == null) {
			return null;
		}
		try {
			return (T) (typeReference.getType().equals(String.class) ? src : objectMapper.readValue(src, typeReference));
		} catch (Exception e) {
			log.warn("parse String to Object exception, String:{}, TypeReference<T>:{}, error:{}", src, typeReference.getType(), e);
			return null;
		}
	}
}
