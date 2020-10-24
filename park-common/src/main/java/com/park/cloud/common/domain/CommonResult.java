package com.park.cloud.common.domain;

import com.park.cloud.common.constant.Constants;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CommonResult<T> {

    @ApiModelProperty(value = "返回code，0为正常")
    private Integer code = Constants.SUCCESS_CODE;

    @ApiModelProperty(value = "错误信息描述")
    private String msg;

    @ApiModelProperty(value = "返回数据")
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public CommonResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> CommonResult<T> success() {
        return new CommonResult(Constants.SUCCESS_CODE, Constants.OK);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult(Constants.SUCCESS_CODE, "", data);
    }

    public static <T> CommonResult<T> failed(Integer code, String msg) {
        return new CommonResult(code, msg);
    }

    public static <T> CommonResult<T> failed(CommonErrorMessage message) {
        return new CommonResult(message.getCode(), message.getMsg());
    }
    public static <T> CommonResult<T> failed(String msg) {
        return new CommonResult(Constants.ERROR_CODE, msg);
    }
    public static CommonResult failed(Integer code) {
        return new CommonResult(code, "");
    }

    public static <T> CommonResult<T> failed() {
        return new CommonResult(Constants.ERROR_CODE, Constants.ERR);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
