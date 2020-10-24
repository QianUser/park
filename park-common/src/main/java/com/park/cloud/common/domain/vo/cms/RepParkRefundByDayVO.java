package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassNameRepParkRefundByDayVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 15:04
 **/
@Data
@ApiModel
public class RepParkRefundByDayVO {
    @ApiModelProperty(value = "停车场名称")
    private String sectionName;
    @ApiModelProperty(value = "停车场id")
    private Integer sectionId;
    @ApiModelProperty(value = "停车场类型")
    private Integer parkingType;

    @ApiModelProperty(value = "退费次数")
    private Integer refundNum;

    @ApiModelProperty(value = "退费金额")
    private Integer refundPrice;
    @ApiModelProperty(value = "日期")
    private String statisticsDay;
}
