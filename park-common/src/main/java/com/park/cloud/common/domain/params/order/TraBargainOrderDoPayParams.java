package com.park.cloud.common.domain.params.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.park.cloud.common.domain.vo.order.CouponVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: xiawei
 * @Date: 2020/7/30 20:54
 */
@Data
public class TraBargainOrderDoPayParams {
    @NotBlank
    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;
    @ApiModelProperty(value = "泊位编号")
    private String berthCode;
    @ApiModelProperty(value = "申请方式（0:自泊；1pda）")
    private Integer applyMethod;
    @ApiModelProperty(value = "实际所需金额（单位：分）")
    private Integer actualPrice;

    @ApiModelProperty(value = "停车计费时长")
    private Integer parkTime;

    @ApiModelProperty(value = "停车场名称")
    private String parkName;
    @ApiModelProperty(value = "应收金额 \n" +
            "单位：元")
    private Float payCharge;

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

    @ApiModelProperty("用户优惠券主键")
    private Integer ucId;

    @ApiModelProperty("交易类型(JSAPI,APP,NATIVE)")
    private String tradeType;

    @ApiModelProperty(value = "支付业务类型：1停车费，2包月券购买；3购买优惠券")
    private Integer subId;

    @ApiModelProperty(value = "appid")
    private String appid;
    @ApiModelProperty(value = "计费时长")
    private Integer actualDuration;
}
