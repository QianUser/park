package com.park.cloud.common.domain.params.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author kris_ni
 * @date 2020/2/5
 */
@Data
@ApiModel
public class TraBargainOrderListParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @ApiModelProperty(value = "用户手机号码")
    private String mobileNumber;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

    @ApiModelProperty(value = "支付方式0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）")
    private Integer payType;

    @ApiModelProperty(value = "片区ids")
    private List<Integer> areaIds;

    @ApiModelProperty(value = "申请方式（0:自泊；1：pda）")
    private Integer applyMethod;

    @ApiModelProperty(value = "订单状态（1：进行中，2：已结束)")
    private Integer orderStatus;

    @ApiModelProperty(value = "支付状态：0未支付；1已支付")
    private Integer payStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "出场开始时间")
    private LocalDateTime endParkStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "出场结束时间")
    private LocalDateTime endParkEndTime;

    @ApiModelProperty(value = "路外停车场编号")
    private String parkCode;

    @ApiModelProperty(value = "车辆类型\n" +
            "0:临时卡\n" +
            "1: 月卡\n" +
            "2: 年卡\n" +
            "3：免费")
    private Integer chargeType;

    @ApiModelProperty(value = "辖区类型（0全部，1城市、2行政区、3片区）")
    private Integer areaAssType;

    @ApiModelProperty(value = "用户停车号id")
    private String parkUserId;

}
