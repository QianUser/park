package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassNameRepParkOperateByMonthPageVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/5 10:43
 **/
@Data
@ApiModel
public class RepParkOperateByMonthPageVO {

    @ApiModelProperty(value = "停车场名称")
    private String sectionName;
    @ApiModelProperty(value = "停车场id")
    private Integer sectionId;
    @ApiModelProperty(value = "停车场类型")
    private String parkingType;
    @ApiModelProperty(value = "停车次数")
    private Integer parkNum;

    @ApiModelProperty(value = "交易次数")
    private Integer tradEnum;

    @ApiModelProperty(value = "欠费笔数")
    private Integer arrearsNum;
    @ApiModelProperty(value = "应收金额")
    private Integer receivablePrice;
    @ApiModelProperty(value = "实收金额")
    private Integer receiptPrice;
}
