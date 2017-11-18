package com.jhon.rain.dao;

import com.jhon.rain.entity.SysUser;

import java.util.List;

/**
 * <p>功能描述</br> </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysUserMapper
 * @date 2017/11/18 9:09
 */
public interface SysUserMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(SysUser record);

	int insertSelective(SysUser record);

	SysUser selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysUser record);

	int updateByPrimaryKey(SysUser record);

	List<SysUser> findAll();
}