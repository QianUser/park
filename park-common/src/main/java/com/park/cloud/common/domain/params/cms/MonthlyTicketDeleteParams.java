package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class MonthlyTicketDeleteParams {

    @ApiModelProperty("包月券ID")
    private Integer id;
}
