package com.jhon.rain.util;


import org.apache.commons.lang3.StringUtils;

/**
 * <p>功能描述</br> 层级工具类 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName LevelUtil
 * @date 2017/11/18 19:41
 */
public class LevelUtil {

	private final static String SEPARATOR = ".";

	private final static String ROOT = "0";

	/**
	 * <pre>计算层级关系 </pre>
	 *
	 * @param parentLevel
	 * @param parentId
	 * @return
	 */
	public static String calculateLevel(String parentLevel, int parentId) {
		if (StringUtils.isBlank(parentLevel)) {
			return ROOT;
		} else {
			return StringUtils.join(parentLevel, SEPARATOR, parentId);
		}
	}
}
