package com.park.cloud.common.domain.params.feerule;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 车辆酒店登记
 * </p>
 *
 * @author xukaihua
 * @since 2020-07-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class QSCarplatRegistHostel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer hotelId;

    /**
     * 车牌号
     */
    private String carNumber;

    /**
     * 住店时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date inTime;

    /**
     * 离店时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date outTime;

    private String reigstUserName;

    private String registUserPhone;

    private String registUserIdCard;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Integer totalFee;

    private Integer hotelFee = 0;

    private Integer custormerFee;
    /**
     * 停车时长分
     */
    private Integer parkTime;


    private Integer isHotelPay;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date parkStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date parkEndTime;

    private int status;

    private int payStatus;

    private int isLive;

    private String parkCode;

}
