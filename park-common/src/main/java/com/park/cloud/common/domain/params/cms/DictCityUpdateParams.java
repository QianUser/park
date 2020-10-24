package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictCityUpdateParams extends CmsBaseParams {

    @NotNull(message = "城市ID不能为空")
    @ApiModelProperty(value = "城市ID", required = true)
    private Integer cityId;

    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @ApiModelProperty(value = "城市编码")
    private String cityCode;

    @ApiModelProperty(value = "备注")
    private String cityRemark;

    @ApiModelProperty(value = "经度")
    private String cityLat;

    @ApiModelProperty(value = "纬度")
    private String cityLng;
}