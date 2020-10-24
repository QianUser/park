package com.park.cloud.common.domain.response.dahua;

import lombok.Data;

/**
 * 签到响应数据
 */
@Data
public class SignInData {
    /**
     * 时间间隔，单位：小时。下次签到距离本次的时间间隔
     */
    private String interval;

    /**
     * 令牌，在每个请求的User-Agent中返回
     */
    private String token;
}
