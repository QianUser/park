package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassNameRepParkCountRefundVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 15:53
 **/
@Data
@ApiModel
public class RepParkCountRefundVO {
    @ApiModelProperty(value = "退费总金额")
    private Integer refundPrice;
    @ApiModelProperty(value = "退费次数")
    private Integer refundNum;
    @ApiModelProperty(value = "停车场对应金额")
    private List<RepParkingAndRefundVO>repList;

}
