package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraMonthlyTicketOrderParams extends ClientBaseParams{

    private Integer id;

    @ApiModelProperty("停车场Id或者路段Id")
    private Integer parkingSectionId;

    @ApiModelProperty("停车场类型，0路外停车场；1路内停车场")
    private Integer parkingType;

    @ApiModelProperty("生成的订单号（与交易记录表的BargainOrderCode关联）")
    private String monthlyTicketOrderNo;

    @ApiModelProperty("包月策略id")
    private Integer monthlyRateId;

    @ApiModelProperty("用户id")
    private String parkUserId;

    @ApiModelProperty("包月价格（元）")
    private Integer monthlyTicketPrice;

    @ApiModelProperty("租赁月数")
    private Integer monthNum;

    @ApiModelProperty("支付金额")
    private Integer payPrice;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("1蓝2绿3黄4其他")
    private Integer plateType;

    @ApiModelProperty("1未付款，2已付款，3已退款")
    private Integer orderStatus;

}
