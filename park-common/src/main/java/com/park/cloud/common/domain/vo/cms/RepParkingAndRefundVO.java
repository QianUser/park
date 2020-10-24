package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkingAndRefundVO
 * @Description 退费报表上方停车场对应退费金额
 * @Author liangshuang
 * @Date 2020/3/6 15:51
 **/
@Data
@ApiModel
public class RepParkingAndRefundVO {
    @ApiModelProperty(value = "停车场名称")
    private String sectionName;
    @ApiModelProperty(value = "退费次数")
    private Integer refundNum;
}
