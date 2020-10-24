package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysDepartmentService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysDepartmentListVO;
import com.park.cloud.common.domain.vo.cms.SysDepartmentVO;
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
 * 部门接口
 *
 * @author liyj
 * @create 2020/1/20
 * @since 1.0.0
 */
@Api(value = "SysDepartmentController", tags = {"部门接口"})
@RestController
@RequestMapping(value = "sysDept")
@Validated
public class SysDepartmentController {

    @Autowired
    SysDepartmentService departmentService;

    @ApiOperation(value = "添加部门", notes = "添加部门接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysDepartmentAddParams param, BindingResult result) {
        return departmentService.add(param);
    }

    @ApiOperation(value = "更新部门", notes = "更新部门接口")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysDepartmentUpdateParams param, BindingResult result) {
        return departmentService.update(param);
    }

    @ApiOperation(value = "部门详情", notes = "部门详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysDepartmentVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysDepartmentDetailParams param, BindingResult result) {
        return departmentService.detail(param);
    }

    @ApiOperation(value = "部门删除", notes = "部门删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysDepartmentDeleteParams param, BindingResult result) {
        return departmentService.delete(param);
    }

    @ApiOperation(value = "搜索部门", notes = "搜索部门接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysDepartmentVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysDepartmentSearchParams param, BindingResult result) {
        return departmentService.search(param);
    }

    @ApiOperation(value = "部门列表", notes = "部门列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysDepartmentListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysDepartmentListParams param, BindingResult result) {
        return departmentService.list(param);
    }

}
