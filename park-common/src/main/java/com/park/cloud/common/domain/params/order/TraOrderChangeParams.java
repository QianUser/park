package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraOrderChangeParams extends CmsBaseParams {

    @ApiModelProperty("主键")
    private Integer changeOrderId;

    @NotBlank(message = "订单编号不能为空！")
    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

    @ApiModelProperty("原进场时间")
    private Date oldStartParkingTime;

    @ApiModelProperty("原出场时间")
    private Date oldEndParkingTime;

    @ApiModelProperty("原欠费价格")
    private Integer oldArrearsPrice;

    @NotNull(message = "实际进场时间不能为空！")
    @ApiModelProperty("实际进场时间")
    private Date startParkingTime;

    @NotNull(message = "实际出场时间不能为空！")
    @ApiModelProperty("实际出场时间")
    private Date endParkingTime;

    @NotNull(message = "实际欠费价格不能为空！")
    @ApiModelProperty("实际欠费价格")
    private Integer arrearsPrice;

    @ApiModelProperty("改单人")
    private Integer sysUserId;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("改单时间")
    private Date addTime;

}
