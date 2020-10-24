package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictCantonDeleteParams extends CmsBaseParams {

    @NotNull(message = "行政区ID不能为空")
    @ApiModelProperty(value = "行政区ID", required = true)
    private Integer cantonId;

}