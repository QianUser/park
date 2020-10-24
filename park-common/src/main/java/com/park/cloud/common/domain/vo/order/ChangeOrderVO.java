package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/2/7
 */
@Data
@ApiModel
public class ChangeOrderVO {

    @ApiModelProperty(value = "停车计费时长")
    private Integer parkTime;

    @ApiModelProperty(value = "应收金额 \n" +
            "单位：元")
    private Float payCharge;
}
