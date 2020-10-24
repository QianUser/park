package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 月排班详情查询参数
 */
@Data
@ApiModel
public class SysPdaUserScheduleDetailParams extends CmsBaseParams {
    @ApiModelProperty(value = "中队id")
    private String pdaUserTeamId;

    @ApiModelProperty(value = "排班年份")
    private Integer year;

    @ApiModelProperty(value = "排班月份")
    private Integer month;
}
