package com.park.cloud.common.domain.params.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class BargainOrderOutListParams extends PageHelperParams {

    @ApiModelProperty(value = "订单Id")
    private Long traBargainOrderId;

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "用户手机号码")
    private String mobileNumber;

    @ApiModelProperty(value = "停车场")
    private String parkingName;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "计费结束时间(起)")
    private LocalDateTime endParkingStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "计费结束时间(末)")
    private LocalDateTime endParkingEndTime;

}