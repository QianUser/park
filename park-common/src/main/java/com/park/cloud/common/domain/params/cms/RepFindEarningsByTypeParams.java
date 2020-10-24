package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepFindEariningsByTypeParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/17 11:18
 **/
@ApiModel
@Data
public class RepFindEarningsByTypeParams extends CmsBaseParams {
    @ApiModelProperty("时间类型(1为一周,2为一月,3为一年)")
    private Integer   dateType;
}
