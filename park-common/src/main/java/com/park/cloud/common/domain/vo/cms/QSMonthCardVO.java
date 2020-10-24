package com.park.cloud.common.domain.vo.cms;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: xiawei
 * @Date: 2020/7/27 15:09
 */
@Data
public class QSMonthCardVO {

    @ApiModelProperty(value = "停车场id")
    private String parkId;
    @ApiModelProperty(value = "停车场名称")
    private String parkName;
    @ApiModelProperty(value = "停车场编码")
    private String parkCode;
    @ApiModelProperty(value = "订单金额")
    private Float orderPrice;
    @ApiModelProperty(value = "单价")
    private Float unitPrice;
    @ApiModelProperty(value = "单日有效时间段")
    private String dailyValidTime;
    @ApiModelProperty(value = "使用有效起始时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date validStartTime;
    @ApiModelProperty(value = "使用有效结束时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date validEndTime;
    @ApiModelProperty(value = "车牌")
    private String plateNumber;
    @ApiModelProperty(value = "支付状态")
    private Integer payStatus;
    @ApiModelProperty(value = "月卡id")
    private Integer monthCardId;
    @ApiModelProperty(value = "月卡状态")
    private Integer status;
    @ApiModelProperty(value = "月卡类型")
    private Integer cardType;
    @ApiModelProperty(value = "用户名")
    private String nickname;
    @ApiModelProperty(value = "用户手机号码")
    private String mobileNumber;
    @ApiModelProperty(value = "月卡账单编号")
    private String orderCode;
    @ApiModelProperty(value = "月卡支付时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date payTime;
    @ApiModelProperty(value = "月卡支付开始时间")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payStartTime;
    @ApiModelProperty(value = "月卡支付结束时间")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payEndTime;
    private String modelValue;
    private String modelFlag;
}
