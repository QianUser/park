package com.park.cloud.common.domain.po.inv;

import lombok.Data;

@Data
public class InvEinvoiceBargainOrderPO {
    private Integer eid;

    private String einvoiceCode;

    private String bargainOrderCode;

    private Byte orderType;

}