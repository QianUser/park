package com.park.cloud.common.domain.vo.feerule;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: xiawei
 * @Date: 2020/7/25 0:42
 */
@Data
public class QSMonthCardOrderVO {
    @ApiModelProperty(value = "账单创建日期")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "停车场名称")
    private String parkName;

    @ApiModelProperty(value = "订单金额")
    private Float orderPrice;
    @ApiModelProperty(value = "单价")
    private Float unitPrice;
    @ApiModelProperty(value = "单日有效时间段")
    private String dailyValidTime;
    @ApiModelProperty(value = "使用有效起始时间")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime validStartTime;
    @ApiModelProperty(value = "使用有效结束时间")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime validEndTime;
    @ApiModelProperty(value = "车牌")
    private String plateNumber;
    @ApiModelProperty(value = "支付状态")
    private Integer payStatus;
    @ApiModelProperty(value = "月卡账单编码")
    private String orderCode;

}
