package com.park.cloud.common.domain.params.feerule;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 酒店关联停车场
 * </p>
 *
 * @author xukaihua
 * @since 2020-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class QSHotelPark implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String parkCode;

    private Integer hotelId;

    /**
     * 自有位数
     */
    private Integer ownParkingCount;

    /**
     * 剩余车位数
     */
    private Integer leftParkingCount;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    /**
     * 租赁位数
     */
    private String hireParkingCount;

    /**
     * 总位数
     */
    private String totalParkingCount;

    /**
     * 租赁费
     */
    private Integer hireFee;

    /**
     * 管理费
     */
    private Integer mngFee;


    private Integer outFee;



}
