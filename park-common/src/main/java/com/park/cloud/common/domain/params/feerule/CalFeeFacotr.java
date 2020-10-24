package com.park.cloud.common.domain.params.feerule;

import lombok.Data;

import java.util.Date;


@Data
public class CalFeeFacotr {

    private Date startParkingTime;

    private Date endParkingTime;

    private String plateNumber;

    private String parkCode;

    private Date OriginStartTime;
}
