package com.park.cloud.common.domain.response.dahua;

import lombok.Data;

/**
 * 预出场响应数据
 */
@Data
public class PreLeaveData {
    /**
     * 应收金额（单位：元）
     */
    private String amountReceivable;

    /**
     * 实收金额（单位：元），必传，否则报错
     */
    private String amountActual;

    /**
     * 是否线上控制开闸：1、是（直接开闸处理），2、否
     */
    private String isOpen;

    /**
     * 是否按线上返回的金额收费：
     * 1、是，
     * 2、否
     * 如果isOpen=2，这个字段传1代表已缴费、线下控制开闸；如果传2，则走后续出场逻辑
     */
    private String isPayByLineAmount;

    /**
     * 备注说明
     */
    private String remark;

}
