package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * <h3>park</h3>
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-27 15:17
 **/
@Data
@ApiModel(value = "车辆车场授权参数")
@ToString
public class DictParkingRightParams extends CmsPageHelperParams{
    @ApiModelProperty(value = "用户姓名")
    private String nickname;

    @ApiModelProperty(value = "电话")
    private String mobileNumber;

    @ApiModelProperty(value = "车牌号列表")
    private String plateNumbers;

    @ApiModelProperty(value = "停车场id")
    private String parkingId;
}
