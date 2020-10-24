package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictBerthCityService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.DictBerthCityAddParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityDetailParams;
import com.park.cloud.common.domain.params.cms.DictBerthCitySearchParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityUpdateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictBerthCityVO;
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

/**
 * 泊位设置接口
 *
 * @author liyj
 * @create 2020/1/22
 * @since 1.0.0
 */
@Api(value = "DictBerthCityController", tags = {"泊位设置接口"})
@RestController
@RequestMapping(value = "dictBerth")
@Validated
public class DictBerthCityController {

    @Autowired
    DictBerthCityService dictBerthCityService;

    @ApiOperation(value = "添加泊位", notes = "添加泊位接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictBerthCityAddParams param, BindingResult result) {
        return dictBerthCityService.add(param);
    }

    @ApiOperation(value = "更新泊位", notes = "更新泊位接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictBerthCityUpdateParams param, BindingResult result) {
        return dictBerthCityService.update(param);
    }

    @ApiOperation(value = "泊位详情", notes = "泊位详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<DictBerthCityVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictBerthCityDetailParams param, BindingResult result) {
        return dictBerthCityService.detail(param);
    }

    @ApiOperation(value = "搜索泊位", notes = "搜索泊位接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictBerthCityVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictBerthCitySearchParams param, BindingResult result) {
        return dictBerthCityService.search(param);
    }

}
