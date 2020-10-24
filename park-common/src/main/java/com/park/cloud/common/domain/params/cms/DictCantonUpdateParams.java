package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictCantonUpdateParams extends CmsBaseParams {

    @NotNull(message = "行政区ID不能为空")
    @ApiModelProperty(value = "行政区ID", required = true)
    private Integer cantonId;

    @ApiModelProperty(value = "行政区名称")
    private String cantonName;

    @ApiModelProperty(value = "行政区编码")
    private String cantonCode;

    @ApiModelProperty(value = "城市ID")
    private Integer cityId;

    @ApiModelProperty(value = "备注")
    private String cantonRemark;

    @ApiModelProperty(value = "经度")
    private String cantonLat;

    @ApiModelProperty(value = "纬度")
    private String cantonLng;

}