package com.park.cloud.common.domain.po.dahua;

import lombok.Data;

@Data
public class UserAgentPO {
    /**
     * 车场账号
     */
    private String parkAccount;

    /**
     * 接口URI
     */
    private String uri;

    /**
     * token
     */
    private String token;

    /**
     * AES密钥
     */
    private String secretKey;
}
