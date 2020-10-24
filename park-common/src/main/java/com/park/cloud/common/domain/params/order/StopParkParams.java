package com.park.cloud.common.domain.params.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class StopParkParams extends CmsBaseParams {
    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

    @NotBlank(message = "订单编号不能为空！")
    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "计费结束时间")
    private LocalDateTime endParkingTime;

    @NotBlank(message = "停车计费时长不能为空！")
    @ApiModelProperty(value = "停车计费时长")
    private Integer parkTime;

    @NotBlank(message = "应收金额不能为空！")
    @ApiModelProperty(value = "应收金额 \n" +
            "单位：元")
    private Float payCharge;

}
