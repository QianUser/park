package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 排班
 */
@Data
@ApiModel
public class SysPdaUserScheduleVO implements Serializable {
    @ApiModelProperty(value = "中队id")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "中队名称")
    private String pdaUserTeamName;

    @ApiModelProperty(value = "月份排班状态")
    private List<SysPdaUserScheduleMonthVO> scheduleMonth;
}
