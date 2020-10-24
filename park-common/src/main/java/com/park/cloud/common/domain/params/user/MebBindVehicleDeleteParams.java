package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 用户删除绑定车牌参数
 */
@Data
@ApiModel
public class MebBindVehicleDeleteParams extends ClientBaseParams {

    @NotNull(message = "车辆绑定ID不能为空")
    @ApiModelProperty(value = "车辆绑定ID", required = true)
    private Integer mebBindVehicleInfoId;

}
