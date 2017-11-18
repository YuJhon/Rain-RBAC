package com.jhon.rain.mapper;

import com.jhon.rain.entity.SysRoleAcl;

/**
 * <p>功能描述</br> </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysRoleAclMapper
 * @date 2017/11/18 9:09
 */
public interface SysRoleAclMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(SysRoleAcl record);

	int insertSelective(SysRoleAcl record);

	SysRoleAcl selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysRoleAcl record);

	int updateByPrimaryKey(SysRoleAcl record);
}