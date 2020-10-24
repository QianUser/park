package com.park.cloud.common.domain.params.dahua;

import lombok.Data;

/**
 * 时间优惠对象
 */
@Data
public class Time {
    /**
     * 名称，优惠名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 时间值，单位：小时
     */
    private String value;
}
