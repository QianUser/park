package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.TraCouponPolicyService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.GetUserListParams;
import com.park.cloud.common.domain.params.order.TraCouponPolicyListParams;
import com.park.cloud.common.domain.params.order.TraCouponPolicyUpdateParams;
import com.park.cloud.common.domain.params.order.TraWxjlCouponPolicyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponPolicyVO;
import com.park.cloud.common.domain.vo.order.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;
import java.util.Objects;

/**
 * @author liuhainan
 */
@Api(value = "优惠券策略", tags = {"优惠券策略接口"})
@RequestMapping(value = "couponPolicy")
@Slf4j
@Validated
@RestController
public class TraCouponPolicyController {

    @Autowired
    private TraCouponPolicyService couponPolicyService;

    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<CouponPolicyVO>> selectSampleDemoPOs(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraCouponPolicyListParams params) {
        return couponPolicyService.getcouponPolicyPOs(params);
    }

    @PostMapping("update")
    @ApiOperation(value = "更新接口", notes = "根据主键更新")
    public CommonResult update(@RequestBody TraCouponPolicyUpdateParams params){
        return couponPolicyService.update(params);
    }

    @PostMapping("deleteById")
    @ApiOperation(value = "删除接口", notes = "根据主键删除")
    public CommonResult deleteById(@Valid IdParams params){
        return couponPolicyService.deleteById(params);
    }

    @PostMapping("insert")
    @ApiOperation(value = "新增接口", notes = "新增接口")
    public CommonResult insert(@RequestBody @Valid TraWxjlCouponPolicyParams params, BindingResult result){
        params.setSurplusNum(params.getCouponNum());
        if(Objects.isNull(params.getUseNumber())){
            params.setUseNumber(1);
        }
        if(params.getRulesType()==3){
            if(Objects.isNull(params.getCouponPrice())){
                return CommonResult.failed("优惠券金价格不能为空");
            }
            if(params.getCouponPrice()<0){
                return CommonResult.failed("优惠券价格不能小于0");
            }
        }
        if(params.getUseNumber()<0){
            return CommonResult.failed("发放张数不能为负数");
        }

        if(params.getRelationType()==0 && Float.valueOf(params.getCouponMoney())<0){
            return CommonResult.failed("优惠券价格不能小于0");
        }
        if(Objects.isNull(params.getTermOfValidity())){
            params.setTermOfValidity(60);
        }
        if(Objects.isNull(params.getPaymentType())){
            params.setPaymentType(0);
        }
        if(Objects.isNull(params.getMid())){
            params.setMid("0");
        }
        if(params.getEndTime().compareTo(params.getStartTime())!=1){
            return CommonResult.failed("结束时间必须晚于开始时间！");
        }
        params.setAddTime(new Date());

        return couponPolicyService.insert(params);
    }

    @PostMapping("userList")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<UserVo>> userList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) GetUserListParams params) {
        return couponPolicyService.userList(params);
    }
}
