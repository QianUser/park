package com.park.cloud.common.domain.dto.cms;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassNameStatisticsTimerDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/9 14:40
 **/
@Data
public class StatisticsTimerDto implements Serializable {
    private Integer sectionId;
    private Integer payType;
    private String parkCode;
}
