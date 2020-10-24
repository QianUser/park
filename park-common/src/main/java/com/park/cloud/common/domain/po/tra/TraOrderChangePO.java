package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
public class TraOrderChangePO {
    private Integer changeOrderId;

    private String bargainOrderCode;

    private Date oldStartParkingTime;

    private Date oldEndParkingTime;

    private Integer oldArrearsPrice;

    private Date startParkingTime;

    private Date endParkingTime;

    private Integer arrearsPrice;

    private Integer sysUserId;

    private String remark;

    private Date addTime;

}