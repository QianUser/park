package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictCityCodeListVO implements Serializable {

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "数字码")
    private String numberCode;

    @ApiModelProperty(value = "类型（0省、自治区、直辖市、特别行政区代码；1二级代码）")
    private Integer codeType;

    @ApiModelProperty(value = "上级数字编码(省份为0)")
    private String parentNumberCode;

}