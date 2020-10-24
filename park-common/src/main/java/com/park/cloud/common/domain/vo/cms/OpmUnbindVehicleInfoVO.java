package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class OpmUnbindVehicleInfoVO implements Serializable {

    @ApiModelProperty(value = "手机号")
    private String mobileNumber;

    @ApiModelProperty(value = "解绑车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "解绑车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "当前绑定车牌号")
    private String nowPlateNumber;

    @ApiModelProperty(value = "当前绑定车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer nowPlateType;

    @ApiModelProperty(value = "解绑时间")
    private Date addTime;

    @ApiModelProperty(value = "解绑人")
    private String addUserName;

}