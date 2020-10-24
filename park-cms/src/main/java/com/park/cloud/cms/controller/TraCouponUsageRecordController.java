package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.TraCouponUsageRecordService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraCouponUsageRecordParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponUsageRecordVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author liuhainan
 */
@Api(value = "优惠券使用记录", tags = {"优惠券使用记录"})
@RequestMapping(value = "couponUsageRecord")
@Slf4j
@RestController
public class TraCouponUsageRecordController {

    @Autowired
    private TraCouponUsageRecordService recordService;

    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<CouponUsageRecordVO>> getCouponUsageRecords(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)TraCouponUsageRecordParams params, BindingResult result) {
        return recordService.getCouponUsageRecords(params);
    }
}
