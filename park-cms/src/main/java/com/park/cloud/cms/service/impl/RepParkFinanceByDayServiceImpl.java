package com.park.cloud.cms.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.RepParkFinanceByDayPOMapper;
import com.park.cloud.cms.service.RepParkFinanceByDayService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.RepFindParkDto;
import com.park.cloud.common.domain.dto.cms.RepParkFinanceByDayCountDto;
import com.park.cloud.common.domain.dto.cms.RepParkFinanceDetailsDto;
import com.park.cloud.common.domain.params.cms.RepParkFinanceByDayCountParams;
import com.park.cloud.common.domain.params.cms.RepParkFinanceByDayParams;
import com.park.cloud.common.domain.params.cms.RepParkFinanceDetailsParams;
import com.park.cloud.common.domain.po.rep.RepParkFinanceByDayPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
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
 * @ClassNameRepParkFinanceByDayServiceImpl
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/7 10:34
 **/
@Service
@Slf4j
public class RepParkFinanceByDayServiceImpl implements RepParkFinanceByDayService {
    @Autowired
    SysAreaAssService sysAreaAssService;
    @Autowired
    private RepParkFinanceByDayPOMapper repParkFinanceByDayPOMapper;
    @Override
    public CommonResult<RepParkFinanceByDayCountVO> dealStatistics(RepParkFinanceByDayCountParams params) {


        RepParkFinanceByDayCountDto dto = new RepParkFinanceByDayCountDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        //先获取停车总金额
        Integer count =   repParkFinanceByDayPOMapper.findMoneyCount(dto);
        //再获取停车收入笔数
        Integer payNum=  repParkFinanceByDayPOMapper.getPayNum(dto);
        //再获取停车场和收入笔数的集合
        List<RepParkFinanceAndParkingVO>list =   repParkFinanceByDayPOMapper.getFinanceAndPakring(dto);
        RepParkFinanceByDayCountVO repParkFinanceByDayCountVO = new RepParkFinanceByDayCountVO();
        repParkFinanceByDayCountVO.setPayNum(payNum);
        repParkFinanceByDayCountVO.setReceiptPrice(count);
        repParkFinanceByDayCountVO.setRepList(list);
        log.debug("查询结果：" + repParkFinanceByDayCountVO);
        return CommonResult.success(repParkFinanceByDayCountVO);
    }

    @Override
    public CommonResult<PageHelperVO<RepParkFinanceByDayPageVO>> getRepParkFinance(RepParkFinanceByDayParams params) {
        RepParkFinanceByDayCountDto dto = new RepParkFinanceByDayCountDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<RepParkFinanceByDayPageVO>list =  repParkFinanceByDayPOMapper.findAllByParams(dto);
        PageInfo<RepParkFinanceByDayPageVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepParkFinanceByDayPageVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }

    @Override
    public CommonResult<PageHelperVO<RepParkFinanceDetailsVO>> detailsList(RepParkFinanceDetailsParams params) {
        List<RepParkFinanceDetailsVO>list = detailsAllList(params,true).getData();
        PageInfo<RepParkFinanceDetailsVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepParkFinanceDetailsVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);

    }

    @Override
    public CommonResult<List<RepParkFinanceDetailsVO>> detailsAllList(RepParkFinanceDetailsParams params,Boolean pageFlag) {
        RepParkFinanceDetailsDto dto = new RepParkFinanceDetailsDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        List<RepParkFinanceDetailsVO>list= new ArrayList<>();
        //根据统计表的id查询出数据
        RepParkFinanceByDayPO repParkFinanceByDayPO = repParkFinanceByDayPOMapper.selectByPrimaryKey(dto.getFinanceId());
        repParkFinanceByDayPO.setStatisticsDay(params.getStatisticsDay());
        if (params.getPayType()!=null){
            repParkFinanceByDayPO.setPayType(params.getPayType());
        }
        //判断是路外还是路内(路段)
        if (repParkFinanceByDayPO.getParkingType()==1){
            //则是路内(路段)
            if(pageFlag){
                PageHelper.startPage(params.getPageNum(), params.getPageSize());
            }
            list =  repParkFinanceByDayPOMapper.detailsList(repParkFinanceByDayPO);
        }else{

            //根据停车场id去查询停车场表
            RepFindParkDto parkDto= repParkFinanceByDayPOMapper.getParkType(repParkFinanceByDayPO.getParkingSectionId());
            parkDto.setStatisticsDay(repParkFinanceByDayPO.getStatisticsDay());
            if (params.getPayType()!=null){
                parkDto.setPayType(params.getPayType());
            }
            //判断是否是路内停车场还是路外停车场
            if (parkDto.getParkType()==1){
                if(pageFlag){
                    PageHelper.startPage(params.getPageNum(), params.getPageSize());
                }
                list =  repParkFinanceByDayPOMapper.ParkDetailsList(repParkFinanceByDayPO);
            }else{
                if(pageFlag){
                    PageHelper.startPage(params.getPageNum(), params.getPageSize());
                }
                list =  repParkFinanceByDayPOMapper.ParkReadDetailsList(parkDto);
            }

        }
//        PageInfo<RepParkFinanceDetailsVO> pageInfo = new PageInfo<>(list);
//        PageHelperVO<RepParkFinanceDetailsVO> pageHelperResponse = new PageHelperVO<>();
//        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
//        log.debug("查询结果：" + pageHelperResponse);
        if(list ==null){
            list = new ArrayList<RepParkFinanceDetailsVO>();
        }
        return CommonResult.success(list);

    }


    @Override
    public CommonResult<RepParkFinanceSummarizeVO> dealSummarize(RepParkFinanceByDayCountParams params) {
        RepParkFinanceByDayCountDto dto = new RepParkFinanceByDayCountDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        //先获取停车总金额
        Integer count =   repParkFinanceByDayPOMapper.findMoneyCount(dto);
        //再获取停车收入笔数
        Integer payNum=  repParkFinanceByDayPOMapper.getPayNum(dto);
        //再获取支付方式和收入金额
        List<RepParkFinanceAndPayTypeVO>list =   repParkFinanceByDayPOMapper.getDealSummarize(dto);
        RepParkFinanceSummarizeVO repParkFinanceSummarizeVO = new RepParkFinanceSummarizeVO();
        repParkFinanceSummarizeVO.setPayNum(payNum);
        repParkFinanceSummarizeVO.setReceiptPrice(count);
        repParkFinanceSummarizeVO.setRepList(list);
        log.debug("查询结果：" + repParkFinanceSummarizeVO);
        return CommonResult.success(repParkFinanceSummarizeVO);
    }
}
