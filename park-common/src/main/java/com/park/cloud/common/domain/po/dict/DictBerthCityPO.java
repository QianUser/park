package com.park.cloud.common.domain.po.dict;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("泊位信息")
public class DictBerthCityPO {

    @ApiModelProperty("主键")
    private Integer berthId;

    @NotBlank(message = "泊位号不能为空！")
    @ApiModelProperty("泊位号")
    private String berthCode;

    @NotBlank(message = "泊位设备SN号不能为空！")
    @ApiModelProperty("泊位设备SN号")
    private String snCode;

    @ApiModelProperty("片区id")
    private Integer areaId;

    @ApiModelProperty("路段id")
    private Integer sectionId;

    @NotNull(message = "行政区不能为空！")
    @ApiModelProperty("行政区id")
    private Integer cantonId;

    @NotNull(message = "城市不能为空！")
    @ApiModelProperty("城市id")
    private Integer cityId;

    @ApiModelProperty("停车场id")
    private Integer parkingId;

    @ApiModelProperty("所属管辖单位id")
    private Integer companyId;

    @NotNull(message = "排列方向不能为空！")
    @ApiModelProperty("排列方向 1靠左 2靠右")
    private Integer lineDirection;

    @NotNull(message = "状态不能为空！")
    @ApiModelProperty("状态（1规划中、2建设中、3使用中、4维修中、5已停用）")
    private Integer berthStatus;

    @ApiModelProperty("停车状态（0：无车，1：入场，2：开始计费，3：出场，4：出场超时，5：超时再收费，6：异常）")
    private Integer parkStatus;

    @ApiModelProperty("状态的更新时间")
    private Date statusUpdteDate;

    @ApiModelProperty("经度")
    private String berthLongitude;

    @ApiModelProperty("纬度")
    private String berthLatitude;

    @ApiModelProperty("泊位设置位置（东侧 =1,西侧 = 2,南侧 = 3,北侧 = 4）")
    private Integer setPosition;

    @ApiModelProperty("备注")
    private String berthRemark;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("创建人")
    private Integer addUser;

    @ApiModelProperty("0：个人；1：商用")
    private Integer useWay;

}