package com.park.cloud.cms.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.RepParkOperateByMonthPOMapper;
import com.park.cloud.cms.service.RepParkOperateByMonthService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.RepParkOperateByMonthDto;
import com.park.cloud.common.domain.dto.cms.RepParkOperateDetailsDto;
import com.park.cloud.common.domain.dto.cms.RepRunStatisicsByMonthDto;
import com.park.cloud.common.domain.params.cms.RepParkOperateByMonthCountParams;
import com.park.cloud.common.domain.params.cms.RepParkOperateByMonthParams;
import com.park.cloud.common.domain.params.cms.RepPerkOperateDetailsParams;
import com.park.cloud.common.domain.params.cms.RepRunStatisticsByMonthParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
import com.park.cloud.common.domain.vo.order.CouponPurchaseExporVO;
import com.park.cloud.common.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassNameRepParkOperateByMonthServiceImpl
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/5 10:14
 **/
@Service
@Slf4j
public class RepParkOperateByMonthServiceImpl implements RepParkOperateByMonthService {

    @Autowired
    SysAreaAssService sysAreaAssService;
    @Autowired
    private RepParkOperateByMonthPOMapper repParkOperateByMonthPOMapper;

    @Override
    public CommonResult<RepParkOperateByMonthVO> dealStatistics(RepParkOperateByMonthCountParams params) {
        RepParkOperateByMonthDto dto = new RepParkOperateByMonthDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        RepParkOperateByMonthVO repParkOperateVO = new RepParkOperateByMonthVO();
        log.debug("====getRepBerthUse====:" + params);
        List<RepParkOperateByMonthVO> list = repParkOperateByMonthPOMapper.dealStatistics(dto);
        //停车次数
        Integer payNumCount = 0;
        //应收总金额
        Integer countReceivablePrice = 0;
        //实收总金额
        Integer countReceiptPrice = 0;
        //交易次数
        Integer countTradEnum = 0;
        //欠费次数
        Integer countArrearsNum = 0;
        //计算他们的所有数据
        for (int i = 0; i < list.size(); i++) {
            //得到交易次数的总和
            countTradEnum += list.get(i).getTradEnum();
            payNumCount += list.get(i).getPayNum();
            countReceivablePrice += list.get(i).getReceivablePrice();
            countReceiptPrice += list.get(i).getReceiptPrice();
            countArrearsNum += list.get(i).getArrearsNum();

        }
        repParkOperateVO.setArrearsNum(countArrearsNum);
        repParkOperateVO.setReceiptPrice(countReceiptPrice);
        repParkOperateVO.setReceivablePrice(countReceivablePrice);
        repParkOperateVO.setPayNum(payNumCount);
        repParkOperateVO.setTradEnum(countTradEnum);
        repParkOperateVO.setParkingCount(repParkOperateByMonthPOMapper.findCount());
        log.debug("查询结果：" + repParkOperateVO);
        return CommonResult.success(repParkOperateVO);

    }

    @Override
    public CommonResult<PageHelperVO<RepParkOperateByMonthPageVO>> getRepOperateByMonth(RepParkOperateByMonthParams params) {
        RepParkOperateByMonthDto dto = new RepParkOperateByMonthDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<RepParkOperateByMonthPageVO> list = repParkOperateByMonthPOMapper.findRepPark(dto);
        PageInfo<RepParkOperateByMonthPageVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepParkOperateByMonthPageVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }


    @Override
    public CommonResult<PageHelperVO<RepParkOperateDetailsVO>> detailsList(RepPerkOperateDetailsParams params) {
        RepParkOperateDetailsDto dto = new RepParkOperateDetailsDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<RepParkOperateDetailsVO> list = new ArrayList<>();
        //判断停车场类型
        if (params.getParkingType()==0) {
            //这是停车场id
            list.addAll(repParkOperateByMonthPOMapper.detailsList(dto));
        }
        if (params.getParkingType()==1) {
            //这是路段id
            list.addAll(repParkOperateByMonthPOMapper.detailsListBySertionId(dto));
        }
        PageInfo<RepParkOperateDetailsVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepParkOperateDetailsVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }


    @Override
    public CommonResult<PageHelperVO<RepRunStatisticsByMonthVO>> getRunStatisticsByMonth(RepRunStatisticsByMonthParams params) {
        RepRunStatisicsByMonthDto dto = new RepRunStatisicsByMonthDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<RepRunStatisticsByMonthVO> list = repParkOperateByMonthPOMapper.findRepRunStatics(dto);
        PageInfo<RepRunStatisticsByMonthVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepRunStatisticsByMonthVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }


    @Override
    public CommonResult<RepRunStatisticsTopVO> repRunStatistics(RepRunStatisticsByMonthParams params) {
        RepRunStatisicsByMonthDto dto = new RepRunStatisicsByMonthDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        RepRunStatisticsTopVO repRunStatisticsTopVO = new RepRunStatisticsTopVO();
        //交易次数
        Integer tradEnum = 0;
        //应收总金额
        Integer receivablePrice = 0;
        //实收总金额
        Integer receiptPrice = 0;
        //支付笔数
        Integer payNum = 0;
        //欠费笔数
        Integer arrearsNum = 0;
        List<RepRunStatisticsTopVO> list = repParkOperateByMonthPOMapper.findAllByDate(dto);
        for (int i = 0; i < list.size(); i++) {
            tradEnum += list.get(i).getTradEnum();
            receivablePrice += list.get(i).getReceivablePrice();
            receiptPrice += list.get(i).getReceiptPrice();
            payNum += list.get(i).getPayNum();
            arrearsNum += list.get(i).getArrearsNum();
        }
        repRunStatisticsTopVO.setTradEnum(tradEnum);
        repRunStatisticsTopVO.setReceivablePrice(receivablePrice);
        repRunStatisticsTopVO.setReceiptPrice(receiptPrice);
        repRunStatisticsTopVO.setPayNum(payNum);
        repRunStatisticsTopVO.setArrearsNum(arrearsNum);
        //获取支付率
        if (payNum==0||tradEnum==0){
            repRunStatisticsTopVO.setPayRatio(new BigDecimal(0));
        }else{
            BigDecimal decimal1 = new BigDecimal(payNum);
            BigDecimal decimal2 = new BigDecimal(tradEnum);
            repRunStatisticsTopVO.setPayRatio(decimal1.divide(decimal2, 2, RoundingMode.HALF_UP));

        }
        return CommonResult.success(repRunStatisticsTopVO);
    }

    @Override
    public CommonResult<List<RepRunBelowStatisticsVO>> repRunBelowStatistics(RepRunStatisticsByMonthParams params) {
        RepRunStatisicsByMonthDto dto = new RepRunStatisicsByMonthDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        List<RepRunBelowStatisticsVO> repRunBelowStatisticsVOList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String startTime=null;
        String endTime=null;
        if (params.getStatisticsStartDay()!=null&&!params.getStatisticsStartDay().equals("")
                &&params.getStatisticsStartDay()!=null&&!params.getStatisticsStartDay().equals("")){
            //开始时间
            startTime = params.getStatisticsStartDay();
            endTime = params.getStatisticsEndDay();
        }else{
            //没穿时间,就默认今年一月开始
            String format = sdf.format(new Date());
            startTime =format.substring(0,4)+"-01";
            endTime= format.substring(0, 7);
        }
         try {
            //判断两个时间相差几个月
            int month = DateUtil.getMonth(sdf.parse(startTime), sdf.parse(endTime));
            for (int q = 0; q <= month; q++) {
                dto.setStatisticsStartDay(startTime);
                List<RepRunBelowStatisticsVO> list = repParkOperateByMonthPOMapper.findAllByBelowDate(dto);
                //交易次数
                Integer tradEnum = 0;
                //停车次数
                Integer parkNum = 0;
                //支付次数
                Integer payNum = 0;
                //欠费次数
                Integer arrearsNum = 0;
                //应收总金额
                Integer receivablePrice = 0;
                //实收总金额
                Integer receiptPrice = 0;
                for (int i = 0; i < list.size(); i++) {
                    tradEnum += list.get(i).getTradEnum();
                    parkNum += list.get(i).getParkNum();
                    payNum += list.get(i).getPayNum();
                    arrearsNum += list.get(i).getArrearsNum();
                    receivablePrice += list.get(i).getReceivablePrice();
                    receiptPrice += list.get(i).getReceiptPrice();
                }
                RepRunBelowStatisticsVO repRunBelowStatisticsVO = new RepRunBelowStatisticsVO();
                repRunBelowStatisticsVO.setStatisticsDay(startTime);
                repRunBelowStatisticsVO.setTradEnum(tradEnum);
                repRunBelowStatisticsVO.setParkNum(parkNum);
                repRunBelowStatisticsVO.setPayNum(payNum);
                repRunBelowStatisticsVO.setArrearsNum(arrearsNum);
                repRunBelowStatisticsVO.setReceivablePrice(receivablePrice);
                repRunBelowStatisticsVO.setReceiptPrice(receiptPrice);
                //获取支付率
                if (payNum==0||tradEnum==0){
                    repRunBelowStatisticsVO.setPayRatio(new BigDecimal(0));
                }else{
                    BigDecimal decimal1 = new BigDecimal(payNum);
                    BigDecimal decimal2 = new BigDecimal(tradEnum);
                    repRunBelowStatisticsVO.setPayRatio(decimal1.divide(decimal2, 2, RoundingMode.HALF_UP));

                }
                startTime = sdf.format(DateUtil.dateAddMonths(sdf.parse(startTime), 1));
                repRunBelowStatisticsVOList.add(repRunBelowStatisticsVO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CommonResult.success(repRunBelowStatisticsVOList);

    }
}
