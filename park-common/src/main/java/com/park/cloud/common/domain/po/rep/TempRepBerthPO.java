package com.park.cloud.common.domain.po.rep;

import lombok.Data;

/**
 * @ClassNameTempRepBerthPO
 * @Description 临时接收查询出的数据
 * @Author liangshuang
 * @Date 2020/2/25 10:16
 **/
@Data
public class TempRepBerthPO {

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer sectionId;
    private String sectionName;
    private  Integer applyMethod;
    private String berthCode;
}
