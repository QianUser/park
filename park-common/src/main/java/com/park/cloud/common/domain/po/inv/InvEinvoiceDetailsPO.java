package com.park.cloud.common.domain.po.inv;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("用户申请电子发票明细表")
public class InvEinvoiceDetailsPO {

    @ApiModelProperty("主键")
    private Integer einvoiceDetailsId;

    @ApiModelProperty("电子发票编号")
    private String einvoiceCode;

    @ApiModelProperty("明细名称（货物或应税劳务、服务名称）")
    private String detailsName;

    @ApiModelProperty("规格型号")
    private String specifications;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("数量")
    private Integer number;

    @ApiModelProperty("单价")
    private BigDecimal unitPrice;

    @ApiModelProperty("金额")
    private BigDecimal unitTotalPrice;

    @ApiModelProperty("税额")
    private BigDecimal taxPrice;

    @ApiModelProperty("税率")
    private BigDecimal taxRate;

    @ApiModelProperty("入库时间")
    private Date addTime;

}