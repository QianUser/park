package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictCitySearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "城市名称")
    private String cityName;
}