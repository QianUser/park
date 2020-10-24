package com.park.cloud.common.domain.params.mq;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 1004185
 */
@ApiModel
@Data
public class MqttMessageParams implements Serializable {

    @ApiModelProperty(value = "主题")
    private String topic;

    @ApiModelProperty(value = "消息内容")
    private String text;
}
