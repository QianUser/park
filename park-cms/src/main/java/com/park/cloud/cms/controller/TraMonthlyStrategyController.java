package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.TraMonthlyStrategyService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyDeleteParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyListParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraMonthlyStrategyVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

/**
 * @author liuhainan
 */
@Api(value = "包月策略", tags = {"包月策略接口"})
@RestController
@RequestMapping(value = "monthlyStrategy")
@Slf4j
@Validated
public class TraMonthlyStrategyController {

    @Autowired
    private TraMonthlyStrategyService strategyService;

    @ApiOperation(value = "创建包月策略", notes = "创建包月策略")
    @PostMapping("add")
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid TraMonthlyStrategyParams params){
        params.setAddUser(params.getLoginSysUserId());
        return  strategyService.add(params);
    }

    @ApiOperation(value = "修改包月策略", notes = "创建包月策略")
    @PostMapping("update")
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraMonthlyStrategyParams params){
        if(Objects.isNull(params.getMonthlyStrategyId())){
            return  CommonResult.failed("主键不能为空！");
        }
        return  strategyService.update(params);
    }

    @ApiOperation(value = "删除包月策略", notes = "删除包月策略")
    @PostMapping("delete")
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraMonthlyStrategyDeleteParams params){
        if(Objects.isNull(params.getId())){
            return  CommonResult.failed("主键不能为空！");
        }
        return  strategyService.delete(params);
    }

    @ApiOperation(value = "分页查询包月策略列表", notes = "分页查询包月策略列表")
    @PostMapping("list")
    public CommonResult<PageHelperVO<TraMonthlyStrategyVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraMonthlyStrategyListParams params){
        return  strategyService.list(params);
    }

    @ApiOperation(value = "查询所有包月策略列表", notes = "查询所有包月策略列表")
    @PostMapping("all")
    public CommonResult<List<TraMonthlyStrategyVO>> all(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)TraMonthlyStrategyListParams params){
        return  strategyService.all(params);
    }

    @ApiOperation(value = "根据id查询详细包月策略", notes = "根据id查询详细包月策略")
    @PostMapping("detaile")
    public CommonResult<TraMonthlyStrategyVO> detaile(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Validated IdParams params){
        return  strategyService.detaile(params);
    }

}