package com.jhon.rain.pojo.dto;

import com.google.common.collect.Lists;
import com.jhon.rain.entity.SysAclModule;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * <p>功能描述</br> 权限模块的值对象 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysAclModuleLevelDTO
 * @date 2017/11/18 15:09
 */
@Setter
@Getter
@ToString
public class SysAclModuleLevelDTO extends SysAclModule {

	private List<SysAclModuleLevelDTO> aclModuleList = Lists.newArrayList();

	private List<SysAclDTO> aclList = Lists.newArrayList();

	public static SysAclModuleLevelDTO adapt(SysAclModule aclModule) {
		SysAclModuleLevelDTO aclModuleLevelDTO = new SysAclModuleLevelDTO();
		BeanUtils.copyProperties(aclModule, aclModuleLevelDTO);
		return aclModuleLevelDTO;
	}

}
