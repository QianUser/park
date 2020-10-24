package com.park.cloud.common.domain.dto.cms;

import lombok.Data;

/**
 * @ClassNameRepFindParkDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/5/29 13:16
 **/
@Data
public class RepFindParkDto {
    private Integer parkType;
    private String parkCode;
    private Integer payType;
    private String statisticsDay;
}
