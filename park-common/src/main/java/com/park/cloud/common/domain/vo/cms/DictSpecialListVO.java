package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictSpecialListVO implements Serializable {

    @ApiModelProperty(value = "ID")
    private Integer specialListId;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "片区id（0为全部）")
    private Integer areaId;

    @ApiModelProperty(value = "片区名")
    private String areaName;

    @ApiModelProperty(value = "行政区id（0为全部）")
    private Integer cantonId;

    @ApiModelProperty(value = "行政区名")
    private String cantonName;

    @ApiModelProperty(value = "类型(1黑名单,2白名单)")
    private Integer specialListType;

    @ApiModelProperty(value = "备注")
    private String specialListRemark;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人姓名")
    private String addUserName;
}