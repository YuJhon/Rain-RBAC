package com.jhon.rain.mapper;

import com.jhon.rain.entity.SysRole;

/**
 * <p>功能描述</br> </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysRoleMapper
 * @date 2017/11/18 9:09
 */
public interface SysRoleMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(SysRole record);

	int insertSelective(SysRole record);

	SysRole selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysRole record);

	int updateByPrimaryKey(SysRole record);
}