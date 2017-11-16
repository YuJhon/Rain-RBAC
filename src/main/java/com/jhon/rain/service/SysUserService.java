package com.jhon.rain.service;

import com.jhon.rain.entity.SysUser;

/**
 * <p>功能描述</br> 系统用户业务接口定义 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysUserService
 * @date 2017/11/15 9:02
 */
public interface SysUserService {
	/**
	 * <pre>通过主键查询记录</pre>
	 * @param id 主键
	 * @return 对应的用户信息
	 */
	SysUser findById(Integer id);
}
