package com.park.cloud.zuul.common;

/**
 * @author 1004185
 */
public interface ZuulConstants {

    /**
     * 接口文档路径
     */
    String API_DOC_PATH = "/v2/api-docs";

    /**
     * CMS接口转发前缀
     */
    String ROUTE_PREFIX_CMS_V1 = "/park1.0/cms/";

    /**
     * merchant接口转发前缀
     */
    String ROUTE_PREFIX_MERCHANT_V1 = "/park1.0/merchant/";

    /**
     * 客户端接口转发前缀
     */
    String ROUTE_PREFIX_USER_V1 = "/park1.0/user/";

    /**
     * 设备端接口转发前缀
     */
    String ROUTE_PREFIX_DEVICE_V1 = "/park1.0/device/";

    /**
     * PDA接口转发前缀
     */
    String ROUTE_PREFIX_PDA_V1 = "/park1.0/pda/";
}
