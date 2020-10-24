package com.park.cloud.common.domain.params.mq;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kris_ni
 * @date 2020/3/18
 */
@Data
@ApiModel
public class JLPayNoticeParams {

    @ApiModelProperty(value = "通知类型 当 type = payNotify 时为支付下发通知")
    private String type;

    @ApiModelProperty(value = "停车记录编号")
    private String  parkStopCode;

    @ApiModelProperty(value = "总金额（分）（totalAmount =payAmount+couponAmount）")
    private Integer totalAmount;

    @ApiModelProperty(value = "支付金额（分）")
    private Integer payAmount;

    @ApiModelProperty(value = " 优惠金额（分）")
    private Integer couponAmount;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "支付时间  格式2020-01-01 00:00:00")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "交易单号")
    private String tradeNo;

    @ApiModelProperty(value = "车场编号（京梁平台车场编号)")
    private String parkCode;

    @ApiModelProperty(value ="支付类型，改参数\n" +
            "不传就默认聚合\n" +
            "码支付\n" +
            "0:聚合码 1：公众号支付")
    private Integer payType;
}
