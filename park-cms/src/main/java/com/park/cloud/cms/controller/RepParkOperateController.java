package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepParkOperateService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepBerthUseByDayParams;
import com.park.cloud.common.domain.params.cms.RepParkOperateCountParams;
import com.park.cloud.common.domain.params.cms.RepParkOperateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepBerthUseByDayVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperatePageVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperateVO;
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
 * @ClassNameRepParkOperateController
 * @Description 停车日报表
 * @Author liangshuang
 * @Date 2020/3/3 16:33
 **/
@Api(value = "RepParkOperateController", tags = {"停车日报表接口"})
@RestController
@RequestMapping(value = "repParkOperate")
@Validated
public class RepParkOperateController {
    @Autowired
    private RepParkOperateService repParkOperateService;


    @PostMapping("dealStatistics")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<RepParkOperateVO> dealStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkOperateCountParams params, BindingResult result) {
        return repParkOperateService.dealStatistics(params);
    }
    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepParkOperatePageVO>> getRepBerthUse(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepParkOperateParams params, BindingResult result) {
        return repParkOperateService.getRepBerthUse(params);
    }


}
