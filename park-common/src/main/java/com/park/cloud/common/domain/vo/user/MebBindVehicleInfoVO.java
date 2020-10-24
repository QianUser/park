package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel
public class MebBindVehicleInfoVO {

    @ApiModelProperty(value = "车辆绑定ID")
    private Integer mebBindVehicleInfoId;

    @ApiModelProperty(value = "用户停车服务号")
    private String parkUserId;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "是否默认车牌（0、否 1、是）")
    private Integer bindStatus;

    @ApiModelProperty(value = "是否开启自动扣费（0、否 1、是）")
    private Integer isAutomatic;

    @ApiModelProperty(value = "用户手机号")
    private String mobile;
}