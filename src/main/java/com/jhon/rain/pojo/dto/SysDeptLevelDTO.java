package com.jhon.rain.pojo.dto;

import com.google.common.collect.Lists;
import com.jhon.rain.entity.SysDept;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * <p>功能描述</br> 部门值对象 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysDeptLevelDTO
 * @date 2017/11/18 15:09
 */
@Getter
@Setter
@ToString
public class SysDeptLevelDTO extends SysDept {

	private List<SysDeptLevelDTO> deptList = Lists.newArrayList();

	/**
	 * <pre>对象转化</pre>
	 * @param dept
	 * @return
	 */
	public static SysDeptLevelDTO adapt(SysDept dept) {
		SysDeptLevelDTO dto = new SysDeptLevelDTO();
		BeanUtils.copyProperties(dept, dto);
		return dto;
	}
}
