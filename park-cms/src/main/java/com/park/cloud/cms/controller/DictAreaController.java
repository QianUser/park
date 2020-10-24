package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictAreaService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictAreaListVO;
import com.park.cloud.common.domain.vo.cms.DictAreaVO;
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
 * 片区管理接口
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
@Api(value = "DictAreaController", tags = {"片区管理接口"})
@RestController
@RequestMapping(value = "dictArea")
@Validated
public class DictAreaController {

    @Autowired
    DictAreaService dictAreaService;

    @ApiOperation(value = "添加片区", notes = "添加片区接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictAreaAddParams param, BindingResult result) {
        return dictAreaService.add(param);
    }

    @ApiOperation(value = "更新片区", notes = "更新片区接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictAreaUpdateParams param, BindingResult result) {
        return dictAreaService.update(param);
    }

    @ApiOperation(value = "片区详情", notes = "片区详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<DictAreaVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictAreaDetailParams param, BindingResult result) {
        return dictAreaService.detail(param);
    }

    @ApiOperation(value = "片区删除", notes = "片区删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictAreaDeleteParams param, BindingResult result) {
        return dictAreaService.delete(param);
    }

    @ApiOperation(value = "搜索片区", notes = "搜索片区接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictAreaVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictAreaSearchParams param, BindingResult result) {
        return dictAreaService.search(param);
    }

    @ApiOperation(value = "片区列表", notes = "片区列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictAreaListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictAreaListParams param, BindingResult result) {
        return dictAreaService.list(param);
    }
}
