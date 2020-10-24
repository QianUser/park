package com.park.cloud.common.domain.params.feerule;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 部门表:存储系统部门信息
 * </p>
 *
 * @author xukaihua
 * @since 2020-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysDepartment implements Serializable {

    private static final long serialVersionUID=1L;


    private Integer deptId;

    /**
     * 所属单位id
     */
    private Integer companyId;

    /**
     * 	部门名称
     */
    private String deptName;

    /**
     * 上级部门(0表示没有上级部门)
     */
    private Integer parentDeptId;

    /**
     * 备注
     */
    private String deptRemark;

    /**
     * 状态（0：已锁定  1：启用中）
     */
    private Integer deptStatus;

    /**
     * 排序号
     */
    private Integer deptSort;

    /**
     * 创建时间
     */
    private Date addTime;

    /**
     * 创建人
     */
    private Integer addUser;

    /**
     * 部门类型id
     */
    private Integer deptTypeId;

    /**
     * 行政区
     */
    private Integer cantonId;

    /**
     * 关联部门权限
     */
    private Integer deptRelationId;


}
