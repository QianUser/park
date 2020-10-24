package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepBerthUseByDayService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepBerthUseByDayParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepBerthUseByDayVO;
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
 * @ClassNameRepBerthUseByDayController
 * @Description 路边停车收费率报表
 * @Author liangshuang
 * @Date 2020/2/24 14:19
 **/
@Api(value = "RepBerthUseByDayController", tags = {"路边停车收费率报表接口"})
@RestController
@RequestMapping(value = "repBerthUseByDay")
@Validated
public class RepBerthUseByDayController {
    @Autowired
    private RepBerthUseByDayService repBerthUseByDayService;


    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepBerthUseByDayVO>> getRepBerthUse(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepBerthUseByDayParams params, BindingResult result) {
        return repBerthUseByDayService.getRepBerthUse(params);
    }




}
