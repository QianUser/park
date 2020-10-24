package com.park.cloud.common.domain.params.feerule;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

/**
 * @Author: xiawei
 * @Date: 2020/7/23 21:57
 */
@Data
@ApiModel(value = "月卡规则参数")
@ToString
public class QSMonthCardParkParams {
    @ApiModelProperty(value = "月卡id，自增")
    private String id;

    @ApiModelProperty(value = "停车场id")
    private Integer parkId;

    @ApiModelProperty(value = "月卡规则内容")
    private String modelValue;

    @ApiModelProperty(value = "创建者")
    private String creator;

    @ApiModelProperty(value = "编号姓名")
    private String name;

    @ApiModelProperty(value = "关联用户类型")
    private Integer refUserType;

    @NonNull
    @ApiModelProperty(value = "月卡类型")
    private Integer cardType;

    @ApiModelProperty(value = "策略模型标记")
    private String modelFlag;
}
