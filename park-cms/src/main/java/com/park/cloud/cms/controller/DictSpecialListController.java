package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictSpecialListService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.DictSpecialListAddParams;
import com.park.cloud.common.domain.params.cms.DictSpecialListDeleteParams;
import com.park.cloud.common.domain.params.cms.DictSpecialListSearchParams;
import com.park.cloud.common.domain.params.cms.DictSpecialListUpdateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictSpecialListVO;
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
 * 黑白名单管理接口
 *
 * @author liyj1
 * @create 2020/2/11
 * @since 1.0.0
 */
@Api(value = "DictSpecialListController", tags = {"黑白名单管理接口"})
@RestController
@RequestMapping(value = "dictSpecialList")
@Validated
public class DictSpecialListController {

    @Autowired
    DictSpecialListService dictSpecialListService;

    @ApiOperation(value = "添加黑白名单", notes = "添加黑白名单接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSpecialListAddParams param, BindingResult result) {
        return dictSpecialListService.add(param);
    }

    @ApiOperation(value = "更新黑白名单", notes = "更新黑白名单接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSpecialListUpdateParams param, BindingResult result) {
        return dictSpecialListService.update(param);
    }

    @ApiOperation(value = "黑白名单删除", notes = "黑白名单删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSpecialListDeleteParams param, BindingResult result) {
        return dictSpecialListService.delete(param);
    }

    @ApiOperation(value = "搜索黑白名单", notes = "搜索黑白名单接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictSpecialListVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSpecialListSearchParams param, BindingResult result) {
        return dictSpecialListService.search(param);
    }
}
