package com.park.cloud.zuul.filter;

import com.netflix.zuul.context.RequestContext;
import com.park.cloud.zuul.common.ZuulConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


import javax.servlet.http.HttpServletRequest;

/**
 * 接口认证过滤器
 *
 * @author liyingjie
 * @date 2018/11/22
 */
@Component
@Slf4j
public class ApiAuthFilter extends AbstractApiAuthFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    protected RedisTemplate<String, String> redisTemplate() {
        return redisTemplate;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String uri = request.getRequestURI().toString();
        log.info("shouldFilter url={}", uri);
        if (this.ignoreAuth(uri)) {
            return false;
        }

        if (uri.startsWith(ZuulConstants.ROUTE_PREFIX_USER_V1)
                || uri.startsWith(ZuulConstants.ROUTE_PREFIX_CMS_V1)
                || uri.startsWith(ZuulConstants.ROUTE_PREFIX_MERCHANT_V1) ) {
            return true;
        }

        return false;
    }

}