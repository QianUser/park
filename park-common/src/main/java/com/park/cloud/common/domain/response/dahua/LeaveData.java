package com.park.cloud.common.domain.response.dahua;

import lombok.Data;

/**
 * 出场响应数据
 */
@Data
public class LeaveData {
    /**
     * 支付类型：1、电子支付，2、车场现金
     */
    private String payType;

    /**
     * 备注，返回结果为电子支付时必填，对支付的说明文字
     */
    private String remark;

    /**
     * 实收金额，返回结果为电子支付时必填，实收金额（单位：元）
     */
    private String amountActual;

    /**
     * 应收金额，返回结果为电子支付时必填，应收金额（单位：元）
     */
    private String amountReceivable;
}
