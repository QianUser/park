package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DictParkingCityDto extends CmsBaseDto {

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "停车场类型（1：一类2：二类，3：三类）")
    private Integer parkingMold;

    @ApiModelProperty(value = "片区ID")
    private Integer areaId;

}