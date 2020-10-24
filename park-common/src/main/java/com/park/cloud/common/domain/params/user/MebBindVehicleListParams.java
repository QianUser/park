package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 用户绑定车牌列表参数
 */
@Data
@ApiModel
public class MebBindVehicleListParams extends ClientBaseParams {

    @NotEmpty(message = "停车服务号不能为空")
    @ApiModelProperty(value = "用户停车服务号", required = true)
    private String parkUserId;

}
