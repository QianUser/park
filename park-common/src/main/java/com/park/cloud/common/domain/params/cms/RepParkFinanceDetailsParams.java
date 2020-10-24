package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkFinanceDetailsParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/7 16:27
 **/
@Data
@ApiModel
public class RepParkFinanceDetailsParams extends CmsPageHelperParams {
    @ApiModelProperty(value = "统计表的id")
    private Integer financeId;
    @ApiModelProperty(value = "统计的时间")
    private String statisticsDay;
    @ApiModelProperty(value = "支付类型")
    private Integer payType;

}
