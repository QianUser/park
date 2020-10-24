package com.park.cloud.common.constant;

/**
 * @ClassNamePayTypeEnum
 * @Description  支付方式枚举
 * @Author liangshuang
 * @Date 2020/3/9 14:23
 **/
public enum PayTypeEnum {


    PDAPAY(0, "PDA扫码支付"),
    BALANCE(1, "余额支付"),
    WECHAT(2, "微信支付"),
    ALIPAY(3, "支付宝支付"),
    ONECARD(4, "招行一卡通支付"),
    OFFLINE(5, "线下支付（招行聚合二维码）");
    /**
     * 名称
     */
    private String name;

    /**
     * code
     */
    private int code;

    PayTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
