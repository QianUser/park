package com.park.cloud.common.domain.dto.tra;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author kris_ni
 * @date 2020/2/6
 */
@Data
public class BargainOrderDto {

    private String bargainOrderCode;

    private String berthCode;

    private String mobileNumber;

    private String plateNumber;

    private Integer bargainOrderType;

    private Integer payType;

    private List<Integer> areaIds;

    private Integer applyMethod;

    private Integer orderStatus;

    private Integer payStatus;

    private LocalDateTime endParkStartTime;

    private LocalDateTime endParkEndTime;

    private String parkCode;

    private Integer chargeType;

    private Integer areaAssType;

}
