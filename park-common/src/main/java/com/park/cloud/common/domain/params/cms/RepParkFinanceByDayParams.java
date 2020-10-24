package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkFinanceByDayParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/7 14:45
 **/
@Data
@ApiModel
public class RepParkFinanceByDayParams extends CmsPageHelperParams{
    @ApiModelProperty("停车路段")
    private String sectionName;
    @ApiModelProperty("停车类型(0为路外,1为路内或者路段)")
    private Integer parkingType;
    @ApiModelProperty("支付方式(0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）\n" +
            ")")
    private Integer payType;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
