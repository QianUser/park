package com.park.cloud.common.domain.po.opm;

import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
public class OpmCorrectOrderPO {
    private Integer correctId;

    private String correctCode;

    private String berthCode;

    private String areaCode;

    private Integer xjId;

    private Date addTime;

    private Integer parkStatus;

    private Integer correctState;

    private Date auditTime;

    private Integer auditUserId;

    private Integer auditState;

    private Integer downState;

    private Integer resultState;

}