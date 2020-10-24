package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictBerthCityUpdateParams extends CmsBaseParams {

    @NotNull(message = "泊位号ID不能为空")
    @ApiModelProperty(value = "泊位号ID", required = true)
    private Integer berthId;

    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty("泊位设备SN号")
    private String snCode;

    @ApiModelProperty(value = "片区id")
    private Integer areaId;

    @ApiModelProperty(value = "路段id")
    private Integer sectionId;

    @ApiModelProperty(value = "行政区id")
    private Integer cantonId;

    @ApiModelProperty(value = "排列方向 1靠左 2靠右")
    private Integer lineDirection;

    @ApiModelProperty(value = "状态（1规划中、2建设中、3使用中、4维修中、5已停用）")
    private Integer berthStatus;

    @ApiModelProperty(value = "设置位置（东侧 =1,西侧 = 2,南侧 = 3,北侧 = 4）")
    private Integer setPosition;

    @ApiModelProperty(value = "备注")
    private String berthRemark;
}