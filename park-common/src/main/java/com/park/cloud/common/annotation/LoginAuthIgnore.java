package com.park.cloud.common.annotation;

import java.lang.annotation.*;

/**
 * 用于忽略接口的登陆认证
 * 可在controll的方法上使用
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LoginAuthIgnore {
}
