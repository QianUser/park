package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

@Data
public class TraPricingHolidayPO {
    private Integer id;

    private Date hdate;

    private Integer htype;

    private String remark;
}