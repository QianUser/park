package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 查询支付记录参数
 *
 * @author liuhainan
 * @createDate 2020/04/11 10:29
 */
@Data
@ApiModel("查询支付记录参数")
public class OrderPaymentParams extends CmsBaseParams {

    @NotBlank(message = "订单编号不能为空！")
    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

}
