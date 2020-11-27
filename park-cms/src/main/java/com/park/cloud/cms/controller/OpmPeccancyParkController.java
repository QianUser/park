package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.OpmPeccancyParkService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.OpmPeccancyParkVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

/**
 * 违停车辆接口
 *
 * @author qianxiang
 * @date 2020/10/31
 * @since 1.0.0
 */
@Api(value = "PeccancyParkController", tags = {"违停车辆接口"})
@RestController
@RequestMapping(value = "opmPeccancyPark")
@Validated
public class OpmPeccancyParkController {

    @Autowired
    private OpmPeccancyParkService opmPeccancyParkService;

    @ApiOperation(value = "违停车辆添加", notes = "违停车辆添加接口")
    @RequestMapping(value = "add", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid OpmPeccancyParkAddParams param, BindingResult result) {
        return opmPeccancyParkService.add(param);
    }

    @ApiOperation(value = "违停车辆搜索", notes = "违停车辆搜索接口")
    @RequestMapping(value = "search", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<OpmPeccancyParkVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid OpmPeccancyParkSearchParams param, BindingResult result) {
        return opmPeccancyParkService.search(param);
    }

    @ApiOperation(value = "违停车辆删除", notes = "违停车辆删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid OpmPeccancyParkDeleteParams param, BindingResult result) {
        return opmPeccancyParkService.delete(param);
    }

    @ApiOperation(value = "违停现场照片上传", notes = "违停现场照片上传接口")
    @RequestMapping(value = "upload", method = RequestMethod.POST,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @LoginAuthIgnore
    public CommonResult upload(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) MultipartFile file) {
        return opmPeccancyParkService.upload(file);
    }

    @ApiOperation(value = "违停现场照片删除", notes = "违停现场照片删除接口")
    @RequestMapping(value = "cancelUpload", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult cancelUpload(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid OpmPeccancyParkCancelUploadParams param, BindingResult result) {
        return opmPeccancyParkService.deletePhoto(param);
    }

}
