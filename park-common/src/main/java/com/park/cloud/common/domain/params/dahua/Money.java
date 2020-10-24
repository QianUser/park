package com.park.cloud.common.domain.params.dahua;

import lombok.Data;

@Data
public class Money {
    /**
     * 名称，优惠券名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 金额值，单位：元
     */
    private String value;
}
