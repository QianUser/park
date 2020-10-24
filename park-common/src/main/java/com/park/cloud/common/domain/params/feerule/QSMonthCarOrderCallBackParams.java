package com.park.cloud.common.domain.params.feerule;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @Author: xiawei
 * @Date: 2020/7/27 23:36
 */
@Data
@ApiModel(value = "月卡账单回调参数")
@ToString
public class QSMonthCarOrderCallBackParams {
    @ApiModelProperty(value = "用户姓名")
    private String nickname;

    @NotBlank(message = "手机号不能为空")
    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "月卡开始时间,yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String startTime;

    @ApiModelProperty(value = "月卡结束时间,yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String endTime;

    @ApiModelProperty(value = "车牌号列表")
    private String plateNumbers;

    @ApiModelProperty(value = "月卡规则id")
    @NotBlank(message="月卡规则不能为空")
    private String cardRuleId;

    @ApiModelProperty(value = "车牌号类型")
    private String platType;

    @ApiModelProperty(value = "车辆品牌")
    private String carBrand;

    @ApiModelProperty(value = "资料截图(暂时忽略该参数)")
    private String annexes;
    @ApiModelProperty(value = "审批流程参数")
    private String is_accept;
}
