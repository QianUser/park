package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictSpecialListUpdateParams extends CmsBaseParams {

    @NotNull(message = "ID不能为空")
    @ApiModelProperty(value = "ID", required = true)
    private Integer specialListId;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "片区id（0为全部）")
    private Integer areaId;

    @ApiModelProperty(value = "行政区id（0为全部）")
    private Integer cantonId;

    @ApiModelProperty(value = "类型(1黑名单,2白名单)")
    private Integer specialListType;

    @ApiModelProperty(value = "备注")
    private String specialListRemark;
}