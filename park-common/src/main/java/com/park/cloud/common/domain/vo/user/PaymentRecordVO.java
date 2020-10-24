package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author kris_ni
 * @date 2020/2/1
 */
@Data
@ApiModel
public class PaymentRecordVO {

    @ApiModelProperty(value = "支付记录")
//    private Map<Integer,List<OrderPaymentInfoVO>> paymentInfos;
    private List<OrderPaymentInfoVO> paymentInfos;

    @ApiModelProperty(value = "页码，当前页")
    private int pageNum;

    @ApiModelProperty(value = "每页条数")
    private int pageSize;

    @ApiModelProperty(value = "总条数")
    private long total;

    @ApiModelProperty(value = "页数")
    private int pages;
}
