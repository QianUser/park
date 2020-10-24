package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameFindEarningsCaseVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/14 14:40
 **/
@Data
@ApiModel
public class FindEarningsCaseVO {
    @ApiModelProperty(value = "日期")
    private String statisticsDay;
    @ApiModelProperty(value = "收益")
    private Integer receiptPrice;
}
