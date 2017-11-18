package com.jhon.rain.mapper;

import com.jhon.rain.entity.SysAclModule;

/**
 * <p>功能描述</br> </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysAclModuleMapper
 * @date 2017/11/18 9:09
 */
public interface SysAclModuleMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(SysAclModule record);

	int insertSelective(SysAclModule record);

	SysAclModule selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysAclModule record);

	int updateByPrimaryKey(SysAclModule record);
}