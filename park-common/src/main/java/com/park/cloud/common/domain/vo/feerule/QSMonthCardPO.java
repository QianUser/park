package com.park.cloud.common.domain.vo.feerule;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: xiawei
 * @Date: 2020/7/27 14:45
 */
@Data
public class QSMonthCardPO {
    private String parkCode;
    private Float payCharge;
    private String modelValue;
    private String modelFlag;
    private Date startTime;
    private Date endTime;
    private String plateNumber;
    private Integer payStatus;
    private Integer status;
    private Integer cardType;
    private Integer monthCardId;
    private String parkUserId;
    private String orderCode;
    private String parkId;
    private String parkName;
    private Float orderPrice;
    private Float unitPrice;
    private String dailyValidTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date validStartTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date validEndTime;
    private String nickname;
    private String mobileNumber;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date payTime;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payStartTime;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payEndTime;
}
