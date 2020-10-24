package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictCityDeleteParams extends CmsBaseParams {

    @NotNull(message = "城市ID不能为空")
    @ApiModelProperty(value = "城市ID", required = true)
    private Integer cityId;
}