package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SysGateNotPayDetailParams extends CmsBaseParams {
    @ApiModelProperty("订单id")
    private Long traBargainOrderId;

}