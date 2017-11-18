package com.jhon.rain.dao;

import com.jhon.rain.entity.SysAcl;

/**
 * <p>功能描述</br> </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysAclMapper
 * @date 2017/11/18 9:09
 */
public interface SysAclMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(SysAcl record);

	int insertSelective(SysAcl record);

	SysAcl selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysAcl record);

	int updateByPrimaryKey(SysAcl record);
}