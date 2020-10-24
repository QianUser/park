package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictCityService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCityListVO;
import com.park.cloud.common.domain.vo.cms.DictCityVO;
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
 * 城市管理接口
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
@Api(value = "DictCityController", tags = {"城市管理接口"})
@RestController
@RequestMapping(value = "dictCity")
@Validated
public class DictCityController {

    @Autowired
    DictCityService dictCityService;

    @ApiOperation(value = "添加城市", notes = "添加城市接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCityAddParams param, BindingResult result) {
        return dictCityService.add(param);
    }

    @ApiOperation(value = "更新城市", notes = "更新城市接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCityUpdateParams param, BindingResult result) {
        return dictCityService.update(param);
    }

    @ApiOperation(value = "城市详情", notes = "城市详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<DictCityVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCityDetailParams param, BindingResult result) {
        return dictCityService.detail(param);
    }

    @ApiOperation(value = "城市删除", notes = "城市删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCityDeleteParams param, BindingResult result) {
        return dictCityService.delete(param);
    }

    @ApiOperation(value = "搜索城市", notes = "搜索城市接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictCityVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCitySearchParams param, BindingResult result) {
        return dictCityService.search(param);
    }

    @ApiOperation(value = "城市列表", notes = "城市列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictCityListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCityListParams param, BindingResult result) {
        return dictCityService.list(param);
    }

}
