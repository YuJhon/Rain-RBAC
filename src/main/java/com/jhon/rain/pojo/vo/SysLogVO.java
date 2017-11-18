package com.jhon.rain.pojo.vo;

import lombok.Data;

/**
 * <p>功能描述</br> 日志 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysLogVO
 * @date 2017/11/18 15:08
 */
@Data
public class SysLogVO {

	private Integer type; // LogType

	private String beforeSeg;

	private String afterSeg;

	private String operator;

	private String fromTime;//yyyy-MM-dd HH:mm:ss

	private String toTime;

}
