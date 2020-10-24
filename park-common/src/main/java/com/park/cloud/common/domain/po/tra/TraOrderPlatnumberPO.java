package com.park.cloud.common.domain.po.tra;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单关联车牌表
 * </p>
 *
 * @author xukaihua
 * @since 2020-08-01
 */
@Data
@ApiModel
public class TraOrderPlatnumberPO{

    private Long id;

    /**
     * 车牌号列表
     */
    private String plateNumbers;

    /**
     * 路内：停车开始车检器变成有车的时间
     */
    private LocalDateTime berthStartParkingTime;

    /**
     * 路内：车辆驶离车检器变成无车的时间 路外：结束时间
     */
    private LocalDateTime berthEndParkingTime;

    private Long traBargainOrderId;


}
