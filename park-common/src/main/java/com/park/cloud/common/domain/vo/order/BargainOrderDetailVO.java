package com.park.cloud.common.domain.vo.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.park.cloud.common.domain.vo.user.OrderPaymentInfoVO;
import com.park.cloud.common.domain.vo.user.OutsideListVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author liuhainan
 */
@Data
public class BargainOrderDetailVO {
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "计费开始时间")
    private LocalDateTime startParkingTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "计费结束时间")
    private LocalDateTime endParkingTime;

    @ApiModelProperty(value = "停车时长")
    private Integer actualDuration;

    @ApiModelProperty(value = "实际所需金额（单位：分）")
    private Integer actualPrice;

    @ApiModelProperty(value = "申请方式（0:自泊；1：pda）")
    private Integer applyMethod;

    @ApiModelProperty(value = "路内：订单状态（1：进行中，2：退费订单，3：欠费订单，4：已完成 5，rfid未缴费 6：巡检员PDA代缴未缴费\n" +
            "路外：1未付款，2已付款，3已退款")
    private Integer orderStatus;

    @ApiModelProperty(value = "路内：预付金额（分）")
    private Integer applyPrice;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "欠费金额（分")
    private Integer arrearsPrice;

    @ApiModelProperty(value = "申请停车时长")
    private Integer applyactualDuration;

    @ApiModelProperty(value = "退费金额（分）")
    private Integer refundPrice;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "路内：停车开始车检器变成有车的时间")
    private LocalDateTime berthStartParkingTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "路内：车辆驶离车检器变成无车的时间 ")
    private LocalDateTime berthEndParkingTime;

    @ApiModelProperty(value = "停车开始车检器状态。0正常，1未知，2故障")
    private Integer berthStartErrorFlag;

    @ApiModelProperty(value = "车辆驶离车检器状态。0正常，1未知，2故障")
    private Integer berthEndErrorFlag;

    @ApiModelProperty(value = "停车计费时长")
    private Integer parkTime;

    @ApiModelProperty(value = "是否预约：1，是 0，否")
    private Integer proposalForm;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "")
    private LocalDateTime applyTime;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

    @ApiModelProperty(value = "路内订单类型（1、预付费\n" +
            "2、后付费、3、PDA 4、巡检员PDA代缴）\n" +
            "路外订单类型（0、手动缴费订单 1、自动扣费订单）")
    private Integer orderType;

    @ApiModelProperty(value = "路外停车场编号")
    private String parkCode;

    @ApiModelProperty(value = "路外：出场状态\n" +
            "1未出场\n" +
            "2已出场")
    private Integer leaveStatus;


    @ApiModelProperty(value = "停车场生成的订单号（与交易记录表的BargainOrderCode关联）")
    private String parkOrderNo;

    @ApiModelProperty(value = "应收金额 \n" +
            "单位：元")
    private Float payCharge;

    @ApiModelProperty(value = "优惠券的金额")
    private Float freeCharge;

    @ApiModelProperty(value = "抵扣金额（用户消费赠送金额）")
    private Float discountCharge;

    @ApiModelProperty(value = "优惠时长")
    private Integer discountTime;

    @ApiModelProperty(value = "所属路段")
    private String sectionName;

    @ApiModelProperty(value = "停车场或者路段名")
    private String parkName;

    @ApiModelProperty(value = "扣费成功时间")
    private Date paymentTime;

    @ApiModelProperty(value = "路外：支付信息是否已通知停车场\n" +
            "1未通知\n" +
            "2已通知")
    private Integer notityStatus;

    @ApiModelProperty(value = "优惠类型\n" +
            "0一次性现金优惠券(减免现金)\n" +
            "1一次性折扣优惠券(可设置折扣比例，按比例计算实际需支付的停车费)\n" +
            "2一次性时间优惠券(设置优惠免费停车的小时数)\n" +
            "3全免(停车费用全部抵扣)\n" +
            "4非一次性包月券（自然月）\n" +
            "5非一次性包年券（自然年）")
    private String freeType;

    @ApiModelProperty(value = "车辆类型\n" +
            "0:临时卡\n" +
            "1: 月卡\n" +
            "2: 年卡\n" +
            "3：免费")
    private Integer chargeType;

    @ApiModelProperty(value = "停车记录表id")
    private Integer carioId;

    @ApiModelProperty(value = "支付状态：0未支付；1已支付")
    private Integer payStatus;

    @ApiModelProperty(value = "平台缴费后免费出场时长\n" +
            "单位：分")
    private Integer parkOutTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "支付时间")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "发票状态0未申请 1申请")
    private Integer invoiceState;

    @ApiModelProperty(value = "支付信息")
    private List<OrderPaymentInfoVO> paymentInfoVOs;

    @ApiModelProperty(value = "支付方式0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）")
    private Integer payType;

    @ApiModelProperty(value = "进出场记录")
    private List<OutsideListVO> outsideListVOS;
}
