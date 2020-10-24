package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictCantonAddParams extends CmsBaseParams {

    @NotEmpty(message = "行政区名称不能为空")
    @ApiModelProperty(value = "行政区名称", required = true)
    private String cantonName;

    @NotEmpty(message = "行政区编码不能为空")
    @ApiModelProperty(value = "行政区编码", required = true)
    private String cantonCode;

    @NotNull(message = "城市ID不能为空")
    @ApiModelProperty(value = "城市ID", required = true)
    private Integer cityId;

    @ApiModelProperty(value = "备注")
    private String cantonRemark;

    @ApiModelProperty(value = "经度")
    private String cantonLat;

    @ApiModelProperty(value = "纬度")
    private String cantonLng;

}