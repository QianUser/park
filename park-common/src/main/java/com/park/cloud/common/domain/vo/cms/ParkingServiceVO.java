package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 停车场类型分布
 */
@Data
@ApiModel
public class ParkingServiceVO implements Serializable {
    @ApiModelProperty(value = "PDA扫码支付")
    private BigDecimal pdaAmount;

    @ApiModelProperty(value = "余额支付")
    private BigDecimal balanceAmount;

    @ApiModelProperty(value = "微信支付")
    private BigDecimal weChatAmount;

    @ApiModelProperty(value = "支付宝支付")
    private BigDecimal aliPayAmount;

    @ApiModelProperty(value = "招行一卡通支付")
    private BigDecimal cmbAmount;

    @ApiModelProperty(value = "线下支付")
    private BigDecimal offlineAmount;

    @ApiModelProperty(value = "欠费")
    private BigDecimal arrearsPrice;

}
