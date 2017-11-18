package com.jhon.rain.pojo.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * <p>功能描述</br> 角色</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysRoleVO
 * @date 2017/11/18 15:07
 */
@Data
public class SysRoleVO {

	private Integer id;

	@NotBlank(message = "角色名称不可以为空")
	@Length(min = 2, max = 20, message = "角色名称长度需要在2-20个字内")
	private String name;

	@Min(value = 1, message = "角色类型不合法")
	@Max(value = 2, message = "角色类型不合法")
	private Integer type;

	@NotNull(message = "角色状态不可以为空")
	@Min(value = 0, message = "角色状态不合法")
	@Max(value = 1, message = "角色状态不合法")
	private Integer status;

	@Length(min = 0, max = 200, message = "角色备注长度需要在200个字符以内")
	private String remark;
}
