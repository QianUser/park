package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DictCityDto extends CmsBaseDto {

    @ApiModelProperty(value = "城市名称")
    private String cityName;
}