package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("包月用户记录")
public class TraMonthlyTicketUserVO {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("停车场Id")
    private Integer parkingSectionId;

    @ApiModelProperty("策略开始时间(HH:mm)")
    private LocalTime startTime;

    @ApiModelProperty("策略次日结束时间(HH:mm)")
    private LocalTime endTime;

    @ApiModelProperty("日期类型（1工作日日间2工作日夜间和非工作日全天，3 全天）")
    private Integer rateDateType;

    @ApiModelProperty("停车场类型，0路外停车场；1路内停车场")
    private Integer parkingType;

    @ApiModelProperty("包月策略id")
    private Integer monthlyRateId;

    @ApiModelProperty("包月开始日期")
    private LocalDate startDate;

    @ApiModelProperty("包月结束日期")
    private LocalDate endDate;

    @ApiModelProperty("用户id")
    private String parkUserId;

    @ApiModelProperty("租赁月数")
    private Integer monthNum;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("1蓝2绿3黄4其他")
    private Integer plateType;

    @ApiModelProperty("1正常；2失效")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("最近更新时间")
    private Date updateTime;

    @ApiModelProperty("停车场名称")
    private String parkingName;

    @ApiModelProperty("优惠券名称")
    private String monthlyStrategyName;

}
