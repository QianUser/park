package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkFinanceDetailsDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/7 16:30
 **/
@Data
public class RepParkFinanceDetailsDto  extends CmsBaseDto{
    @ApiModelProperty(value = "统计表的id")
    private Integer financeId;
}
