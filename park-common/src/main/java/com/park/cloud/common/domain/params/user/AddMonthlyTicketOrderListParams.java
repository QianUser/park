package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import java.util.List;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/14 10:22
 */
@Data
@ApiModel
public class AddMonthlyTicketOrderListParams  extends ClientBaseParams{

    @Valid
    @ApiModelProperty(value = "包月订单列表",required = true)
    private List<TraMonthlyTicketOrderAddParams> list;
}
