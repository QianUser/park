package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassNameCantonIdSVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/11 15:39
 **/
@Data
@ApiModel
public class CantonIdSVO  implements Serializable {
    @ApiModelProperty(value = "行政区名称")
    private String cantonName;

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;
}
