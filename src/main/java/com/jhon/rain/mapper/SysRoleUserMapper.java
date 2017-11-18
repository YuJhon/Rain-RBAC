package com.jhon.rain.mapper;

import com.jhon.rain.entity.SysRoleUser;

/**
 * <p>功能描述</br> </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysRoleUserMapper
 * @date 2017/11/18 9:09
 */
public interface SysRoleUserMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(SysRoleUser record);

	int insertSelective(SysRoleUser record);

	SysRoleUser selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysRoleUser record);

	int updateByPrimaryKey(SysRoleUser record);
}