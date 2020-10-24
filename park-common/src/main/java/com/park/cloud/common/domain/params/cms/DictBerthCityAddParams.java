package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictBerthCityAddParams extends CmsBaseParams {

    @NotEmpty(message = "泊位号不能为空")
    @ApiModelProperty(value = "泊位号", required = true)
    private String berthCode;

    @NotBlank(message = "泊位设备SN号不能为空！")
    @ApiModelProperty("泊位设备SN号")
    private String snCode;

    @NotNull(message = "片区id不能为空")
    @ApiModelProperty(value = "片区id", required = true)
    private Integer areaId;

    @NotNull(message = "路段id不能为空")
    @ApiModelProperty(value = "路段id", required = true)
    private Integer sectionId;

    @NotNull(message = "行政区id不能为空")
    @ApiModelProperty(value = "行政区id", required = true)
    private Integer cantonId;

    @NotNull(message = "排列方向不能为空")
    @ApiModelProperty(value = "排列方向 1靠左 2靠右", required = true)
    private Integer lineDirection;

    @NotNull(message = "状态不能为空")
    @ApiModelProperty(value = "状态（1规划中、2建设中、3使用中、4维修中、5已停用）", required = true)
    private Integer berthStatus;

    @NotNull(message = "设置位置不能为空")
    @ApiModelProperty(value = "设置位置（东侧 =1,西侧 = 2,南侧 = 3,北侧 = 4）", required = true)
    private Integer setPosition;

    @ApiModelProperty(value = "备注")
    private String berthRemark;

}