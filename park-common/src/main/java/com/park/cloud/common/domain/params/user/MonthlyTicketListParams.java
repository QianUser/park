package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author liuhainan
 */
@Data
@ApiModel("查询用户包月券参数")
public class MonthlyTicketListParams extends ClientBaseParams{

    @NotNull
    @ApiModelProperty("包月券状态0未过期 1过期")
    private Integer state;

    @NotNull
    @ApiModelProperty("用户id")
    private String userId;
}
