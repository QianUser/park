package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepParkTimeVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/14 14:14
 **/
@Data
@ApiModel
public class RepParkTimeVO {
    @ApiModelProperty(value = "停车时长")
    private String parkTime;
    @ApiModelProperty(value = "占比")
    private BigDecimal parkTimeRatio;
}
