package com.park.cloud.common.domain.po.opm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("违章欠款表")
public class OpmPeccancyFinePO {
    @ApiModelProperty(value = "主键")
    private Long peccFineId;

    @ApiModelProperty(value = "欠款单号")
    private String peccPiceCode;

    @ApiModelProperty(value = "违章工单")
    private String inPeccancyCode;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @ApiModelProperty(value = "车牌号")
    private Integer inPeccancyPlateNumber;

    @ApiModelProperty(value = "停车开始车检器变成有车的时间")
    private Date berthStartParkingTime;

    @ApiModelProperty(value = "车辆驶离车检器变成无车的时间")
    private Date berthEndParkingTime;

    @ApiModelProperty(value = "欠费单状态（1，未处理2,已处理3，已取消")
    private Integer fineStatus;

    @ApiModelProperty(value = "是否缴清（1，未缴 2，已缴）")
    private Integer isPay;

    @ApiModelProperty(value = "违章时间（从工单表传过来）")
    private Date peccDate;

    @ApiModelProperty(value = "停车时长")
    private String parkDuration;

    @ApiModelProperty(value = "欠费补缴的时间")
    private Date payDate;

    @ApiModelProperty(value = "添加时间")
    private Date addTime;

    @ApiModelProperty(value = "欠费金额")
    private BigDecimal arrearsPrice;

    @ApiModelProperty(value = "巡检员编号")
    private String pdaUserName;

    @ApiModelProperty(value = "停车服务号(SYS_User表)")
    private String parkUserId;

    @ApiModelProperty(value = "是否为免费车牌（0：否；1：是）")
    private Integer isFreePlateNumber;

    @ApiModelProperty(value = "城市编号")
    private String cityCode;

}