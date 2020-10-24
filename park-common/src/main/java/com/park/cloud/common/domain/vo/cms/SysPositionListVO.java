package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class SysPositionListVO implements Serializable {
    @ApiModelProperty(value = "职位ID")
    private Integer positionId;

    @ApiModelProperty(value = "职位名称")
    private String positionName;
}