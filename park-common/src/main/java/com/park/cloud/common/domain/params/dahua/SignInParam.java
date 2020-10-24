package com.park.cloud.common.domain.params.dahua;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SignInParam extends CommParam {
    /**
     * 停车点地址
     */
    private String address;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 精度
     */
    private String lon;

    /**
     * 服务时段
     */
    private String openTime;

    /**
     * 停车点名称
     */
    private String parkName;

    /**
     * 收费标准
     */
    private String price;

    /**
     * 密码，停车场端收费管理系统的登录密码
     */
    private String pwd;

    /**
     * 工号，停车场端收费管理系统的登录工号
     */
    private String uid;

    /**
     * 操作时间，格式yyyyMMddHHmmss
     */
    private String actTime;
}
