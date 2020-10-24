package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.TraOrderChangeService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraOrderChangeListParams;
import com.park.cloud.common.domain.params.order.TraOrderChangeParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraOrderChangeVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author liuhainan
 */
@Api(value = "修改订单",tags = {"修改订单接口"})
@RequestMapping(value = "orderChange")
@Slf4j
@RestController
@Validated
public class TraOrderChangeController {

    @Autowired
    private TraOrderChangeService orderChangeService;

    @ApiOperation(value = "新增改单记录", notes = "新增改单记录")
    @RequestMapping(value = "add",method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<String> add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid TraOrderChangeParams params){
        return orderChangeService.add(params);
    }

    @PostMapping("list")
    @ApiOperation(value = "查询改单记录", notes = "查询改单记录")
    public CommonResult<PageHelperVO<TraOrderChangeVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraOrderChangeListParams params) {
        return orderChangeService.list(params);
    }


}
