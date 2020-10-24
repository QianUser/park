package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.OrderService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysAreaAssCacheVO;
import com.park.cloud.common.domain.vo.order.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author liuhainan
 */
@Api(value = "订单", tags = {"订单接口"})
@RestController
@RequestMapping(value = "order")
@Slf4j
public class TraOrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private SysAreaAssService areaAssService;

    @PostMapping("insideList")
    @ApiOperation(value = "查询路内接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<BargainOrderVO>> insideList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params) {
        return orderService.insideList(params);
    }

    @PostMapping("outsideList")
    @ApiOperation(value = "查询路外接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<BargainOrderVO>> outsideList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params) {
        return orderService.outsideList(params);
    }

    @PostMapping("changeOrder")
    @ApiOperation(value = "改单接口", notes = "改单接口")
    public CommonResult<ChangeOrderVO> changeOrder(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)TraBargainOrderChangeParams params) {
        return orderService.changeOrder(params);
    }

    @ApiOperation(value = "计算金额接口", notes = "计算金额")
    @RequestMapping(value = "calculate",method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<TraBargainOrderVO> calculate(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid TraBargainOrderCaculateParams params){
        return orderService.caculate(params);
    }

    @PostMapping("stopPark")
    @ApiOperation(value = "停车结束接口(路内路外专用)", notes = "停车结束接口(路内路外专用)")
    public CommonResult stopPark(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) StopParkParams params) {
        return orderService.stopPark(params);
    }

    @PostMapping("list")
    @ApiOperation(value = "查询所有订单(用户申请发票专用)", notes = "查询所有订单(用户申请发票专用)")
    public CommonResult<PageHelperVO<BargainOrderVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params) {
        return orderService.list(params);
    }

    @PostMapping("unpayList")
    @ApiOperation(value = "查询欠费订单列表接口(调用查询路内定单接口（cms模块用）)", notes = "分页列表查询")
    public CommonResult<PageHelperVO<BargainOrderVO>> unpayList(@Valid @RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params) {
        SysAreaAssCacheVO areaAss = areaAssService.getUserAreaAss(params.getLoginSysUserId());
        if(Objects.nonNull(areaAss) && Objects.nonNull(areaAss.getAreaAssType())){
            Integer areaAssType = areaAss.getAreaAssType();
            String[] areas = null;
            List<Integer> lsit =new ArrayList();
            if(areaAssType==0){
                params.setAreaAssType(areaAssType);
            }else if(areaAssType==1 && StringUtils.isNotEmpty(areaAss.getCityIds())){
                areas = areaAss.getCityIds().split(",");
                for (String area : areas) {
                    lsit.add(Integer.valueOf(area));
                }
                params.setAreaIds(lsit);
            }else if(areaAssType==2 && StringUtils.isNotEmpty(areaAss.getCantonIds())){
                areas = areaAss.getCantonIds().split(",");
                for (String area : areas) {
                    lsit.add(Integer.valueOf(area));
                }
                params.setAreaIds(lsit);
            }else if(areaAssType==3 && StringUtils.isNotEmpty(areaAss.getAreaIds())){
                areas = areaAss.getAreaIds().split(",");
                for (String area : areas) {
                    lsit.add(Integer.valueOf(area));
                }
                params.setAreaIds(lsit);
            }
        }else {
            return CommonResult.failed("用户辖区信息为空！");
        }

        return orderService.insideList(params);
    }

    @ApiOperation(value = "订单详情", notes = "订单详情接口")
    @RequestMapping(value = "detail",method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<BargainOrderDetailVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid TraBargainOrderDetailParams params){
        return orderService.orderDetail(params);
    }

    @PostMapping("confirmChange")
    @ApiOperation(value = "确认改单接口", notes = "确认改单接口")
    public CommonResult confirmChange(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)TraBargainOrderChangeParams params) {
        return orderService.confirmChange(params);
    }

    @PostMapping("insideRefundList")
    @ApiOperation(value = "查询路内外退费列表接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<BargainOrderVO>> insideRefundList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params) {
        return orderService.insideRefundList(params);
    }

    @PostMapping("outsideRefundList")
    @ApiOperation(value = "查询路外退费列表接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<BargainOrderVO>> outsideRefundList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params) {
        return orderService.outsideRefundList(params);
    }

    @PostMapping("orderPaymentList")
    @ApiOperation(value = "根据订单号查询支付订单", notes = "分页列表查询")
    public CommonResult<List<OrderPaymentVO>> orderPaymentList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Validated OrderPaymentParams  params) {
        return orderService.orderPaymentList(params);
    }

}
