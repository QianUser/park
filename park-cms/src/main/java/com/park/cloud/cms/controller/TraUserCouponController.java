package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.TraUserCouponService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.GetUserCouponParams;
import com.park.cloud.common.domain.params.order.TraUserCouponAddListParams;
import com.park.cloud.common.domain.params.order.TraUserCouponAddParams;
import com.park.cloud.common.domain.params.order.TraUserCouponParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.GetUserCouponVO;
import com.park.cloud.common.domain.vo.order.UserCouponVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author liuhainan
 */
@Api(value = "用户优惠券", tags = {"用户优惠券接口"})
@RequestMapping(value = "userCoupon")
@Slf4j
@Validated
@RestController
public class TraUserCouponController {

    @Autowired
    private TraUserCouponService userCouponService;

    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<UserCouponVO>> queryList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraUserCouponParams params){
        return userCouponService.queryList(params);
    }

    @PostMapping("userCoupons")
    @ApiOperation(value = "根据状态查询用户优惠券接口", notes = "根据状态查询用户优惠券接口")
    public CommonResult<List<GetUserCouponVO>> userCoupons(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid GetUserCouponParams params){
        params.setUserId(params.getLoginSysUserId().toString());
        return userCouponService.userCoupons(params);
    }

    @PostMapping("add")
    @ApiOperation(value = "新增接口", notes = "新增接口")
    public CommonResult<String> add(@Valid @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @RequestBody TraUserCouponAddParams params){

        return userCouponService.add(params);
    }

    @PostMapping("addList")
    @ApiOperation(value = "批量新增用户优惠券", notes = "批量新增用户优惠券")
    @ResponseBody
    public CommonResult<String> addList(@Valid @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @RequestBody TraUserCouponAddListParams params){
        return userCouponService.addList(params);
    }
}
