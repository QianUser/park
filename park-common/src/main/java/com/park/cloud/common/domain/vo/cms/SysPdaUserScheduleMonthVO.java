package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 月份排班
 */
@Data
@ApiModel
public class SysPdaUserScheduleMonthVO implements Serializable {

    @ApiModelProperty(value = "月份")
    private String month;

    @ApiModelProperty(value = "排班状态：1、未排班，不支持排班；2、已排班，不支持排班；3、未排班，支持排班，4、已排班，支持排班")
    private Byte scheduleStatus;
}
