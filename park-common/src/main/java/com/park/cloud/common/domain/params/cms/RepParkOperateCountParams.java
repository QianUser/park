package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkOperateParams
 * @Description 停车日报表上方的总统计
 * @Author liangshuang
 * @Date 2020/3/3 16:39
 **/
@Data
@ApiModel
public class RepParkOperateCountParams  extends CmsBaseParams{

    @ApiModelProperty("停车路段")
    private String sectionName;
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
    @ApiModelProperty( "统计类型(1为路段(路内),0为路外停车场)")
    private Integer   type;

}
