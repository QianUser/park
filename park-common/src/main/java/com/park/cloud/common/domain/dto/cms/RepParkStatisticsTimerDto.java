package com.park.cloud.common.domain.dto.cms;

import lombok.Data;

/**
 * @ClassNameRepParkStatisticsTImerDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/14 16:31
 **/
@Data
public class RepParkStatisticsTimerDto {
    private Integer parkId;
    private Integer cityId;
    private Integer cantonId;
    private Integer areaId;
    private String startTime;
    private String  endTime;
    private String parkCode;

}
