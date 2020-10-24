package com.park.cloud.common.domain.po.tra;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel
public class TraBargainOrderPO {
    @ApiModelProperty(value = "订单Id")
    private Long traBargainOrderId;

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @ApiModelProperty(value = "城市代号")
    private String cityCode;

    @ApiModelProperty(value = "停车号/用户ID")
    private String parkUserId;

    @ApiModelProperty(value = "用户手机号码")
    private String mobileNumber;

    @ApiModelProperty(value = "RFID号码")
    private String rfidCode;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "计费开始时间")
    private LocalDateTime startParkingTime;

    @ApiModelProperty(value = "计费结束时间")
    private LocalDateTime endParkingTime;

    @ApiModelProperty(value = "计费时长")
    private Integer actualDuration;

    @ApiModelProperty(value = "实际所需金额（单位：分）")
    private Integer actualPrice;

    @ApiModelProperty(value = "申请方式（0:自泊；1：pda）")
    private Integer applyMethod;

    @ApiModelProperty(value = "")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "订单状态（1：进行中，2：已结束)")
    private Integer orderStatus;

    @ApiModelProperty(value = "申请停车时长")
    private Integer applyactualDuration;

    @ApiModelProperty(value = "路内：预付金额（分）")
    private Integer applyPrice;

    @ApiModelProperty(value = "欠费金额（分")
    private Integer arrearsPrice;

    @ApiModelProperty(value = "退费金额（分）")
    private Integer refundPrice;

    @ApiModelProperty(value = "路内：停车开始车检器变成有车的时间\n" +
            "路外：入场时间")
    private LocalDateTime berthStartParkingTime;

    @ApiModelProperty(value = "路内：停车开始车检器变成无车的时间\n" +
            "路外：出场时间")
    private LocalDateTime berthEndParkingTime;

    @ApiModelProperty(value = "停车开始车检器状态。0正常，1未知，2故障")
    private Integer berthStartErrorFlag;

    @ApiModelProperty(value = "车辆驶离车检器状态。0正常，1未知，2故障")
    private Integer berthEndErrorFlag;

    @ApiModelProperty(value = "停车时长")
    private Integer parkTime;

    @ApiModelProperty(value = "是否预约：1，是 0，否")
    private Integer proposalForm;

    @ApiModelProperty(value = "")
    private LocalDateTime applyTime;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

    @ApiModelProperty(value = "路内订单类型（1、预付费\n" +
            "2、后付费、3、PDA 4、巡检员PDA代缴）\n" +
            "路外订单类型（0、手动缴费订单 1、自动扣费订单）")
    private Integer orderType;

    @ApiModelProperty(value = "停车场生成的订单号（与交易记录表的BargainOrderCode关联）")
    private String parkOrderNo;

    @ApiModelProperty(value = "路外停车场编号")
    private String parkCode;

    @ApiModelProperty(value = "用户类型：\n" +
            "1平台注册用户\n" +
            "2第三方平台客户")
    private Integer userType;

    @ApiModelProperty(value = "路外：出场状态\n" +
            "1未出场\n" +
            "2已出场")
    private Integer leaveStatus;

    @ApiModelProperty(value = "路外：支付信息是否已通知停车场\n" +
            "1未通知\n" +
            "2已通知")
    private Integer notityStatus;

    @ApiModelProperty(value = "平台缴费后免费出场时长\n" +
            "单位：分")
    private Integer parkOutTime;

    @ApiModelProperty(value = "应收金额 \n" +
            "单位：元")
    private Float payCharge;

    @ApiModelProperty(value = "优惠类型\n" +
            "0一次性现金优惠券(减免现金)\n" +
            "1一次性折扣优惠券(可设置折扣比例，按比例计算实际需支付的停车费)\n" +
            "2一次性时间优惠券(设置优惠免费停车的小时数)\n" +
            "3全免(停车费用全部抵扣)\n" +
            "4非一次性包月券（自然月）\n" +
            "5非一次性包年券（自然年）")
    private String freeType;

    @ApiModelProperty(value = "优惠券的金额")
    private Float freeCharge;

    @ApiModelProperty(value = "车辆类型\n" +
            "0:临时卡\n" +
            "1: 月卡\n" +
            "2: 年卡\n" +
            "3：免费")
    private Integer chargeType;

    @ApiModelProperty(value = "抵扣金额（用户消费赠送金额）")
    private Float discountCharge;

    @ApiModelProperty(value = "优惠时长")
    private Integer discountTime;

    @ApiModelProperty(value = "停车记录表id")
    private Integer carioId;

    @ApiModelProperty(value = "支付状态：0未支付；1已支付")
    private Integer payStatus;

    @ApiModelProperty(value = "支付方式：1微信2支付宝")
    private Integer payType;

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime payTime;

    private String parkName;

    private Integer parkId;

    /**
     * 0、默认，1、大华
     */
    private Integer source;
}