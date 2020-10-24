package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author liuhainan
 */
@Data
@ApiModel("发票订单")
public class InvEinvoiceOrderVO {

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime payTime;

    @ApiModelProperty("支付金额")
    private Integer payPrice;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty("停车场")
    private Integer parkingName;

    @ApiModelProperty("包月开始日期")
    private LocalDate startDate;

    @ApiModelProperty("包月结束日期")
    private LocalDate endDate;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

}
