package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.TraRefundOrderService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.TraRefundOrderParams;
import com.park.cloud.common.domain.params.order.TraBargainOrderListParams;
import com.park.cloud.common.domain.params.order.TraRefundOrderPoParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.TraRefundOrderVO;
import com.park.cloud.common.domain.vo.order.RefundBargainOrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

/**
 * @author liuhainan
 */
@Api(value = "路外/内退费订单表",tags ={"路外/内退费订单"} )
@RequestMapping(value = "refundOrder")
@Slf4j
@Validated
@RestController
public class TraRefundOrderController {

    @Autowired
    private TraRefundOrderService refundOrderService;

    @PostMapping("list")
    @ApiOperation(value = "获取退费订单列表", notes = "获取退费订单列表")
    public CommonResult<PageHelperVO<TraRefundOrderVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraRefundOrderParams params){
        return  refundOrderService.list(params);
    }

    @ApiOperation(value = "新增退费", notes = "新增退费")
    @RequestMapping(value = "add",method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<String> add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid TraRefundOrderPoParams params, BindingResult result){
        return refundOrderService.add(params);
    }

    @ApiOperation(value = "再次退费", notes = "再次退费")
    @RequestMapping(value = "refundAgain",method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<String> refundAgain(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid IdParams params, BindingResult result){
        if(Objects.isNull(params.getId())){
            return CommonResult.failed("退费单号不能为空！");
        }
        return refundOrderService.refundAgain(params);
    }

    @ApiOperation(value = "修改退费订单", notes = "修改退费订单")
    @RequestMapping(value = "update",method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<String> update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)TraRefundOrderPoParams params){
        return refundOrderService.update(params);
    }

    @PostMapping("insideList")
    @ApiOperation(value = "获取路内退费订单列表", notes = "获取路内退费订单列表")
    public CommonResult<PageHelperVO<RefundBargainOrderVO>> insideList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params){
        return  refundOrderService.insideOrderlist(params);
    }

    @PostMapping("outsideList")
    @ApiOperation(value = "查询路外接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RefundBargainOrderVO>> outsideList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params) {
        return refundOrderService.outsideOrderlist(params);
    }

}
