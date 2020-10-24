package com.park.cloud.common.domain.params.dahua;

import lombok.Data;

/**
 * 折扣优惠对象
 */
@Data
public class Rate {
    /**
     * 名称，优惠名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 折扣率
     */
    private String value;
}
