package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.TraPricingStrategyService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.TraPricingStrategyListParams;
import com.park.cloud.common.domain.params.order.TraPricingStrategyParams;
import com.park.cloud.common.domain.po.tra.TraPricingRatePO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraPricingStrategyVO;
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
import java.util.List;
import java.util.Objects;

/**
 * @author liuhainan
 */
@Api(value = "收费策略", tags = {"收费策略接口"})
@RequestMapping(value = "pricingStrategy")
@Slf4j
@Validated
@RestController
public class TraPricingStrategyController {

    @Autowired
    private TraPricingStrategyService pricingStrategyService;

    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<TraPricingStrategyVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraPricingStrategyListParams params) {
        return pricingStrategyService.selectList(params);
    }

    @PostMapping("all")
    @ApiOperation(value = "查询所有接口", notes = "查询所有接口")
    public CommonResult<List<TraPricingStrategyVO>> all(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraPricingStrategyListParams params) {
        return pricingStrategyService.all(params);
    }

    @PostMapping("detaile")
    @ApiOperation(value = "查询详情", notes = "查询详情")
    public CommonResult<TraPricingStrategyVO> detaile(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid IdParams params) {
        return pricingStrategyService.detail(params);
    }

    @PostMapping("insert")
    @ApiOperation(value = "新增接口", notes = "新增接口")
    public CommonResult<TraPricingStrategyVO> insert(@Valid @RequestBody  TraPricingStrategyParams traPricingStrategyPO, BindingResult result){
        traPricingStrategyPO.setAddUser(traPricingStrategyPO.getLoginSysUserId());
        if(Objects.isNull(traPricingStrategyPO.getFreeDuration())){
            return CommonResult.failed("免费时长不能为空!");
        }

        if(Objects.isNull(traPricingStrategyPO.getPricingRates())){
            return CommonResult.failed("收费策略费率为空!");
        }
        List<TraPricingRatePO> pricingRates = traPricingStrategyPO.getPricingRates();
        for (TraPricingRatePO pricingRate : pricingRates) {
            if(Objects.isNull(pricingRate.getRateStartMinute())){
                return CommonResult.failed("开始分钟数不能为空!");
            }
            if(Objects.isNull(pricingRate.getRateEndMinute())){
                return CommonResult.failed("间隔分钟数不能为空!");
            }
            if(Objects.isNull(pricingRate.getRateDateType())){
                return CommonResult.failed("日期类型不能为空!");
            }
            if(Objects.isNull(pricingRate.getRatePrice())){
                return CommonResult.failed("区段费用不能为空!");
            }
            if(Objects.isNull(pricingRate.getRateUnit())){
                return CommonResult.failed("最小计费单元不能为空!");
            }
            if(traPricingStrategyPO.getFreeDuration()>pricingRate.getRateStartMinute()){
                return CommonResult.failed("免费时长不能大于第一阶段数收费结束时间");
            }
        }

        return pricingStrategyService.insert(traPricingStrategyPO);
    }

    @PostMapping("update")
    @ApiOperation(value = "更新接口", notes = "根据主键更新")
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraPricingStrategyParams params){
        return pricingStrategyService.update(params);
    }

    @PostMapping("deleteById")
    @ApiOperation(value = "删除接口", notes = "根据主键删除")
    public CommonResult deleteById(@Valid @RequestBody IdParams params){
        return pricingStrategyService.deleteById(params);
    }
}

