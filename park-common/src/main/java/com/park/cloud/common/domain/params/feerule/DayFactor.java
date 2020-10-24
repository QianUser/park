package com.park.cloud.common.domain.params.feerule;

import lombok.Data;

import java.util.Date;

@Data
public class DayFactor {
    private Date startTime;
    private Date endTime;
    private Integer dayOrder = 0;
    private boolean isFirstDay = false;
    private boolean isLastDay = false;
}
