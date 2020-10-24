package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysExportService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import com.park.cloud.common.domain.params.cms.SysExportParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysExportVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 导出记录相关接口
 *
 * @author zyj
 */
@Api(value = "SysExportController", tags = {"导出记录相关接口"})
@RestController
@RequestMapping(value = "sysExport")
@Validated
public class SysExportController {

    @Autowired
    private SysExportService sysExportService;

    @ApiOperation(value = "导出记录列表", notes = "导出记录列表接口")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysExportVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsPageHelperParams param) {
        return sysExportService.list(param);
    }

    @ApiOperation(value = "导出记录下载", notes = "导出记录下载接口")
    @RequestMapping(value = "download", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> download(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysExportParams param, @RequestHeader("user-agent")
            String userAgent) {
        return sysExportService.download(param, userAgent);
    }

    @ApiOperation(value = "导出记录删除", notes = "导出记录删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysExportParams param) {
        return sysExportService.delete(param);
    }

    @ApiOperation(value = "导出记录批量下载", notes = "导出记录批量下载接口")
    @RequestMapping(value = "downloadBatch", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> downloadBatch(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysExportParams param, @RequestHeader("user-agent")
            String userAgent) {
        return sysExportService.downloadBatch(param, userAgent);
    }

    @ApiOperation(value = "导出记录批量删除", notes = "导出记录批量删除接口")
    @RequestMapping(value = "deleteBatch", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult deleteBatch(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysExportParams param) {
        return sysExportService.deleteBatch(param);
    }
}
