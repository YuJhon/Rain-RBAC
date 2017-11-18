package com.jhon.rain.helper;

import com.jhon.rain.entity.SysUser;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>功能描述</br> 请求辅助器 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName RequestHolder
 * @date 2017/11/18 11:45
 */
public class RequestHolder {

	private RequestHolder() {
	}

	private static final ThreadLocal<SysUser> USER_HOLDER = new ThreadLocal<SysUser>();

	private static final ThreadLocal<HttpServletRequest> REQUEST_HOLDER = new ThreadLocal<HttpServletRequest>();

	/**
	 * <pre>将当前用户添加到线程局部变量中</pre>
	 * @param sysUser
	 */
	public static void add(SysUser sysUser) {
		USER_HOLDER.set(sysUser);
	}

	/**
	 * <pre>将当前请求对象添加到线程局部变量中</pre>
	 * @param request
	 */
	public static void add(HttpServletRequest request) {
		REQUEST_HOLDER.set(request);
	}

	/**
	 * <pre>获取当前用户</pre>
	 */
	public static SysUser getCurrentUser() {
		return USER_HOLDER.get();
	}

	/**
	 * <pre>获取当前的请求对象</pre>
	 */
	public static HttpServletRequest getCurrentRequest() {
		return REQUEST_HOLDER.get();
	}

	/**
	 * <pre>清空数据</pre>
	 */
	public static void remove() {
		USER_HOLDER.remove();
		REQUEST_HOLDER.remove();
	}
}
