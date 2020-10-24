package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("包月用户记录")
public class TraMonthlyTicketUserParams extends ClientBaseParams{


    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("停车场Id")
    @NotNull(message = "停车场不能为空")
    private Integer parkingSectionId;

    @NotBlank(message = "策略开始时间不能为空")
    @ApiModelProperty("策略开始时间(HH:mm)")
    private String startTime;

    @NotBlank(message = "策略次日结束时间不能为空")
    @ApiModelProperty("策略次日结束时间(HH:mm)")
    private String endTime;

    @ApiModelProperty("日期类型（1工作日日间2工作日夜间和非工作日全天，3 全天）")
    @NotNull(message = "日期类型不能为空")
    private Integer rateDateType;

    @ApiModelProperty("停车场类型，0路外停车场；1路内停车场")
    @NotNull(message = "停车场类型不能为空")
    private Integer parkingType;

    @ApiModelProperty("包月策略id")
    @NotNull(message = "包月策略不能为空")
    private Integer monthlyRateId;

    @ApiModelProperty("包月开始日期")
    private String startDate;

    @ApiModelProperty("包月结束日期")
    private String endDate;

    @ApiModelProperty("用户id")
    private String parkUserId;

    @ApiModelProperty("租赁月数")
    @NotNull(message = "租赁月数不能为空")
    private Integer monthNum;

    @ApiModelProperty("车牌号")
    @NotBlank(message = "车牌号不能为空")
    private String plateNumber;

    @ApiModelProperty("1蓝2绿3黄4其他")
    private Integer plateType;

    @ApiModelProperty("1正常；2失效")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("最近更新时间")
    private Date updateTime;

}
