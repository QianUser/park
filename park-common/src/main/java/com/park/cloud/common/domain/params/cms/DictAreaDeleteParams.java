package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictAreaDeleteParams extends CmsBaseParams {

    @NotNull(message = "片区ID不能为空")
    @ApiModelProperty(value = "片区ID", required = true)
    private Integer areaId;

}