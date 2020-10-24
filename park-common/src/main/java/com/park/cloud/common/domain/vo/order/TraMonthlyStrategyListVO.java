package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/12 8:34
 */
@Data
public class TraMonthlyStrategyListVO {


    @ApiModelProperty("主键")
    private Integer monthlyStrategyId;

    @ApiModelProperty("策略名称")
    private String monthlyStrategyName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("创建人")
    private Integer addUser;

    @ApiModelProperty("主键")
    private Integer monthlyRateId;

    @ApiModelProperty("开始时间(HH:mm)")
    private Date startTime;

    @ApiModelProperty("次日结束时间(HH:mm)")
    private Date endTime;

    @ApiModelProperty("日期类型（1工作日日间2工作日夜间和非工作日全天，3 全天）")
    private Integer rateDateType;

    @ApiModelProperty("包月价格（分）")
    private String ratePrice;

    @ApiModelProperty("停车场id")
    private Integer parkingId;

    @ApiModelProperty("停车场类型，0路外停车场；1路内停车场")
    private Integer parkingType;

    @ApiModelProperty("停车场名称")
    private  String parkingName;

    public void setRatePrice(Integer ratePrice) {
        this.ratePrice = new BigDecimal(ratePrice).divide(new BigDecimal(100)).toString();
    }
}
