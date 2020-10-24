package com.park.cloud.common.domain.params.demo;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author kris_ni
 * @date 2020/1/13
 */
@Data
@ApiModel(value = "demo 列表请求参数")
public class SampleDemoListParams extends PageHelperParams {

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "添加时间")
    private Date addTime;
}
