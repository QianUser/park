package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassNameRepParkFinanceAndParkingVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/7 13:52
 **/
@Data
@ApiModel
public class RepParkFinanceAndParkingVO {
    @ApiModelProperty(value = "停车场名称")
    private String sectionName;
    @ApiModelProperty(value = "收入笔数")
    private Integer payNum;
}
