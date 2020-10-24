package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/1/31
 */
@Data
@ApiModel
public class TraBargainOrderDetailParams extends CmsBaseParams {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;
}
