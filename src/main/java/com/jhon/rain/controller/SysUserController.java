package com.jhon.rain.controller;

import com.jhon.rain.entity.SysUser;
import com.jhon.rain.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	/**
	 * <pre>查询用户信息</pre>
	 * @param id 用户主键
	 * @return
	 */
	@RequestMapping("/{id}")
	public SysUser getRecordById(@PathVariable(name = "id",required = true) Integer id){
		return sysUserService.findById(id);
	}
}
