package com.jhon.rain.mapper;

import com.jhon.rain.entity.SysDept;

/**
 * <p>功能描述</br> </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysDeptMapper
 * @date 2017/11/18 9:09
 */
public interface SysDeptMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(SysDept record);

	int insertSelective(SysDept record);

	SysDept selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysDept record);

	int updateByPrimaryKey(SysDept record);
}