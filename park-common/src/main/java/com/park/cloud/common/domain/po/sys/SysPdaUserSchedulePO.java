package com.park.cloud.common.domain.po.sys;

import com.park.cloud.common.domain.params.PageHelperParams;
import com.park.cloud.common.domain.vo.cms.SysPdaUserScheduleMonthVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 班次管理查询参数
 */
@Data
@ApiModel
public class SysPdaUserSchedulePO extends PageHelperParams {
    @ApiModelProperty(value = "中队id")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "中队名称")
    private String pdaUserTeamName;

    @ApiModelProperty(value = "月份排班状态")
    private List<SysPdaUserScheduleMonthVO> scheduleMonth;

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

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人")
    private Integer addUser;
}
