package com.park.cloud.common.domain.vo.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalTime;

/**
 * @author kris_ni
 * @date 2020/2/22
 */
@Data
@ApiModel
public class TimeDurianVO {

    @JsonFormat(pattern = "HH:mm:ss")
    @ApiModelProperty(value = "收费开始时间(HH:mm)")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm:ss")
    @ApiModelProperty(value = "收费结束时间(HH:mm)")
    private LocalTime endTime;
}
