package com.park.cloud.common.domain.po.sys;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 排班管理查询参数
 */
@Data
@ApiModel
public class SysPdaSchedulePO extends PageHelperParams {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaScheduleId;

    @ApiModelProperty(value = "班次名称")
    private String pdaScheduleName;

    @ApiModelProperty(value = "开始时间(hh:mm:ss)")
    private String startTime;

    @ApiModelProperty(value = "结束时间(hh:mm:ss)")
    private String endTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人")
    private Integer addUser;
}
