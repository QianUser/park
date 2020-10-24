package com.park.cloud.common.domain.dto.cms;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 排班管理查询参数
 */
@Data
@ApiModel
public class SysPdaUserScheduleDto extends PageHelperParams {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaUserScheduleId;

    @ApiModelProperty(value = "班次id")
    private Integer pdaScheduleId;

    @ApiModelProperty(value = "巡检员id")
    private Integer pdaUserId;

    @ApiModelProperty(value = "中队名称")
    private String pdaUserTeamName;

    @ApiModelProperty(value = "城市")
    private Integer cityId;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

    @ApiModelProperty(value = "排班年份")
    private Integer year;

    @ApiModelProperty(value = "排班月份")
    private Integer month;

    @ApiModelProperty(value = "排班日")
    private Integer day;
}
