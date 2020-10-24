package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 用户更新绑定车牌参数
 */
@Data
@ApiModel
public class MebBindVehicleUpdateParams extends ClientBaseParams {

    @NotNull(message = "车辆绑定ID不能为空")
    @ApiModelProperty(value = "车辆绑定ID", required = true)
    private Integer mebBindVehicleInfoId;

    @ApiModelProperty(value = "是否默认车牌（0、否 1、是）")
    private Integer bindStatus;

    @ApiModelProperty(value = "是否开启自动扣费（0、否 1、是）")
    private Integer isAutomatic;
}
