package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 添加排班参数
 */
@Data
@ApiModel
public class SysPdaUserScheduleAddParams extends CmsBaseParams {
    @ApiModelProperty(value = "班次id")
    private Integer pdaScheduleId;

    @ApiModelProperty(value = "巡检员id")
    private Integer pdaUserId;

    @ApiModelProperty(value = "排班年份")
    private Integer year;

    @ApiModelProperty(value = "排班月份")
    private Integer month;

    @ApiModelProperty(value = "排班日")
    private Integer day;
}
