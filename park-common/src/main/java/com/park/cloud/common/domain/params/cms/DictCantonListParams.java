package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictCantonListParams extends CmsBaseParams {

    @ApiModelProperty(value = "城市ID")
    private Integer cityId;

}