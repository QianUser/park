package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepParkOperateByMonthVO
 * @Description 停车月报表上方的数据
 * @Author liangshuang
 * @Date 2020/3/5 10:19
 **/
@Data
@ApiModel
public class RepParkOperateByMonthVO {
    @ApiModelProperty(value = "停车场数")
    private Integer parkingCount;

    @ApiModelProperty(value = "停车次数")
    private Integer payNum;

    @ApiModelProperty(value = "应收总金额")
    private Integer receivablePrice;

    @ApiModelProperty(value = "实收总金额")
    private Integer receiptPrice;

    @ApiModelProperty(value = "交易次数")
    private Integer tradEnum;

    @ApiModelProperty(value = "欠费次数")
    private Integer arrearsNum;
}
