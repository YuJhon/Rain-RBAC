package com.jhon.rain.service.impl;

import com.jhon.rain.entity.SysUser;
import com.jhon.rain.dao.SysUserMapper;
import com.jhon.rain.helper.CustomBeanValidator;
import com.jhon.rain.pojo.dto.SysUserDTO;
import com.jhon.rain.pojo.vo.SysUserVO;
import com.jhon.rain.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
@Slf4j
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser findById(Integer id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysUser> findAll() {
		return sysUserMapper.findAll();
	}

	@Override
	public SysUserVO save(SysUserVO sysUserVO) {
		CustomBeanValidator.check(sysUserVO);
		SysUser sysUser = new SysUser();
		BeanUtils.copyProperties(sysUserVO, sysUser);
		int record = sysUserMapper.insert(sysUser);
		log.info("Save Record Success,Id={}", sysUser.getId());
		sysUserVO.setId(sysUser.getId());
		return sysUserVO;
	}
}
