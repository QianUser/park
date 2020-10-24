package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictBerthCityDeleteParams extends CmsBaseParams {

    @NotNull(message = "泊位号不能为空")
    @ApiModelProperty(value = "泊位号", required = true)
    private Integer berthId;

}