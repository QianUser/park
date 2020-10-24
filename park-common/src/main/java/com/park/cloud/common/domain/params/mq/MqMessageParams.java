package com.park.cloud.common.domain.params.mq;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author 1004185
 */
@ApiModel
@Data
public class MqMessageParams implements Serializable {

    @NotBlank(message = "队列名称不能为空")
    @ApiModelProperty(value = "队列名称", required = true, example = "mytest.queue")
    private String destination;

    @ApiModelProperty(value = "消息内容")
    private String text;
}
