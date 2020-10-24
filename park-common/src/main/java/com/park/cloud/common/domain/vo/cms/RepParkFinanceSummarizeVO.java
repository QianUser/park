package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassNameRepParkFinanceSummarizeVO
 * @Description 财务汇总日报表上方数据
 * @Author liangshuang
 * @Date 2020/3/9 10:42
 **/
@Data
@ApiModel
public class RepParkFinanceSummarizeVO {
    @ApiModelProperty(value = "停车收入金额")
    private Integer receiptPrice;
    @ApiModelProperty(value = "收入笔数")
    private Integer payNum;
    @ApiModelProperty(value = "停车场对应金额")
    private List<RepParkFinanceAndPayTypeVO> repList;
}
