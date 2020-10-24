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
public class SysPdaUserScheduleDayVO implements Serializable {
    @ApiModelProperty(value = "排班班次id")
    private Integer pdaUserScheduleId;

    @ApiModelProperty(value = "日期")
    private String day;

    @ApiModelProperty(value = "班次名称")
    private String pdaScheduleName;

    @ApiModelProperty(value = "班次id")
    private Integer pdaScheduleId;
}
