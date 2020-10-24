package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepRoadStatisticsService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepRoadStatisticsParams;
import com.park.cloud.common.domain.vo.cms.RepRoadStatisticsBelowVO;
import com.park.cloud.common.domain.vo.cms.RepRoadStatisticsTopVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @ClassNameRepRoadStatisticsController
 * @Description 路内运营报表
 * @Author liangshuang
 * @Date 2020/3/10 10:48
 **/
@Api(value = "RepRoadStatisticsController", tags = {"路内运营报表接口"})
@RestController
@RequestMapping(value = "repRoadStatistics")
@Validated
public class RepRoadStatisticsController {
     @Autowired
     private RepRoadStatisticsService repRoadStatisticsService;
    @PostMapping("roadStatistics")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<RepRoadStatisticsTopVO> roadStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepRoadStatisticsParams params, BindingResult result) {
        return repRoadStatisticsService.dealStatistics(params);
    }
    @PostMapping("roadStatisticsBelow")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<List<RepRoadStatisticsBelowVO>> roadStatisticsBelow(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepRoadStatisticsParams params, BindingResult result) {
        return repRoadStatisticsService.roadStatisticsBelow(params);
    }

}
