package com.park.cloud.common.domain.vo.order;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class CouponUsageRecordVO {

    @ApiModelProperty("主键")
    private Integer curId;

    @ApiModelProperty("添加时间")
    private Date addTime;

    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

    @ApiModelProperty("优惠券编号")
    private String ucouponCode;

    @ApiModelProperty("优惠券编号")
    private String couponName;

    @ApiModelProperty("优惠券类型 1折扣优惠券 2时间优惠券 3全免")
    private Integer couponType;

    @ApiModelProperty("用户手机号")
    private String mobileNumber;

    @ApiModelProperty("停车场名称")
    private String parkingName;

    @ApiModelProperty("入场时间")
    private Date berthStartParkingTime;

    @ApiModelProperty("出场时间")
    private Date berthEndParkingTime;

    @ApiModelProperty("优惠金额")
    private Float freeCharge;
}
