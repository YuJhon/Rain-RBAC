package com.jhon.rain.pojo.dto;

import com.jhon.rain.entity.SysAcl;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

/**
 * <p>功能描述</br> 权限的值对象 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysAclDTO
 * @date 2017/11/18 15:09
 */
@Getter
@Setter
@ToString
public class SysAclDTO extends SysAcl {

	/**
	 * 是否要默认选中
	 **/
	private boolean checked = false;

	/**
	 * 是否有权限操作
	 **/
	private boolean hasAcl = false;

	public static SysAclDTO adapt(SysAcl acl) {
		SysAclDTO dto = new SysAclDTO();
		BeanUtils.copyProperties(acl, dto);
		return dto;
	}
}
