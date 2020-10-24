package com.park.cloud.common.domain.po.sys;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 闸机参数
 */
@Data
@ApiModel
public class SysGatePO extends PageHelperParams {
    @ApiModelProperty(value = "闸机id")
    private Integer gateId;

    @ApiModelProperty(value = "停车场id")
    private Integer parkId;

    @ApiModelProperty(value = "闸机序列号")
    private String controllerSerialNumber;
}
