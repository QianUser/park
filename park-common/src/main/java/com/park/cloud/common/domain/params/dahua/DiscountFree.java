package com.park.cloud.common.domain.params.dahua;

import lombok.Data;

/**
 * 免费优惠
 */
@Data
public class DiscountFree {
    /**
     * 是否免费：1、是，2、否
     */
    private String isFree;

    /**
     * 备注
     */
    private String remark;
}
