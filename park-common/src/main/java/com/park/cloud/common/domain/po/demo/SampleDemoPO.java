package com.park.cloud.common.domain.po.demo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SampleDemoPO {
    private Integer sampleDemoId;

    private String name;

    private Integer status;

    private Date addTime;

    private BigDecimal rate;

}