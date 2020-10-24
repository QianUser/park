package com.park.cloud.common.domain.po.sys;

import lombok.Data;

import java.util.Date;

@Data
public class SysCompanyPO {
    private Integer companyId;

    private String companyName;

    private String companyCode;

    private Integer companyType;

    private String companyAddress;

    private String companyTel;

    private String companyFax;

    private String companyEmail;

    private String companyHead;

    private String companyWebsite;

    private Date addTime;

    private Integer addUser;

    private String peccThumbnailPic;

    private String companyPic;

    private String companyLat;

    private String companyLng;

}