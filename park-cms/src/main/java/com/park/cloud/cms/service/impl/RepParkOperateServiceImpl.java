package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.RepParkOperatePOMapper;
import com.park.cloud.cms.service.RepParkOperateService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.RepParkOperateDto;
import com.park.cloud.common.domain.dto.cms.RepParkOperatePageDto;
import com.park.cloud.common.domain.params.cms.RepParkOperateCountParams;
import com.park.cloud.common.domain.params.cms.RepParkOperateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperatePageVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperateVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNameRepParkOperateServiceImpl
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/3 16:42
 **/
@Service
@Slf4j
public class RepParkOperateServiceImpl implements RepParkOperateService {
    @Autowired
    SysAreaAssService sysAreaAssService;
    @Autowired
    private RepParkOperatePOMapper repParkOperatePOMapper;


    @Override
    public CommonResult<RepParkOperateVO> dealStatistics(RepParkOperateCountParams params) {

        RepParkOperateDto dto = new RepParkOperateDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        RepParkOperateVO repParkOperateVO = new RepParkOperateVO();
        log.debug("====getRepBerthUse====:" + params);
        List<RepParkOperateVO> list = repParkOperatePOMapper.dealStatistics(dto);
        if (CollectionUtils.isEmpty(list)) {
            return CommonResult.success(repParkOperateVO);
        }
        //总次数
        Integer total = 0;
        //支付笔数
        Integer payCount = 0;
        //应收总金额
        Integer countReceivablePrice = 0;
        //实收总金额
        Integer countReceiptPrice = 0;
        //欠费笔数
        Integer countArrearsNum = 0;
        //计算他们的所有数据
        for (int i = 0; i < list.size(); i++) {
            //得到交易次数的总和
            total += list.get(i).getTradeNum();
            payCount += list.get(i).getPayNum();
            countReceivablePrice += list.get(i).getReceivablePrice();
            countReceiptPrice += list.get(i).getReceiptPrice().intValue();
            countArrearsNum += list.get(i).getArrearsNum();

        }
        repParkOperateVO.setArrearsNum(countArrearsNum);
        repParkOperateVO.setReceiptPrice(new BigDecimal(String.valueOf(countReceiptPrice / 100d)));
        repParkOperateVO.setReceivablePrice(countReceivablePrice);
        repParkOperateVO.setPayNum(payCount);
        repParkOperateVO.setTradeNum(total);
        BigDecimal decimal1 = new BigDecimal(payCount);
        BigDecimal decimal2 = new BigDecimal(total);
        BigDecimal decimal = BigDecimal.ZERO;
        if (BigDecimal.ZERO.compareTo(decimal2) < 0) {
            decimal = decimal1.divide(decimal2, 2, RoundingMode.HALF_UP);
        }
        repParkOperateVO.setPayRatio(decimal);
        log.debug("查询结果：" + repParkOperateVO);
        return CommonResult.success(repParkOperateVO);
    }

    @Override
    public CommonResult<PageHelperVO<RepParkOperatePageVO>> getRepBerthUse(RepParkOperateParams params) {
        RepParkOperatePageDto dto = new RepParkOperatePageDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<RepParkOperatePageVO> list = new ArrayList<>();        //先判断前端传过来的类型.
        if (params.getType() == null || params.getType().equals("")) {
            //如果是全部
            list.addAll(repParkOperatePOMapper.findAll(dto));
            //如果是场外,就只查询路段的
        } else if (params.getType() == 0) {
            list.addAll(repParkOperatePOMapper.findAllBySection(dto));
        } else {
            //如果是停车场,就只查询停车场的
            list.addAll(repParkOperatePOMapper.findAllByParking(dto));
        }
        PageInfo<RepParkOperatePageVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepParkOperatePageVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }
}
