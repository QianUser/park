package com.park.cloud.common.domain;

import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.constant.Constants;

public class CommonRuntimeException extends RuntimeException {
    private Integer code = Constants.ERROR_CODE;

    public CommonRuntimeException() {
        super();
    }

    public CommonRuntimeException(CommonErrorMessage message) {
        super(message.getMsg());
        this.code = message.getCode();
    }

    public CommonRuntimeException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public CommonRuntimeException(String message) {
        super(message);
    }

    public CommonRuntimeException(Throwable cause) {
        super(cause);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
