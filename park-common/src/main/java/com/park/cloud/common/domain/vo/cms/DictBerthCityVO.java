package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel
public class DictBerthCityVO implements Serializable {

    @NotNull(message = "泊位号ID")
    private Integer berthId;

    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty("泊位设备SN号")
    private String snCode;

    @ApiModelProperty(value = "片区id")
    private Integer areaId;

    @ApiModelProperty(value = "片区名")
    private String areaName;

    @ApiModelProperty(value = "路段id")
    private Integer sectionId;

    @ApiModelProperty(value = "路段名")
    private String sectionName;

    @ApiModelProperty(value = "行政区id")
    private Integer cantonId;

    @ApiModelProperty(value = "行政区名")
    private String cantonName;

    @ApiModelProperty(value = "排列方向 1靠左 2靠右")
    private Integer lineDirection;

    @ApiModelProperty(value = "泊位状态（1规划中、2建设中、3使用中、4维修中、5已停用）")
    private Integer berthStatus;

    @ApiModelProperty(value = "停车状态（0：无车，1：入场，2：开始计费，3：出场，4：出场超时，5：超时再收费，6：异常）")
    private Integer parkStatus;

    @ApiModelProperty(value = "设置位置（东侧 =1,西侧 = 2,南侧 = 3,北侧 = 4）")
    private Integer setPosition;

    @ApiModelProperty(value = "备注")
    private String berthRemark;
}