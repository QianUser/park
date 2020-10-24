package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepParkOperateByMonthService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepRunStatisticsByMonthParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
import com.park.cloud.common.util.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * @ClassNameRepRunStatisticsByMonthController
 * @Description 运营统计分析
 * @Author liangshuang
 * @Date 2020/3/10 16:05
 **/
@Api(value = "RepRunStatisticsByMonthController", tags = {"运营统计分析接口"})
@RestController
@RequestMapping(value = "repRunStatisticsByMonth")
@Validated
public class RepRunStatisticsByMonthController {
   @Autowired
   private RepParkOperateByMonthService repParkOperateByMonthService;



    @PostMapping("repRunStatistics")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<RepRunStatisticsTopVO> repRunStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepRunStatisticsByMonthParams params, BindingResult result) {
        return repParkOperateByMonthService.repRunStatistics(params);
    }
    @PostMapping("repRunBelowStatistics")
    @ApiOperation(value = "统计接口", notes = "下方模块数据")
    @ResponseBody
    public CommonResult<List<RepRunBelowStatisticsVO>> repRunBelowStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepRunStatisticsByMonthParams params, BindingResult result) {
        return repParkOperateByMonthService.repRunBelowStatistics(params);
    }

    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepRunStatisticsByMonthVO>> getRunStatisticsByMonth(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepRunStatisticsByMonthParams params, BindingResult result) {
        return repParkOperateByMonthService.getRunStatisticsByMonth(params);
    }


}
