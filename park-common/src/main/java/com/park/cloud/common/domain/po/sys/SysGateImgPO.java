package com.park.cloud.common.domain.po.sys;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 闸机图片参数
 */
@Data
@ApiModel
public class SysGateImgPO extends PageHelperParams {
    @ApiModelProperty(value = "闸机id")
    private Integer gateImgId;

    @ApiModelProperty(value = "闸机序列号")
    private String controllerSerialNumber;

    @ApiModelProperty(value = "流水号")
    private String serialNumber;

    @ApiModelProperty(value = "图片url")
    private String url;

    @ApiModelProperty(value = "1、识别图，2、车牌小图")
    private Integer type;

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "1、入口，2、出口")
    private String direction;
}
