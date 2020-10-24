package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class DictCantonListVO implements Serializable {

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

    @ApiModelProperty(value = "行政区名称")
    private String cantonName;

}