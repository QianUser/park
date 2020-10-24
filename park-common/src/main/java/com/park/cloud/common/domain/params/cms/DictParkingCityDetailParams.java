package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictParkingCityDetailParams extends CmsBaseParams {

    @NotNull(message = "停车场ID不能为空")
    @ApiModelProperty(value = "停车场ID", required = true)
    private Integer parkingId;
}