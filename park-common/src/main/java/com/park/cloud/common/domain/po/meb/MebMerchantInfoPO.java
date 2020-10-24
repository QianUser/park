package com.park.cloud.common.domain.po.meb;

import lombok.Data;

import java.util.Date;

@Data
public class MebMerchantInfoPO {
    private Integer mid;

    private String mInfoCode;

    private String mInfoName;

    private String mInfoContacts;

    private String mTelephone;

    private String mAddress;

    private String mUid;

    private String mPwd;

    private Integer subMid;

    private String merchantToken;

    private Date expireTime;

    private Integer loginStatus;

    private Integer mUserStatus;

    private String deviceEimi;

    private String remark;

    private Date addTime;

    private String merchantOpenId;

}