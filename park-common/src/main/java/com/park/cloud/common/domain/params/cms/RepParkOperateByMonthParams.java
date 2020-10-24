package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkOperateByMonthParams
 * @Description 停车月报表列表数据
 * @Author liangshuang
 * @Date 2020/3/5 10:41
 **/
@Data
@ApiModel
public class RepParkOperateByMonthParams extends CmsPageHelperParams {
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
}
