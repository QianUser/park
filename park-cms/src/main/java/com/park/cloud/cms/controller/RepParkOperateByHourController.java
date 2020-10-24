package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepParkOperateByHourService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.cms.*;
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
 * @ClassNameRepParkOperateByHourController
 * @Description 停车数据统计分析
 * @Author liangshuang
 * @Date 2020/3/11 13:46
 **/
@Api(value = "RepParkOperateByHourController", tags = {"停车数据统计分析接口"})
@RestController
@RequestMapping(value = "repParkOperateByHour")
@Validated
public class RepParkOperateByHourController {

    @Autowired
    private RepParkOperateByHourService repParkOperateByHourService;



    @PostMapping("repParkByHourStatistics")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<RepParkByHourStatisticsTopVO> repParkByHourStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkByHourTopParams params, BindingResult result) {
        return repParkOperateByHourService.repParkByHourStatistics(params);
    }
    @PostMapping("findAllRegion")
    @ApiOperation(value = "获取所有的行政区名称和id", notes = "获取所有的行政区名称和id")
    @ResponseBody
    public CommonResult<List<CantonIdSVO>> findAllRegion(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsBaseParams params, BindingResult result) {
        return repParkOperateByHourService.findAllRegion(params);
    }
    @PostMapping("findStatisticsByDay")
    @ApiOperation(value = "根据行政区的id获取数据", notes = "根据行政区的id获取数据")
    @ResponseBody
    public CommonResult<List<RepDataStatisticsByDayVO>> findStatisticsByDay(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepDataStatisticsParams params, BindingResult result) {
        return repParkOperateByHourService.findStatisticsByDay(params);
    }

    @PostMapping("findVehParkTime")
    @ApiOperation(value = "获取车辆停放时长", notes = "获取车辆停放时长")
    @ResponseBody
    public CommonResult<List<RepParkTimeVO>> findVehParkTime(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkByHourTopParams params, BindingResult result) {
        return repParkOperateByHourService.findVehParkTime(params);
    }

    @PostMapping("findEarningsCase")
    @ApiOperation(value = "获取收益情况", notes = "获取收益情况")
    @ResponseBody
    public CommonResult<List<FindEarningsCaseVO>> findEarningsCase(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepFindEarningsByTypeParams params, BindingResult result) {
        return repParkOperateByHourService.findEarningsCase(params);
    }

}
