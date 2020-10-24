package com.park.cloud.common.domain.response.dahua;

import lombok.Data;

/**
 * 预进场响应数据
 */
@Data
public class PreArriveData {
    /**
     * 1、线上控制开闸，2、线上控制不开闸（欠费用户），3、线下控制处理
     */
    private String isOpen;
}
