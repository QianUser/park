package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepParkOperateByMonthService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepParkOperateByMonthCountParams;
import com.park.cloud.common.domain.params.cms.RepParkOperateByMonthParams;
import com.park.cloud.common.domain.params.cms.RepPerkOperateDetailsParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperateByMonthPageVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperateByMonthVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperateDetailsVO;
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
 * @ClassNameRep
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/5 10:12
 **/
@Api(value = "RepParkOperateByMonthController", tags = {"停车月报表接口"})
@RestController
@RequestMapping(value = "repParkOperateByMonth")
@Validated
public class RepParkOperateByMonthController {
    @Autowired
    private RepParkOperateByMonthService repParkOperateByMonthService;

    @PostMapping("dealStatistics")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<RepParkOperateByMonthVO> dealStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkOperateByMonthCountParams params, BindingResult result) {
        return repParkOperateByMonthService.dealStatistics(params);
    }
    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepParkOperateByMonthPageVO>> getRepOperateByMonth(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkOperateByMonthParams params, BindingResult result) {
        return repParkOperateByMonthService.getRepOperateByMonth(params);
    }


    /**
     * @Description:根据停车id和类型查询详情相关订单信息
     * @Author: liangshuang
     * @Date: 2020/3/5 13:36

     **/
    @PostMapping("detailsList")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepParkOperateDetailsVO>> detailsList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepPerkOperateDetailsParams params, BindingResult result) {
        return repParkOperateByMonthService.detailsList(params);
    }


}
