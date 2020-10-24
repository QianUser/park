package com.park.cloud.common.domain.dto.cms;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 签到信息查询参数
 */
@Data
@ApiModel
public class SysPdaUserSignDto extends PageHelperParams {
    @ApiModelProperty(value = "巡检员id")
    private Integer pdaUserId;

    @ApiModelProperty(value = "真实姓名")
    private String pdaUserTrueName;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

    @ApiModelProperty(value = "中队id")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "签到类型")
    private Byte signType;

    @ApiModelProperty(value = "签到结果")
    private Byte signResult;

    @ApiModelProperty(value = "签到时间")
    private Date signStartTime;

    @ApiModelProperty(value = "签出时间")
    private Date signEndTime;
}
