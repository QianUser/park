package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictAreaListParams extends CmsBaseParams {

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

}