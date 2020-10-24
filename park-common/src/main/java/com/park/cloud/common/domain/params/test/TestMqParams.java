package com.park.cloud.common.domain.params.test;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by v5njj on 2018/10/15.
 */
@ApiModel
@Data
public class TestMqParams implements Serializable {

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "值")
    private String value;
}
