package com.jhon.rain.pojo.dto;

import lombok.Data;

import java.util.Date;

/**
 * <p>功能描述</br> 日志值对象 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysLogDTO
 * @date 2017/11/18 19:04
 */
@Data
public class SysLogDTO {

	private Integer type; // LogType

	private String beforeSeg;

	private String afterSeg;

	private String operator;

	private Date fromTime;//yyyy-MM-dd HH:mm:ss

	private Date toTime; //yyyy-MM-dd HH:mm:ss
}
