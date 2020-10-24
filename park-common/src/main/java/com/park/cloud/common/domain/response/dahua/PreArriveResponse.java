package com.park.cloud.common.domain.response.dahua;

import lombok.Data;

/**
 * 预进场响应参数
 */
@Data
public class PreArriveResponse {
    /**
     * 预进场响应数据
     */
    private PreArriveData preArriveData;

    /**
     * 返回编码，000000 成功，其他失败
     */
    private String resCode;

    /**
     * 返回信息
     */
    private String resMsg;
}
