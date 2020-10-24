package com.park.cloud.common.domain.po.sys;

import lombok.Data;

@Data
public class SysGateNotPayPO {
    private Integer id;

    /**
     * 订单id
     */
    private Long traBargainOrderId;

    /**
     * 控制器序列号
     */
    private String controllerSerialNumber;

    /**
     * 通道01 02
     */
    private String channel;
}
