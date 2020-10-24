package com.park.cloud.common.domain.params.dahua;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 入场参数
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ArriveParam extends CommParam {
    /**
     * 操作时间，格式：yyyyMMddHHmmss
     */
    private String actTime;

    /**
     * 操作类型：0、月租或长期车辆，1、时租访客车辆，2、免费车辆，3、异常未知车辆
     */
    private String actType;

    /**
     * 附加泊位，当前为空字符串
     */
    private String addBerth;

    /**
     * 进场时间，格式yyyyMMddHHmmss
     */
    private String arriveTime;

    /**
     * 泊位编号，当前为空字符串
     */
    private String berthId;

    /**
     * 业务流水号，进场数据ID
     */
    private String bizSn;

    /**
     * 业务类型：1、进场，2、出场
     */
    private String businessType;

    /**
     * 车牌号，无牌车为N000001
     */
    private String carNum;

    /**
     * 车辆类型：1、小型车，2、大型车，当前为固定值1
     */
    private String carType;

    /**
     * 访客剩余车位
     */
    private String guestRemainNum;

    /**
     * 包月证号，月卡用户卡号
     */
    private String monthlyCertNumber;

    /**
     * 月租剩余车位
     */
    private String monthlyRemainNum;

    /**
     * 工号，进场时工号为空，停车场端收费管理系统的登录工号
     */
    private String uid;

    /**
     * 停车凭证号，月卡用户卡号
     */
    private String voucherNo;

    /**
     * 停车凭证类型，目前为固定值：101、临时车卡号
     */
    private String voucherType;

    /**
     * 道闸id
     */
    private String sluiceDevChnId;

    /**
     * 道闸名称
     */
    private String sluiceDevChnName;

    /**
     * 车牌颜色：0、蓝，1、黄，2、白，3、黑，99、未识别
     */
    private String carNumcolor;

    /**
     * 车场编号，下级车场CODE
     */
    private String parkingLot;

    /**
     * 图片存放路径
     */
    private String carImgUrl;

    /**
     * 唯一编号（云平台上面分配的编号），第三方对接时填写（场区配置中的拓展字的编号）
     */
    private String platFormCode;

    /**
     * 总余位数
     */
    private String totRemianNum;
}
