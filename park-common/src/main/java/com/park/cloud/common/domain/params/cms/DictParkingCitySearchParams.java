package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictParkingCitySearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "停车场类型（1：一类2：二类，3：三类）")
    private Integer parkingMold;

    @ApiModelProperty(value = "片区ID")
    private Integer areaId;

}