package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysPdaUserTeamService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamBerthVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


/**
 * 中队管理相关接口
 *
 * @author zyj
 * @date 2020/2/25
 */
@Api(value = "SysPdaUserTeamController", tags = {"中队管理相关接口"})
@RestController
@RequestMapping(value = "sysPdaUserTeam")
@Validated
public class SysPdaUserTeamController {

    @Autowired
    SysPdaUserTeamService sysPdaUserTeamService;

    @ApiOperation(value = "中队列表", notes = "中队列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysPdaUserTeamListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserTeamListParams param) {
        return sysPdaUserTeamService.list(param);
    }

    @ApiOperation(value = "中队查询", notes = "中队查询接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysPdaUserTeamVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserTeamSearchParams param) {
        return sysPdaUserTeamService.search(param);
    }

    @ApiOperation(value = "添加中队", notes = "添加中队接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserTeamAddParams param) {
        return sysPdaUserTeamService.add(param);
    }

    @ApiOperation(value = "更新中队", notes = "更新中队接口")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserTeamUpdateParams param) {
        return sysPdaUserTeamService.update(param);
    }

    @ApiOperation(value = "中队详情", notes = "中队详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysPdaUserTeamVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserTeamDetailParams param) {
        return sysPdaUserTeamService.detail(param);
    }

    @ApiOperation(value = "删除中队", notes = "删除中队接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserTeamDeleteParams param) {
        return sysPdaUserTeamService.delete(param);
    }

    @ApiOperation(value = "管辖泊位", notes = "获取中队管辖泊位")
    @RequestMapping(value = "getBerth", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysPdaUserTeamBerthVO>> getBerth(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserTeamBerthParams param) {
        return sysPdaUserTeamService.getBerth(param);
    }

    @ApiOperation(value = "选择中队管辖泊位", notes = "选择中队管辖泊位")
    @RequestMapping(value = "setBerth", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult setBerth(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserTeamBerthParams param) {
        return sysPdaUserTeamService.setBerth(param);
    }
}
