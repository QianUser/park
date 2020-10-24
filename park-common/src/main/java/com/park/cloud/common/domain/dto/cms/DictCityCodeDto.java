package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DictCityCodeDto implements Serializable {
    @ApiModelProperty(value = "上级数字编码(省份为0)")
    private String parentNumberCode;
}