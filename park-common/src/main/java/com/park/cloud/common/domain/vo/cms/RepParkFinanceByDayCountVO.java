package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassNameRepParkFinanceByDayVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/7 13:49
 **/
@Data
@ApiModel
public class RepParkFinanceByDayCountVO {
    @ApiModelProperty(value = "停车收入金额")
    private Integer receiptPrice;
    @ApiModelProperty(value = "收入笔数")
    private Integer payNum;
    @ApiModelProperty(value = "停车场对应金额")
    private List<RepParkFinanceAndParkingVO> repList;

}
