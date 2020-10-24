package com.park.cloud.common.domain.vo.feerule;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: xiawei
 * @Date: 2020/7/24 11:34
 */
@Data
public class QSMonthCardParkVO {
    @ApiModelProperty(value = "月卡规则id")
    private Integer cardRuleId;
    @ApiModelProperty(value = "停车场编码")
    private String parkCode;

    @ApiModelProperty(value = "月卡规则内容")
    private String modelValue;

    @ApiModelProperty(value = "创建者")
    private String creator;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime createTime;
    @ApiModelProperty(value = "月卡规则名称")
    private String name;
    @ApiModelProperty(value = "关联用户类型")
    private Integer refUserType;
    @ApiModelProperty(value = "月卡类型")
    private Integer cardType;
    private String modelFlag;
}
