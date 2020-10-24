package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 排班
 */
@Data
@ApiModel
public class SysPdaScheduleListVO implements Serializable {
    @ApiModelProperty(value = "开始时间(hh:mm:ss)")
    private String pdaScheduleName;

    @ApiModelProperty(value = "结束时间(hh:mm:ss)")
    private String startTime;

    @ApiModelProperty(value = "用户正式姓名")
    private String endTime;

    @ApiModelProperty(value = "备注")
    private String remark;
}
