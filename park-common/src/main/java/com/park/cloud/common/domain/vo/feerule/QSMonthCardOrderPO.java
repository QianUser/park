package com.park.cloud.common.domain.vo.feerule;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: xiawei
 * @Date: 2020/7/25 0:49
 */
@Data
public class QSMonthCardOrderPO {
    private LocalDateTime createTime;
    private String parkCode;
    private Float payCharge;
    private String modelValue;
    private String modelFlag;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String plateNumber;
    private Integer payStatus;
    private String orderCode;
}
