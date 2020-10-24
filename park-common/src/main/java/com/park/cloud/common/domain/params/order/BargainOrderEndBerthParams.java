package com.park.cloud.common.domain.params.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kris_ni
 * @date 2020/4/8
 */
@Data
@ApiModel
public class BargainOrderEndBerthParams {

    @ApiModelProperty(value = "泊位设备SN号")
    private String snCode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "结束停车时间")
    private LocalDateTime berthEndParkTime;
}
