package com.park.cloud.common.domain.vo.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author kris_ni
 * @date 2020/2/13
 */
@Data
@ApiModel
public class BargainOrderToPayVO {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "实际所需金额（单位：分）")
    private Integer actualPrice;

    @ApiModelProperty(value = "申请方式（0:自泊；1pda）")
    private Integer applyMethod;

    @ApiModelProperty(value = "停车计费时长")
    private Integer parkTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "路内：停车开始车检器变成有车的时间\n" +
            "路外：入场时间")
    private LocalDateTime berthStartParkingTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "计费开始时间")
    private LocalDateTime startParkingTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "计费结束时间")
    private LocalDateTime endParkingTime;

    @ApiModelProperty(value = "停车场名称")
    private String parkName;

    @ApiModelProperty(value = "应收金额 \n" +
            "单位：元")
    private Float payCharge;

    @ApiModelProperty(value = "可用优惠券列表")
    private List<CouponVO> canUseCoupons;

    @ApiModelProperty(value = "不可用优惠券列表")
    private List<CouponVO> cannotUseCoupons;

    @ApiModelProperty(value = "计费时长")
    private Integer actualDuration;

//    @ApiModelProperty(value = "平台缴费后免费出场时长\n" +
//            "单位：分")
//    private Integer parkOutTime;

    @ApiModelProperty(value = "路外停车场编号")
    private String parkCode;
}
