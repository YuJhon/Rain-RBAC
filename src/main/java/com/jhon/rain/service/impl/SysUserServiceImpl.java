package com.jhon.rain.service.impl;

import com.jhon.rain.entity.SysUser;
import com.jhon.rain.mapper.SysUserMapper;
import com.jhon.rain.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>功能描述</br> 系统用户业务逻辑接口实现类 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysUserServiceImpl
 * @date 2017/11/15 9:03
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser findById(Integer id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
