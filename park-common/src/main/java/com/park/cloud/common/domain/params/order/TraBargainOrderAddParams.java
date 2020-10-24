package com.park.cloud.common.domain.params.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author kris_ni
 * @date 2020/1/14
 */
@Data
@ApiModel(value = "创建路内外订单参数")
@ToString
public class TraBargainOrderAddParams {

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @ApiModelProperty(value = "")
    private String cityCode;

    @ApiModelProperty(value = "RFID号码")
    private String rfidCode;

    @ApiModelProperty(value = "")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型")
    private Integer plateType;

    @ApiModelProperty(value = "申请方式（路边）：0自主泊车；1pda")
    private Integer applyMethod;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "路内：停车开始车检器变成有车的时间\n" +
            "路外：入场时间")
    private LocalDateTime berthStartParkingTime;

    @ApiModelProperty(value = "停车开始车检器状态。0正常，1未知，2故障")
    private Integer berthStartErrorFlag;

    @ApiModelProperty(value = "是否预约：1，是 0，否")
    private Integer proposalForm;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "停车申请时间")
    private LocalDateTime applyTime;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

    @ApiModelProperty(value = "路内订单类型（1、预付费\n" +
            "2、后付费、3、PDA 4、巡检员PDA代缴）\n" +
            "路外订单类型（0、手动缴费订单 1、自动扣费订单）")
    private Integer orderType;

    @ApiModelProperty(value = "停车场生成的订单号（与交易记录表的BargainOrderCode关联")
    private String parkOrderNo;

    @ApiModelProperty(value = "路外停车场编号")
    private String parkCode;

    @ApiModelProperty(value = "用户停车号")
    private String parkUserId;

    @ApiModelProperty(value = "pda拍照图片地址")
    private String pdaImgPath;

    @ApiModelProperty(value = "订单来源：0、默认，1、大华")
    private Integer source;
}
