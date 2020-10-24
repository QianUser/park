package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraOrderChangeVO {

    @ApiModelProperty("主键")
    private Integer changeOrderId;

    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

    @ApiModelProperty("原进场时间")
    private Date oldStartParkingTime;

    @ApiModelProperty("原出场时间")
    private Date oldEndParkingTime;

    @ApiModelProperty("原欠费价格")
    private Integer oldArrearsPrice;

    @ApiModelProperty("实际进场时间")
    private Date startParkingTime;

    @ApiModelProperty("实际出场时间")
    private Date endParkingTime;

    @ApiModelProperty("实际欠费价格")
    private Integer arrearsPrice;

    @ApiModelProperty("改单人")
    private Integer sysUserId;

    @ApiModelProperty("改单人名称")
    private String sysUserName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("改单时间")
    private Date addTime;

}
