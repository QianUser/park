package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkFinanceAndPayTypeVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/9 10:43
 **/
@Data
@ApiModel
public class RepParkFinanceAndPayTypeVO {
    @ApiModelProperty(value = "支付方式")
    private Integer payType;
    @ApiModelProperty(value = "收入金额")
    private Integer receiptPrice;
}
