package com.park.cloud.common.handler;

import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.CommonRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.Set;

/**
 * @author 1004185
 */
@ControllerAdvice
@Component
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 接口参数异常
     * @param exception
     * @return
     */
    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CommonResult handle(ValidationException exception) {
        StringBuffer msg = new StringBuffer();
        if (exception instanceof ConstraintViolationException) {
            ConstraintViolationException exs = (ConstraintViolationException) exception;

            Set<ConstraintViolation<?>> violations = exs.getConstraintViolations();
            boolean isFirst = true;
            for (ConstraintViolation<?> item : violations) {
                if (isFirst) {
                    isFirst = false;
                } else {
                    msg.append("\n");
                }
                msg.append(item.getMessage());
            }
        }
        return CommonResult.failed(msg.toString());
    }

    /**
     * 接口异常返回
     * @param exception
     * @return
     */
    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CommonResult handle(CommonRuntimeException exception) {
        return CommonResult.failed(exception.getCode(), exception.getMessage());
    }

    /**
     * 接口异常返回
     * @param exception
     * @return
     */
    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResult handle(Throwable exception) {
        exception.printStackTrace();
        String message = "接口错误！";
        //todo 应360审计要求，统一返回错误信息！
//        return CommonResult.failed(Constants.ERROR_CODE, exception.getMessage());
        return CommonResult.failed(Constants.ERROR_CODE, message);
    }
}
