package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@ApiModel
public class DictCityAddParams extends CmsBaseParams {

    @NotEmpty(message = "城市名称不能为空")
    @ApiModelProperty(value = "城市名称", required = true)
    private String cityName;

    @NotEmpty(message = "城市编码不能为空")
    @ApiModelProperty(value = "城市编码", required = true)
    private String cityCode;

    @ApiModelProperty(value = "备注")
    private String cityRemark;

    @ApiModelProperty(value = "经度")
    private String cityLat;

    @ApiModelProperty(value = "纬度")
    private String cityLng;
}