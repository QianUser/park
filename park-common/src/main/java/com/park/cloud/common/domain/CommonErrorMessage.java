package com.park.cloud.common.domain;


public class CommonErrorMessage {
    /**
     * 通用
     */
    public static final CommonErrorMessage SIGN_ERR = new CommonErrorMessage("签名错误！", -101);
    public static final CommonErrorMessage NO_LOGIN_ERR = new CommonErrorMessage("用户未登录！", -102);
    public static final CommonErrorMessage SERVER_ERR = new CommonErrorMessage("服务暂不可用！", -103);
    public static final CommonErrorMessage MQ_SERVER_ERR = new CommonErrorMessage("MQ服务暂不可用！", -104);
    public static final CommonErrorMessage THIRD_SERVER_ERR = new CommonErrorMessage("第三方服务暂不可用！", -105);
    public static final CommonErrorMessage ORDER_SERVER_ERR = new CommonErrorMessage("订单服务暂不可用！", -106);

    public static final CommonErrorMessage MONTHLY_USER = new CommonErrorMessage("包月用户！", -301);

    public static final CommonErrorMessage NONE_ORDER = new CommonErrorMessage("未找到订单", -302);

    public static final CommonErrorMessage HAS_PAYED = new CommonErrorMessage("订单已支付", -303);

    public static final CommonErrorMessage PAY_SYSTEM_ERR = new CommonErrorMessage("支付系统异常", -304);

    public static final CommonErrorMessage NOT_EXIST_BERTH = new CommonErrorMessage("泊位不存在", -401);

    private String msg;
    private int code;

    public CommonErrorMessage(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {

        return msg;
    }

    public int getCode() {
        return code;
    }
}
