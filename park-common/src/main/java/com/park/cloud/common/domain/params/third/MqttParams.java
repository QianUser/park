package com.park.cloud.common.domain.params.third;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class MqttParams implements Serializable{

    @ApiModelProperty(value = "主题", required = true)
    private String topic;

    @ApiModelProperty(value = "服务质量", required = true)
    private Integer qos;

    @ApiModelProperty(value = "消息", required = true)
    private byte[] message;

}
