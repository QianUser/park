package com.park.cloud.common.domain.dto.cms;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 月排班详情参数
 */
@Data
@ApiModel
public class SysPdaUserScheduleDetailDto extends PageHelperParams {
    @ApiModelProperty(value = "中队id")
    private String pdaUserTeamId;

    @ApiModelProperty(value = "排班年份")
    private Integer year;

    @ApiModelProperty(value = "排班月份")
    private Integer month;
}
