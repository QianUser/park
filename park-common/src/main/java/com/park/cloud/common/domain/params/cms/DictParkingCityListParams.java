package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictParkingCityListParams extends CmsBaseParams {

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "片区ID")
    private Integer areaId;

}