package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameParkClearingVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 10:13
 **/
@Data
@ApiModel
public class ParkClearingVO {
    @ApiModelProperty(value = "封闭停车场(个)")
    private Integer closePark;
    @ApiModelProperty(value = "封闭停车场占比")
    private BigDecimal closeRatio;
    @ApiModelProperty(value = "路边停车场(个)")
    private Integer roadsidePark;
    @ApiModelProperty(value = "路边停车场占比")
    private BigDecimal roadsideRatio;
    @ApiModelProperty(value = "封闭停车场待结算金额")
    private double sectionMoney;
    @ApiModelProperty(value = "封闭停车场待结算金额占比")
    private BigDecimal sectionRatio;
    @ApiModelProperty(value = "路边停车场待结算金额")
    private double parkMoney;
    @ApiModelProperty(value = "路边停车场待结算金额占比")
    private BigDecimal parkRatio;
}
