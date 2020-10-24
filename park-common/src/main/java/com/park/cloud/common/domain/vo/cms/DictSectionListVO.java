package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictSectionListVO implements Serializable {

    @ApiModelProperty(value = "路段ID")
    private Integer sectionId;

    @ApiModelProperty(value = "路段名")
    private String sectionName;

}