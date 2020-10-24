package com.park.cloud.common.domain.params.cms;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("违章欠款列表查询实体")
public class PeccancyFineSearchParams extends PageHelperParams {

    @ApiModelProperty(value = "欠款单号")
    private String peccPiceCode;

    @ApiModelProperty(value = "违章工单")
    private String inPeccancyCode;

    @ApiModelProperty(value = "车牌号")
    private Integer inPeccancyPlateNumber;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @ApiModelProperty(value = "是否缴清（1，未缴 2，已缴）")
    private Integer isPay;

    @ApiModelProperty(value = "是否为免费车牌（0：否；1：是）")
    private Integer isFreePlateNumber;

    @ApiModelProperty(value = "欠费单状态（1，未处理2,已处理3，已取消")
    private Integer fineStatus;

    @ApiModelProperty(value = "违章时间(开始)")
    private Date peccDateStart;

    @ApiModelProperty(value = "违章时间(结束)")
    private Date peccDateEnd;

}
