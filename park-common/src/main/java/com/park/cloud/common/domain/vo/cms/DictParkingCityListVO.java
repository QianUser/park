package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictParkingCityListVO implements Serializable {

    @ApiModelProperty(value = "停车场ID")
    private Integer parkingId;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

}