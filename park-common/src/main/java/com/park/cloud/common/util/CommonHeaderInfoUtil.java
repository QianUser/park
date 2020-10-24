package com.park.cloud.common.util;

import com.alibaba.fastjson.JSONObject;
import com.park.cloud.common.domain.CommonHeaderInfo;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Header中的通用信息
 *
 * @author liyj1
 */
public class CommonHeaderInfoUtil {
    protected static final String H_INFO = "h-info";

    /**
     * 通用信息
     */
    private static ThreadLocal<CommonHeaderInfo> commonHeaderInfoThreadLocal = new ThreadLocal<>();

    /**
     * 初始化通用header信息。
     */
    public static void initInfo() {
        try {
            ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = sra.getRequest();

            String commonInfo = request.getHeader(H_INFO);
            CommonHeaderInfo commonHeaderInfo = JSONObject.parseObject(commonInfo, CommonHeaderInfo.class);
            if(commonHeaderInfo!=null && !StringUtils.isEmpty(commonHeaderInfo.getIp())) {
                commonHeaderInfo.setIp(getRemoteAddress(request));
            }
            setInfo(commonHeaderInfo);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置通用信息
     *
     * @param commonHeaderInfo
     */
    public static void setInfo(CommonHeaderInfo commonHeaderInfo) {
        commonHeaderInfoThreadLocal.set(commonHeaderInfo);
    }

    /**
     * 获取通用信息
     *
     * @return
     */
    public static CommonHeaderInfo getInfo() {
        return commonHeaderInfoThreadLocal.get();
    }

    /**
     * 获取Header中的登录token
     *
     * @return
     */
    public static String getToken() {
        CommonHeaderInfo commonHeaderInfo = getInfo();
        String token = null;
        if(commonHeaderInfo != null) {
            token = commonHeaderInfo.getTk();
        }
        return token;
    }

    /**
     * 获取客户端请求IP地址
     *
     * @param request
     * @return
     */
    public static String getRemoteAddress(HttpServletRequest request) {
        try {
            String ip = request.getHeader("x-forwarded-for");
            if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {
                ip = request.getRemoteAddr();
            }
            if(ip != null && ip.indexOf(",") > 0) {
                ip = ip.substring(0, ip.indexOf(","));
            }
            return ip;
        } catch (Exception e) {

        }
        return "";
    }

}
