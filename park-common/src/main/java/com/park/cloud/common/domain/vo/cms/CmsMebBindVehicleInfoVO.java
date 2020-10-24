package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class CmsMebBindVehicleInfoVO implements Serializable {

    @ApiModelProperty(value = "车辆绑定ID")
    private Integer mebBindVehicleInfoId;

    @ApiModelProperty(value = "用户停车服务号")
    private String parkUserId;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "用户手机号")
    private String mobileNumber;
}