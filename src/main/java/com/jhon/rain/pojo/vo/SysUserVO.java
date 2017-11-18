package com.jhon.rain.pojo.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * <p>功能描述</br> 系统用户VO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysUserVO
 * @date 2017/11/18 15:05
 */
@Data
public class SysUserVO {

	private Integer id;

	@NotBlank(message = "用户名不能为空")
	@Length(min = 1, max = 20, message = "用户名长度需要在20个字以内")
	private String username;

	@NotBlank(message = "电话不能为空")
	@Length(min = 1, max = 13, message = "电话长度需要在13个字以内")
	private String telephone;

	@NotBlank(message = "邮箱不能为空")
	@Length(min = 5, max = 50, message = "邮箱长度需要在20个字以内")
	private String mail;

	@NotNull(message = "必须提供用户所属部门")
	private Integer deptId;

	@NotNull(message = "必须指定用户的状态")
	@Min(value = 0, message = "用户的状态不合法")
	@Max(value = 2, message = "用户状态不合法")
	private Integer status;

	@Length(min = 0, max = 200, message = "备注的长度需要在200个字以内")
	private String remark = "";
}
