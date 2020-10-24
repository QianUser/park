package com.park.cloud.cms.aspect;

import com.park.cloud.cms.service.SysPositionService;
import com.park.cloud.cms.service.SysRoleService;
import com.park.cloud.cms.service.SysUserService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.constant.RedisKeyConstants;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.util.CommonHeaderInfoUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 1004185
 */
@Aspect
@Component
@Slf4j
@Order(2)
public class LoginAuthAspect {

    @Autowired
    SysUserService userService;

    @Autowired
    @Qualifier("customRedisTemplate")
    private RedisTemplate redisTemplate;

    /**
     * 接口需要登录验证
     */
    @Pointcut("execution(public * com.park.cloud.cms.controller..*.*(..)))")
    public void loginAuth() {
    }

    @Around("loginAuth()")
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable {
        if (!this.isAuth(pjp)) {
            return pjp.proceed();
        }
        Object[] args = pjp.getArgs();
        if (args == null || args.length <= 0) {
            log.info("args null");
            return CommonResult.failed(CommonErrorMessage.NO_LOGIN_ERR);
        }
        CmsBaseParams baseParams = null;
        for (Object arg : args) {
            if (arg instanceof CmsBaseParams) {
                baseParams = (CmsBaseParams) arg;
                break;
            }
        }
        if (baseParams == null) {
            log.info("baseParams null");
            return CommonResult.failed(CommonErrorMessage.NO_LOGIN_ERR);
        }
        String token = CommonHeaderInfoUtil.getToken();
        Integer userId = userService.getUserIdByUserToken(token);
        if (userId == null) {
            log.info("userId null token={}", token);
            return CommonResult.failed(CommonErrorMessage.NO_LOGIN_ERR);
        }
        baseParams.setLoginSysUserId(userId);


        // 活跃用户
        try {
            redisTemplate.opsForSet().add(RedisKeyConstants.ACTIVE_USER_COUNT, String.valueOf(userId));
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 1);
            Date time = cal.getTime();
            redisTemplate.expireAt(RedisKeyConstants.ACTIVE_USER_COUNT, time);
        } catch (Exception e) {
            log.error("Count user active error.", e);
        }
        return pjp.proceed();
    }






    /**
     * 判断是否有LoginAuthIgnore 注释
     *
     * @param pjp
     * @return
     */
    private boolean isAuth(ProceedingJoinPoint pjp) {
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method targetMethod = methodSignature.getMethod();
        Class clazz = targetMethod.getClass();
        log.info("Class={},method={}", clazz.getName(), targetMethod.getName());
        if (targetMethod.isAnnotationPresent(LoginAuthIgnore.class)) {
            return false;
        }
        return true;
    }
}
