package com.jhon.rain.controller;

import com.jhon.rain.entity.SysUser;
import com.jhon.rain.helper.ResponseData;
import com.jhon.rain.helper.ResponseUtil;
import com.jhon.rain.pojo.vo.SysUserVO;
import com.jhon.rain.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
	public ResponseData<List<SysUser>> getRecords(HttpServletRequest request) {
		log.info("RequestURI:{}",request.getRequestURI());
		log.info("Method:{}",request.getMethod());
		log.info("RequestURL:{}",request.getRequestURL());
		log.info("RemoteAddr:{}",request.getRemoteAddr());
		log.info("RemoteHost:{}",request.getRemoteHost());
		log.info("ContentType:{}",request.getContentType());
		log.info("CharacterEncoding:{}",request.getCharacterEncoding());
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
