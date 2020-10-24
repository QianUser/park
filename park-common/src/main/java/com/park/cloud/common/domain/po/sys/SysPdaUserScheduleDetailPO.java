package com.park.cloud.common.domain.po.sys;

import com.park.cloud.common.domain.vo.cms.SysPdaUserScheduleDayVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 月排班详情参数
 */
@Data
@ApiModel
public class SysPdaUserScheduleDetailPO implements Serializable {
    @ApiModelProperty(value = "排班主键id")
    private Integer pdaUserScheduleId;

    @ApiModelProperty(value = "巡检员id")
    private Integer pdaUserId;

    @ApiModelProperty(value = "巡检员名称")
    private String pdaUserName;

    @ApiModelProperty(value = "日班次名称")
    private List<SysPdaUserScheduleDayVO> scheduleDay;
}
