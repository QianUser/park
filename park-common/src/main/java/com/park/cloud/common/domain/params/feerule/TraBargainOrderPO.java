package com.park.cloud.common.domain.params.feerule;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TraBargainOrderPO {
    private Long traBargainOrderId;

    private String bargainOrderCode;

    private String berthCode;

    private String cityCode;

    private String parkUserId;

    private String mobileNumber;

    private String rfidCode;

    private String plateNumber;

    private Integer plateType;

    private LocalDateTime startParkingTime;

    private LocalDateTime endParkingTime;

    private Integer actualDuration = 0;

    private Integer actualPrice = 0;

    private Integer applyMethod;

    private LocalDateTime addTime;

    private Integer orderStatus;

    private Integer applyactualDuration;

    private Integer applyPrice;

    private Integer arrearsPrice;

    private Integer refundPrice;

    private LocalDateTime berthStartParkingTime;

    private LocalDateTime berthEndParkingTime;

    private Integer berthStartErrorFlag;

    private Integer berthEndErrorFlag;

    private Integer parkTime;

    private Integer proposalForm;

    private LocalDateTime applyTime;

    private Integer bargainOrderType;

    private Integer orderType;

    private String parkOrderNo;

    private String parkCode;

    private Integer userType;

    private Integer leaveStatus;

    private Integer notityStatus;

    private Integer parkOutTime;

    private Float payCharge;

    private String freeType;

    private Float freeCharge;

    private Integer chargeType;

    private Float discountCharge;

    private Integer discountTime;

    private Integer carioId;

    private Integer payStatus;

    private Integer payType;

    private LocalDateTime payTime;

    private String parkName;

    private Integer parkId;

    /**
     * 0、默认，1、大华
     */
    private Integer source;
}
