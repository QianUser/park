package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@ApiModel
public class DictCityCodeListParams extends CmsBaseParams {
    @NotEmpty(message = "上级数字编码不能为空")
    @ApiModelProperty(value = "上级数字编码(省份为0)", required = true)
    private String parentNumberCode;

}