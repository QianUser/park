package com.park.cloud.common.domain.po.meb;

import lombok.Data;

import java.util.Date;

@Data
public class MebUserPO {
    private Integer mebUserId;

    private String parkUserId;

    private Integer userType;

    private String mobileNumber;

    private String mobileCode;

    private String userNickname;

    private String userOpenId;

    private String loginPwd;

    private String payPwd;

    private String plateNumber;

    private String userTrueName;

    private String userIdcardNumber;

    private Integer userSex;

    private Date addTime;

    private Integer userStatus;

    private String bankType;

    private String bankCard;

    private String bankPhone;

    private String acctStatus;

    private Date cancelTime;

    private String memo;

    private Boolean isBindBank;

    private Integer illegalTimes;

    private String mobileOperator;

    private String numberAttribution;

    private String mobileModels;

    private String mobileSystem;

    private String appVersion;

    private Integer isSpecial;

    private String idcardScanFilePath;

    private String idcardScanAntiFilePath;

    private Integer ifFirstTopEccancy;

}