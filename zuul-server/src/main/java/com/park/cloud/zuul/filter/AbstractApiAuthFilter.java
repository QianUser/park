package com.park.cloud.zuul.filter;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.park.cloud.zuul.common.ApiMD5Tools;
import com.park.cloud.zuul.common.ZuulConstants;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonException;
import com.park.cloud.common.domain.CommonHeaderInfo;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.vo.auth.ApiAuthVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 接口认证过滤器
 *
 * @author liyingjie
 * @date 2018/11/22
 */
@Slf4j
public abstract class AbstractApiAuthFilter extends ZuulFilter {

    /**
     * 接口验证用Header
     */
    protected static final String H_ACCESS_ID = "h-access-id";
    protected static final String H_TIME = "h-time";
    protected static final String H_INFO = "h-info";
    protected static final String H_SIGN = "h-sign";

    /**
     * 接口签名秘钥Map
     */
    private static final Map<String, ApiAuthVO> API_AUTH_MAP = new HashMap<>();

    static {

        /**
         * 接口签名用秘钥
         */
        String ACCESS_KEY = "w8d9fokjur5t6udkcmhgf730r75ngyfr";
        /**
         * 接口AccessId
         */
        String ACCESS_ID = "hy6s8iwdr54kdfo09cbxmzk2dc9f10dc";
        //内部认证秘钥
        API_AUTH_MAP.put(ACCESS_ID, createAuthVO("内部", ACCESS_ID, ACCESS_KEY));

    }

    /**
     * 接口时间误差5分钟
     */
    private static final int TIME_DEVIATION = 1000 * 15;

    protected abstract RedisTemplate<String, String> redisTemplate();


    /**
     * h_access_id:后台分配
     * h-time:13位时间戳（中国时区） ，误差超过5分钟将不会处理
     * h-info:通用信息json字符串。
     * cdd: 客户端设备id ct:客户端类型（android, ios）
     * h_sign:接口签名
     * MD5("accesskey的值" + "h-access-id" + "h-access-id的值" + "h-time" + "h-time的值" + "h-info" + "h-info的值" + "accesskey的值")
     *
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        try {
            String accessId = this.checkEmptyHeader(request, H_ACCESS_ID);
            String time = this.checkEmptyHeader(request, H_TIME);
            String info = this.checkEmptyHeader(request, H_INFO);
            String sign = this.checkEmptyHeader(request, H_SIGN);
            // 获取请求参数
/*            RequestWrapper requestWrapper = new RequestWrapper(request);
            String body = requestWrapper.getBody();
            if (!StringUtils.isEmpty(body)) {
                log.info("Request: \n{}", body);
            }*/
            //检查时间
            this.checkTime(time);

            //检查Info
            this.checkInfo(info);

            //检查签名
            this.checkSign(accessId, info, time, sign, request.getRequestURI());

        } catch (CommonException e) {
            this.buildFailedResponse(ctx, e.getMessage());
        }

        return null;
    }


    /**
     * MD5("accesskey的值" + "h-access-id" + "h-access-id的值"
     * + "h-time" + "h-time的值" + "h-info" + "h-info的值" + "accesskey的值")
     *
     * @param accessId
     * @param info
     * @param time
     * @param sign
     * @throws CommonException
     */
    private void checkSign(String accessId, String info, String time, String sign, String path) throws CommonException {

        //获取AccessKey
        String accessKey = this.getAccessKey(accessId);

        String apiSign = this.getSign(accessId, info, time, accessKey);
        log.info("sign after:" + apiSign);
        if (!apiSign.equals(sign)) {
            log.error("签名错误:uri={},accessId={},info={},time={},sign={},serverSign={}", this.getUri(), accessId, info, time, sign, apiSign);
            throw new CommonException("签名错误", -1);
        }
    }

    /**
     * MD5("accesskey的值" + "h-access-id" + "h-access-id的值" + "h-time" + "h-time的值" + "h-info" + "h-info的值" + "accesskey的值")
     *
     * @param accessId
     * @param info
     * @param time
     * @param accessKey
     * @return
     */
    protected String getSign(String accessId, String info, String time, String accessKey) {
        StringBuffer signStr = new StringBuffer();
        signStr.append(accessKey);
        signStr.append(H_ACCESS_ID);
        signStr.append(accessId);
        signStr.append(H_TIME);
        signStr.append(time);
        signStr.append(H_INFO);
        signStr.append(info);
        signStr.append(accessKey);
        //signStr.append(body);
        log.info("sign before:" + signStr.toString());
        return ApiMD5Tools.encodeMD5(signStr.toString());
    }

    /**
     * 获取用户ACCESS_KEY
     *
     * @param accessId
     * @return
     * @throws CommonException
     */
    protected String getAccessKey(String accessId) throws CommonException {
        ApiAuthVO authVO = API_AUTH_MAP.get(accessId);
        if (authVO == null) {
            throw new CommonException("accessId不正确", -1);
        }
        log.info("接口访问:{},accessId:{}", authVO.getUserName(), authVO.getAccessId());
        return authVO.getAccessKey();
    }

    /**
     * 检查通用信息
     *
     * @param info
     * @throws CommonException
     */
    protected void checkInfo(String info) throws CommonException {
        CommonHeaderInfo commonHeaderInfo = JSONObject.parseObject(info, CommonHeaderInfo.class);
        if (StringUtils.isEmpty(commonHeaderInfo.getCdd())) {
            throw new CommonException("缺少客户端设备ID", -1);
        }
        if (StringUtils.isEmpty(commonHeaderInfo.getCt())) {
            throw new CommonException("缺少客户端类型", -1);
        }
    }

    /**
     * 接口的签名时间不能相差5分钟（中国时间）
     *
     * @param time
     * @throws CommonException
     */
    private void checkTime(String time) throws CommonException {
        if (Math.abs(System.currentTimeMillis() - Long.parseLong(time)) > TIME_DEVIATION) {
            throw new CommonException("时间戳不正确", -1);
        }
    }

    /**
     * 获取并检查空值
     *
     * @param request
     * @param header
     * @return
     * @throws ZuulException
     */
    private String checkEmptyHeader(HttpServletRequest request, String header) throws CommonException {
        String headerValue = request.getHeader(header);
        if (StringUtils.isEmpty(headerValue)) {
            throw new CommonException(header + " is null", -1);
        }
        return headerValue;
    }

    /**
     * 签名认证失败
     *
     * @param ctx
     * @param errorMessage
     */
    private void buildFailedResponse(RequestContext ctx, String errorMessage) {
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        ctx.setResponseBody(JSONObject.toJSONString(
                CommonResult.failed(CommonErrorMessage.SIGN_ERR.getCode()
                        , CommonErrorMessage.SIGN_ERR.getMsg() + errorMessage)));
        ctx.getResponse().setContentType("application/json;charset=UTF-8");
    }

    /**
     * 创建接口认证信息
     *
     * @param userName
     * @param accessId
     * @param accessKey
     * @return
     */
    private static ApiAuthVO createAuthVO(String userName, String accessId, String accessKey) {
        ApiAuthVO vo = new ApiAuthVO();
        vo.setAccessId(accessId);
        vo.setAccessKey(accessKey);
        vo.setUserName(userName);
        return vo;
    }

    /**
     * 忽略签名认证url
     *
     * @param uri
     * @return
     */
    protected boolean ignoreAuth(String uri) {
        if (uri.indexOf(ZuulConstants.API_DOC_PATH) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 获取请求URI
     *
     * @return
     */
    protected String getUri() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        return request.getRequestURI().toString();
    }
}