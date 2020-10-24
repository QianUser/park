package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 签到信息管理查询参数
 */
@Data
@ApiModel
public class SysPdaUserSignSearchParams extends CmsPageHelperParams {
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

    @ApiModelProperty(value = "签到/签出时间")
    private List<String> signTime;
}
