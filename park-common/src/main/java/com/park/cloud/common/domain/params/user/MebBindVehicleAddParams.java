package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 用户添加绑定车牌参数
 */
@Data
@ApiModel
public class MebBindVehicleAddParams extends ClientBaseParams {

    @NotEmpty(message = "停车服务号不能为空")
    @ApiModelProperty(value = "用户停车服务号", required = true)
    private String parkUserId;

    @NotEmpty(message = "车牌号码不能为空")
    @ApiModelProperty(value = "车牌号码", required = true)
    private String plateNumber;

    @NotNull(message = "车牌类型不能为空")
    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）", required = true)
    private Integer plateType;


}
