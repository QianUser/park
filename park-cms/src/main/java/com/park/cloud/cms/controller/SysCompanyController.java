package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysCompanyService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysCompanyListVO;
import com.park.cloud.common.domain.vo.cms.SysCompanyVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * 单位管理接口
 *
 * @author liyj
 * @create 2020/1/20
 * @since 1.0.0
 */
@Api(value = "SysCompanyController", tags = {"单位管理接口"})
@RestController
@RequestMapping(value = "sysCompany")
@Validated
public class SysCompanyController {

    @Autowired
    SysCompanyService companyService;

    @ApiOperation(value = "添加单位", notes = "添加单位接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysCompanyAddParams param, BindingResult result) {
        return companyService.add(param);
    }

    @ApiOperation(value = "更新单位", notes = "更新单位接口")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysCompanyUpdateParams param, BindingResult result) {
        return companyService.update(param);
    }

    @ApiOperation(value = "单位详情", notes = "单位详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysCompanyVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysCompanyDetailParams param, BindingResult result) {
        return companyService.detail(param);
    }

    @ApiOperation(value = "搜索单位", notes = "搜索单位接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysCompanyVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysCompanySearchParams param, BindingResult result) {
        return companyService.search(param);
    }

    @ApiOperation(value = "单位列表", notes = "单位列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysCompanyListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysCompanyListParams param, BindingResult result) {
        return companyService.list(param);
    }

}
