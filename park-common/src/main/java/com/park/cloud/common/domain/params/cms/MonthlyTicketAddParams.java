package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@ApiModel
public class MonthlyTicketAddParams {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("停车场Id")
    private Integer parkingSectionId;

    @ApiModelProperty("停车场类型，0路外停车场；1路内停车场")
    private Integer parkingType;

    @ApiModelProperty("包月策略id")
    private Integer monthlyRateId;

    @ApiModelProperty("日期类型（1工作日日间2工作日夜间和非工作日全天，3 全天）")
    private Integer rateDateType;

    @ApiModelProperty("包月开始日期")
    private String startDate;

    @ApiModelProperty("包月结束日期")
    private String endDate;

    @ApiModelProperty("停车服务号")
    private String parkUserId;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("1蓝2绿3黄4其他")
    private Integer plateType;

    @ApiModelProperty("1正常；2失效")
    private Integer status;

    @ApiModelProperty("操作账号：1公众号账号，2后台账号")
    private Integer operator;

    @ApiModelProperty("操作人ID")
    private String userId;
}
