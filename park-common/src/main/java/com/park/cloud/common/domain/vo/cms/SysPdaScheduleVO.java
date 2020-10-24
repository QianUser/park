package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 班次
 */
@Data
@ApiModel
public class SysPdaScheduleVO implements Serializable {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaScheduleId;

    @ApiModelProperty(value = "开始时间(hh:mm:ss)")
    private String pdaScheduleName;

    @ApiModelProperty(value = "结束时间(hh:mm:ss)")
    private String startTime;

    @ApiModelProperty(value = "用户正式姓名")
    private String endTime;

    @ApiModelProperty(value = "备注")
    private String remark;
}
