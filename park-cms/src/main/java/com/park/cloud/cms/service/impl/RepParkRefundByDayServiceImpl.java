package com.park.cloud.cms.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.RepParkRefundByDayPOMapper;
import com.park.cloud.cms.service.RepParkRefundByDayService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.RepParkCountRefundDto;
import com.park.cloud.common.domain.dto.cms.RepParkRefundByDayDto;
import com.park.cloud.common.domain.params.cms.RepParkCountRefundParams;
import com.park.cloud.common.domain.params.cms.RepParkRefundByDayParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepParkCountRefundVO;
import com.park.cloud.common.domain.vo.cms.RepParkRefundByDayVO;
import com.park.cloud.common.domain.vo.cms.RepParkingAndRefundVO;
import com.park.cloud.common.domain.vo.order.CouponPurchaseExporVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNameRepParkRefundByDayServiceImpl
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 14:33
 **/
@Service
@Slf4j
public class RepParkRefundByDayServiceImpl  implements RepParkRefundByDayService {
    @Autowired
    SysAreaAssService sysAreaAssService;
    @Autowired
    private RepParkRefundByDayPOMapper repParkRefundByDayPOMapper;

    @Override
    public CommonResult<PageHelperVO<RepParkRefundByDayVO>> getRepParkRefund(RepParkRefundByDayParams params) {
        RepParkRefundByDayDto dto = new RepParkRefundByDayDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);

        log.debug("====getRepBerthUse====:" + params);
        //设置分页查询
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<RepParkRefundByDayVO> list = repParkRefundByDayPOMapper.getRepParkRefund(dto);
        PageInfo<RepParkRefundByDayVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepParkRefundByDayVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }


    @Override
    public CommonResult<RepParkCountRefundVO> dealStatistics(RepParkCountRefundParams params) {
        RepParkCountRefundDto dto = new RepParkCountRefundDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        //先获取退费总金额
      Integer count =   repParkRefundByDayPOMapper.findMoneyCount(dto);
         //再获取退费次数
        Integer refundCount=  repParkRefundByDayPOMapper.getRefundCount(dto);
        //再获取停车场和退费金额的集合
     List<RepParkingAndRefundVO>list =   repParkRefundByDayPOMapper.getRefundAndPakring(dto);
        RepParkCountRefundVO  repParkCountRefundVO = new RepParkCountRefundVO();
       repParkCountRefundVO.setRefundPrice(count);
        repParkCountRefundVO.setRefundNum(refundCount);
        repParkCountRefundVO.setRepList(list);
        log.debug("查询结果：" + repParkCountRefundVO);
        return CommonResult.success(repParkCountRefundVO);
    }
}
