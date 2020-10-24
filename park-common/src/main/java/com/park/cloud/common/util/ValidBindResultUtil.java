package com.park.cloud.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * @Author: xiawei
 * @Date: 2020/7/29 13:33
 */
@Slf4j
public class ValidBindResultUtil {
    public static String getBindStr(BindingResult result){
        String resStr = null;
        if (result.hasErrors()) {
            // 得到全部不合法的字段
            List<FieldError> fieldErrors = result.getFieldErrors();
            StringBuffer buffer = new StringBuffer();
            // 遍历不合法字段
            fieldErrors.forEach(
                    fieldError -> {
                        buffer.append(fieldError.getDefaultMessage());
                        buffer.append(",");
                        // 获取不合法的字段名和不合法原因
//                        log.info("error field is : {} ,message is : {}", fieldError.getField(), fieldError.getDefaultMessage());
                    }
            );
            buffer.deleteCharAt(buffer.length() - 1);
            resStr = buffer.toString();
        }
        return resStr;
    }
}
