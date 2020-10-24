package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkOperatePageDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/3 17:38
 **/
@Data
public class RepParkOperatePageDto extends CmsBaseDto {
    @ApiModelProperty("停车路段/停车场")
    private String sectionName;
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
    @ApiModelProperty("统计类型(1为路段(路内),0为路外停车场,2为所有)")
    private Integer   type;
}
