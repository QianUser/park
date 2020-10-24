package com.park.cloud.common.domain.po.sys;

import lombok.Data;

import java.util.Date;

@Data
public class SysDepartmentPO {
    private Integer deptId;

    private Integer companyId;

    private String deptName;

    private Integer parentDeptId;

    private String deptRemark;

    private Integer deptStatus;

    private Integer deptSort;

    private Date addTime;

    private Integer addUser;

    private Integer deptTypeId;

    private Integer cantonId;

    private Integer deptRelationId;

}