package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class SysGateNotPayVO implements Serializable {
    private Integer id;

    /**
     * 订单id
     */
    private Long traBargainOrderId;

    /**
     * 控制器序列号
     */
    private String controllerSerialNumber;

    private String channel;
}
