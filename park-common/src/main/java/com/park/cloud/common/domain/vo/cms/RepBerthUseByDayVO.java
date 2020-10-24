package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassNameRepBerthUseByDayVO
 * @Description 路边停车收费率报表
 * @Author liangshuang
 * @Date 2020/2/24 14:25
 **/
@Data
@ApiModel
public class RepBerthUseByDayVO implements Serializable {


    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty(value = "路段名")
    private String sectionName;

    @ApiModelProperty(value = "已缴笔数")
    private Integer payNum;

    @ApiModelProperty(value = "总笔数")
    private Integer tradeNum;

    @ApiModelProperty(value = "已缴占比")
    private BigDecimal payNumRate;

    @ApiModelProperty(value = "已缴金额")
    private Integer payPrice;

    @ApiModelProperty(value = "欠费金额")
    private Integer arrearsPrice;

    @ApiModelProperty(value = "总收入金额")
    private Integer receivablePrice;

    @ApiModelProperty(value = "已缴金额占比")
    private BigDecimal payPriceRate;

}
