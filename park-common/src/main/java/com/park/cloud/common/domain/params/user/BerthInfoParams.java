package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/2/21
 */
@Data
@ApiModel
public class BerthInfoParams {

    @ApiModelProperty("泊位号")
    private String berthCode;
}
