package com.jhon.rain.dao;

import com.jhon.rain.entity.SysLog;
import com.jhon.rain.entity.SysLogWithBLOBs;

/**
 * <p>功能描述</br> </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysLogMapper
 * @date 2017/11/18 9:09
 */
public interface SysLogMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(SysLogWithBLOBs record);

	int insertSelective(SysLogWithBLOBs record);

	SysLogWithBLOBs selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysLogWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

	int updateByPrimaryKey(SysLog record);
}