package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
public class TraRefundOrderPO {
    private Long refundOrderId;

    private String bargainOrderCode;

    private Integer orderPaymentId;

    private String parkUserId;

    private String refundOrderCode;

    private String berthCode;

    private Integer refundPrice;

    private Date addTime;

    private Date refundTime;

    private Integer refundStatus;

    private Integer payStatus;

    private Integer refundType;

    private Integer bargainOrderType;

    private String sysUserId;

    private String remark;
}