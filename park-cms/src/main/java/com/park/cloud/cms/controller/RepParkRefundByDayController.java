package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepParkRefundByDayService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepParkCountRefundParams;
import com.park.cloud.common.domain.params.cms.RepParkRefundByDayParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepParkCountRefundVO;
import com.park.cloud.common.domain.vo.cms.RepParkRefundByDayVO;
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
 * @ClassNameRepParkRefundByDayController
 * @Description 退费报表
 * @Author liangshuang
 * @Date 2020/3/6 14:32
 **/
@Api(value = "RepParkRefundByDayController", tags = {"退费报表接口"})
@RestController
@RequestMapping(value = "repParkRefundByDay")
@Validated
public class RepParkRefundByDayController {
    @Autowired
    private RepParkRefundByDayService repParkRefundByDayService;


    @PostMapping("dealStatistics")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<RepParkCountRefundVO> dealStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkCountRefundParams params, BindingResult result) {
        return repParkRefundByDayService.dealStatistics(params);
    }
    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepParkRefundByDayVO>> getRepParkRefund(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkRefundByDayParams params, BindingResult result) {
        return repParkRefundByDayService.getRepParkRefund(params);
    }


}
