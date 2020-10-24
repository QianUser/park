package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 中队管辖泊位
 */
@Data
@ApiModel
public class SysPdaUserTeamBerthVO implements Serializable {
    @ApiModelProperty(value = "中队id")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "泊位id")
    private Integer berthId;

    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty(value = "中队是否管辖，0、否，1、是，2、其他中队管辖")
    private Integer ifManage;

}
