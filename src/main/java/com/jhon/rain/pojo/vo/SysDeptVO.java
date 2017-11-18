package com.jhon.rain.pojo.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * <p>功能描述</br> 部门 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysDeptVO
 * @date 2017/11/18 15:06
 */
@Data
public class SysDeptVO {

	private Integer id;

	@NotBlank(message = "部门名称不可以为空")
	@Length(max = 15, min = 2, message = "部门名称长度需要在2-15个字之间")
	private String name;

	private Integer parentId = 0;

	@NotNull(message = "展示顺序不可以为空")
	private Integer seq;

	@Length(max = 150, message = "备注的长度需要在150个字以内")
	private String remark;
}
