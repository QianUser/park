package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.MebMerchantInfoService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MebMerchantVO;
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
 * 商户管理接口
 *
 * @author liyj
 * @create 2020/1/21
 * @since 1.0.0
 */
@Api(value = "MebMerchantInfoController", tags = {"商户管理接口"})
@RestController
@RequestMapping(value = "merchantInfo")
@Validated
public class MebMerchantInfoController {

    @Autowired
    MebMerchantInfoService merchantInfoService;

    @ApiOperation(value = "添加商户", notes = "添加商户接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid MebMerchantAddParams param, BindingResult result) {
        return merchantInfoService.add(param);
    }

    @ApiOperation(value = "更新商户", notes = "更新商户接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid MebMerchantUpdateParams param, BindingResult result) {
        return merchantInfoService.update(param);
    }

    @ApiOperation(value = "商户详情", notes = "商户详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<MebMerchantVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid MebMerchantDetailParams param, BindingResult result) {
        return merchantInfoService.detail(param);
    }

    @ApiOperation(value = "商户删除", notes = "商户删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid MebMerchantDeleteParams param, BindingResult result) {
        return merchantInfoService.delete(param);
    }

    @ApiOperation(value = "搜索商户", notes = "搜索商户接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<MebMerchantVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid MebMerchantSearchParams param, BindingResult result) {
        return merchantInfoService.search(param);
    }

    @ApiOperation(value = "商户列表", notes = "商户列表，用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<MebMerchantVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid MebMerchantSearchParams param, BindingResult result) {
        return merchantInfoService.list(param);
    }
}
