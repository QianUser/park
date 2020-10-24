package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DictCantonDto extends CmsBaseDto {

    @ApiModelProperty(value = "行政区名称")
    private String cantonName;

    @ApiModelProperty(value = "城市ID")
    private Integer cityId;

}