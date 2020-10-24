package com.park.cloud.common.constant;

/**
 * Created by v5njj on 2018/11/26.
 */
public interface RedisKeyConstants {

    /**
     * 后台用户token缓存key:b_ut_userId
     */
    String BACK_USER_TOKEN_KEY = "b_ut_";

    /**
     * 后台权限页面缓存key:b_au_p_
     * hash缓存，roleId为Key
     */
    String BACK_AUTHORITY_PAGES_KEY = "b_au_p_";

    /**
     * 用户辖区信息缓存key:b_s_a_a
     * hash缓存，用户ID为Key
     */
    String BACK_SYS_AREA_ASS_KEY = "b_s_a_a";

    /**
     * 短信验证码缓存key的前缀
     */
    String SMS_VERIFY_CODE_KEY_PREFIX = "sms_";

    /**
     * 用户token缓存key:ut_userId
     */
    String USER_TOKEN_KEY = "ut_";

    /**
     * 当日活跃用户
     */
    String ACTIVE_USER_COUNT = "a_u_c_";

    /**
     * 后台商户token缓存key:b_ut_userId
     */
    String BACK_MERCHANT_TOKEN_KEY = "b_mt_";

    /**
     * 当日活跃商户
     */
    String ACTIVE_MERCHANT_COUNT = "a_m_c_";

    String SIGN_IN_TOKEN = "sign:in:token";
}
