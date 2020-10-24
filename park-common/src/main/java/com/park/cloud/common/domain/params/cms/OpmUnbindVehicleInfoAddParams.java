package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class OpmUnbindVehicleInfoAddParams extends CmsBaseParams {

    @NotEmpty(message = "车牌号不能为空")
    @ApiModelProperty(value = "车牌号", required = true)
    private String plateNumber;

    @NotNull(message = "车牌类型不能为空")
    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）", required = true)
    private Integer plateType;
}