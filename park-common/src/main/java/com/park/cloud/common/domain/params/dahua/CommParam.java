package com.park.cloud.common.domain.params.dahua;

import lombok.Data;

/**
 * 大华请求参数通用字段，每条数据推送消息都包含该字段
 */
@Data
public class CommParam {
    /**
     * 应用版本号，必填
     */
    private String appVer;

    /**
     * 是否实时数据，必填，1 是，2否
     */
    private String flag;

    /**
     * 车场账号，必填，对应场区配置-扩展配置-扩展编号
     */
    private String parkNum;

    /**
     * PSAM卡号，可不填
     */
    private String psam;

    /**
     * SIM卡号
     */
    private String sim;

    /**
     * 系统版本号
     */
    private String sysVer;

    /**
     * 终端序列号
     */
    private String tsn;
}
