package com.park.cloud.common.domain.po.dac;

import lombok.Data;

import java.util.Date;

@Data
public class DacImportRecordPO {
    private Long id;

    private String parkCode;

    private String cityCode;

    private String entranceName;

    private Date entranceTime;

    private Integer exitStatus;

    private String exitName;

    private Date exitTime;

    private String plateNumber;

    private Integer plateType;

    private Integer chargeType;

    private Integer carType;

    private String inImgPath;

    private String outImgPath;

    private Integer spaceNo;

    private Integer inReactionType;

    private Integer inMachineUpType;

    private Integer outReactionType;

    private Integer outMachineUpType;

    private Date addTime;

    private String addUser;

    private String appKey;

    private String ipAddress;

    private String bargainOrderCode;

    private String parkStopCode;

    /**
     * 0、默认，1、大华
     */
    private Integer source;
}