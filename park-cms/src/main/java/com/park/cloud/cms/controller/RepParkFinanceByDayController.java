package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepParkFinanceByDayService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @ClassNameRepParkFinanceByDayController
 * @Description 财务总报表
 * @Author liangshuang
 * @Date 2020/3/7 10:33
 **/
@Api(value = "RepParkFinanceByDayController", tags = {"财务总报表接口"})
@RestController
@RequestMapping(value = "repParkFinanceByDay")
@Validated
public class RepParkFinanceByDayController {

   @Autowired
   private RepParkFinanceByDayService repParkFinanceByDayService;

    @PostMapping("dealStatistics")
    @ApiOperation(value = "财务总报表统计接口", notes = "仅财务总报表上方模块数据")
    @ResponseBody
    public CommonResult<RepParkFinanceByDayCountVO> dealStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkFinanceByDayCountParams params, BindingResult result) {
        return repParkFinanceByDayService.dealStatistics(params);
    }
    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepParkFinanceByDayPageVO>> getRepParkFinance(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkFinanceByDayParams params, BindingResult result) {
        return repParkFinanceByDayService.getRepParkFinance(params);
    }


    //点击详情带有路段名称和id和路段类型,还有支付类型过来
    @PostMapping("detailsList")
    @ApiOperation(value = "详情查询接口", notes = "详情分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepParkFinanceDetailsVO>> detailsList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkFinanceDetailsParams params, BindingResult result) {
        return repParkFinanceByDayService.detailsList(params);
    }
    @PostMapping("dealSummarize")
    @ApiOperation(value = "财务汇总日报表统计接口", notes = "仅财务汇总日报表上方模块数据")
    @ResponseBody
    public CommonResult<RepParkFinanceSummarizeVO> dealSummarize(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkFinanceByDayCountParams params, BindingResult result) {
        return repParkFinanceByDayService.dealSummarize(params);
    }

}
