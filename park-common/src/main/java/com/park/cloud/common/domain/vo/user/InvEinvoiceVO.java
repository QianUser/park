package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("开票历史返回类")
public class InvEinvoiceVO {

    @ApiModelProperty("主键")
    private Integer eInvoiceId;

    @ApiModelProperty("开票总额（含税）")
    private BigDecimal totalPrice;

    @ApiModelProperty("开票状态 0：已申请 1：下发成功 9999：下发失败")
    private Integer orderStatus;

    @ApiModelProperty("入库时间")
    private Date addTime;

    @ApiModelProperty("0:停车订单 1：包月/包年")
    private Integer eInvoiceType;

    @ApiModelProperty("企业类型 01：企业 02：机关事业单位 03：个人 04：其他")
    private String companyType;
}
