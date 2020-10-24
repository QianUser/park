package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepDataStatisticsParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/13 14:41
 **/
@Data
@ApiModel
public class RepDataStatisticsParams extends CmsBaseParams {

    @ApiModelProperty(value = "行政区ID(多个id用,隔开)")
    private String[] cantonId;
}
