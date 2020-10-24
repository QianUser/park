package com.park.cloud.cms.service.impl;

import com.park.cloud.cms.mapper.RepParkOperatePOMapper;
import com.park.cloud.cms.service.RepRoadStatisticsService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.FindCantonDto;
import com.park.cloud.common.domain.dto.cms.RepRoadStatisticsDto;
import com.park.cloud.common.domain.params.cms.RepRoadStatisticsParams;
import com.park.cloud.common.domain.po.dict.DictSectionPO;
import com.park.cloud.common.domain.vo.cms.RepRoadStatisticsBelowVO;
import com.park.cloud.common.domain.vo.cms.RepRoadStatisticsTopVO;
import com.park.cloud.common.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassNameRepRoadStatisticsServiceImpl
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/10 10:52
 **/
@Service
@Slf4j
public class RepRoadStatisticsServiceImpl implements RepRoadStatisticsService {
    @Autowired
    SysAreaAssService sysAreaAssService;
    @Autowired
    private RepParkOperatePOMapper repParkOperatePOMapper;

    @Override
    public CommonResult<RepRoadStatisticsTopVO> dealStatistics(RepRoadStatisticsParams params) {
        RepRoadStatisticsDto dto = new RepRoadStatisticsDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        FindCantonDto fDto  =new FindCantonDto();
          BeanUtils.copyProperties(dto,fDto);
        //先获取所有的路内id
        List<DictSectionPO> list = repParkOperatePOMapper.findAllSection(fDto);
        RepRoadStatisticsTopVO repRoadStatisticsTopVO = new RepRoadStatisticsTopVO();
        //先获取总订单数
        Integer orderCount = 0;
        //再获取已完成订单数
        Integer finishCount = 0;
        //获取欠费订单数
        Integer arrearageCount = 0;
        //获取补缴订单数
        Integer paymentCount = 0;
        //获取总收益
        Integer earingsCount = 0;
        //先获取泊位数
        Integer berthCount = 0;
        //自助缴费个数
        Integer selfHelp = 0;
        //PDA付费个数
        Integer PDAPay = 0;
        for (int i = 0; i < list.size(); i++) {
            dto.setSectionId(list.get(i).getSectionId());
            //根据路段id获取每个路段的总订单数
            orderCount += repParkOperatePOMapper.findOrderCount(dto);
            //根据路段id获取每个路段的已完成订单数
            finishCount += repParkOperatePOMapper.findFinishOrderCount(dto);
            //根据路段id获取每个路段的欠费订单数
            arrearageCount += repParkOperatePOMapper.findArrearageOrderCount(dto);
            //根据路段id获取每个路段的补缴订单数
            paymentCount += repParkOperatePOMapper.findPaymentOrderCount(dto);
            //根据路段id获取每个路段的总收益
            earingsCount += repParkOperatePOMapper.findEarningsCount(dto);
            //根据路段id获取每个路段的取泊位数
            berthCount += repParkOperatePOMapper.findBerthCount(dto);
            //根据路段id获取每个路段的自助缴费个数
            selfHelp += repParkOperatePOMapper.findSelfHelpPay(dto);
            //根据路段id获取每个路段的PDA付费个数
            PDAPay += repParkOperatePOMapper.findPDAPay(dto);
        }
        repRoadStatisticsTopVO.setOrderCount(orderCount);
        repRoadStatisticsTopVO.setFinishCount(finishCount);
        repRoadStatisticsTopVO.setArrearageCount(arrearageCount);
        repRoadStatisticsTopVO.setPaymentCount(paymentCount);
        repRoadStatisticsTopVO.setEaringsCount(earingsCount);
        //获取泊位日均收益
        if (earingsCount!=0){
            BigDecimal decimal9 = new BigDecimal(berthCount);
            BigDecimal decimal10 = new BigDecimal(earingsCount);
            repRoadStatisticsTopVO.setBerthRatio(decimal9.divide(decimal10, 2, RoundingMode.HALF_UP));

        }else{
            repRoadStatisticsTopVO.setBerthRatio(new BigDecimal(0.00));
        }
      //获取支付率

        if (finishCount!=0 || orderCount!=0){
            BigDecimal decimal1 = new BigDecimal(finishCount);
            BigDecimal decimal2 = new BigDecimal(orderCount);
            repRoadStatisticsTopVO.setPayRatio(decimal1.divide(decimal2, 2, RoundingMode.HALF_UP));
        }else{
            repRoadStatisticsTopVO.setPayRatio(new BigDecimal(0.00));
        }

        //自助缴费比例
        if (selfHelp!=0 || finishCount!=0){
            BigDecimal decimal3 = new BigDecimal(selfHelp);
            BigDecimal decimal4 = new BigDecimal(finishCount);
            repRoadStatisticsTopVO.setSelfPayRatio(decimal3.divide(decimal4, 2, RoundingMode.HALF_UP));
        }else{
            repRoadStatisticsTopVO.setSelfPayRatio(new BigDecimal(0.00));
        }
       //PDA付费比例
        if (PDAPay!=0 || finishCount!=0){
            BigDecimal decimal6 = new BigDecimal(PDAPay);
            BigDecimal decimal7 = new BigDecimal(finishCount);
            repRoadStatisticsTopVO.setPdaPayRatio(decimal6.divide(decimal7, 2, RoundingMode.HALF_UP));
        }else{
            repRoadStatisticsTopVO.setPdaPayRatio(new BigDecimal(0.00));
        }
   return CommonResult.success(repRoadStatisticsTopVO);
    }

    @Override
    public CommonResult<List<RepRoadStatisticsBelowVO>> roadStatisticsBelow(RepRoadStatisticsParams params) {
        List<RepRoadStatisticsBelowVO> repRoadList= new ArrayList<>();
        RepRoadStatisticsDto dto = new RepRoadStatisticsDto();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if (params.getStatisticsStartDay() == null || params.getStatisticsStartDay().equals("")) {
                Date date = DateUtil.dateAdd(new Date(), -1, false);
                params.setStatisticsStartDay(sdf.format(date));
                params.setStatisticsEndDay(sdf.format(new Date()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        //获取时间
        String startDate = dto.getStatisticsStartDay();
        String endDate = dto.getStatisticsEndDay();
        //查看两个时间相差多少天
        int i=0;
        try{
          i = DateUtil.dateBetweenIncludeToday(sdf.parse(startDate), sdf.parse(endDate));
        //获取所有的路内id
            FindCantonDto fDto  =new FindCantonDto();
            BeanUtils.copyProperties(dto,fDto);
        List<DictSectionPO> list = repParkOperatePOMapper.findAllSection(fDto);
        //从开始时间遍历到结束时间,拼接数据
        for (int w=0;w<i;w++){
            RepRoadStatisticsBelowVO repRoadStatisticsBelowVO=new RepRoadStatisticsBelowVO();
            repRoadStatisticsBelowVO.setTime(startDate);
            endDate = startDate + "23:59:59";
            dto.setStatisticsStartDay(startDate);
            dto.setStatisticsEndDay(endDate);
            Integer berthCount=0;
            //先获取总订单数
            Integer orderCount = 0;
            //再获取已完成订单数
            Integer finishCount = 0;
            //获取总收益
            Integer earingsCount = 0;
            //自助缴费个数
            Integer selfHelp = 0;
            //PDA付费个数
            Integer PDAPay = 0;
            for (int q=0;q<list.size();q++){
                dto.setSectionId(list.get(q).getSectionId());
               //根据拼装的查询条件查询数据
                //根据路段id获取每个路段的取泊位数
                berthCount += repParkOperatePOMapper.findBerthCount(dto);
                //根据路段id获取每个路段的总订单数
                orderCount += repParkOperatePOMapper.findOrderCount(dto);
                //根据路段id获取每个路段的已完成订单数
                finishCount += repParkOperatePOMapper.findFinishOrderCount(dto);
                //根据路段id获取每个路段的总收益
                earingsCount += repParkOperatePOMapper.findEarningsCount(dto);
                //根据路段id获取每个路段的自助缴费个数
                selfHelp += repParkOperatePOMapper.findSelfHelpPay(dto);
                //根据路段id获取每个路段的PDA付费个数
                PDAPay += repParkOperatePOMapper.findPDAPay(dto);
            }
            //获取泊位日均收益
            if (earingsCount!=0){
                BigDecimal decimal3 = new BigDecimal(berthCount);
                BigDecimal decimal4 = new BigDecimal(earingsCount);
                repRoadStatisticsBelowVO.setBerthRatio(decimal3.divide(decimal4, 2, RoundingMode.HALF_UP));
            }else{
                repRoadStatisticsBelowVO.setBerthRatio(new BigDecimal(0.00));
            }
          //获取支付率
            if (finishCount!=0 ||orderCount!=0){
                BigDecimal decimal1 = new BigDecimal(finishCount);
                BigDecimal decimal2 = new BigDecimal(orderCount);
                repRoadStatisticsBelowVO.setPayRatio(decimal1.divide(decimal2, 2, RoundingMode.HALF_UP));
            }else{
                repRoadStatisticsBelowVO.setPayRatio(new BigDecimal(0.00));
            }
          //自助缴费比例
            if (selfHelp!=0 ||finishCount!=0){
                BigDecimal decimal5 = new BigDecimal(selfHelp);
                BigDecimal decimal6 = new BigDecimal(finishCount);
                repRoadStatisticsBelowVO.setSelfPayRatio(decimal5.divide(decimal6, 2, RoundingMode.HALF_UP));
            }else{
                repRoadStatisticsBelowVO.setSelfPayRatio(new BigDecimal(0.00));
            }
         //PDA付费比例
            if (PDAPay!=0 ||finishCount!=0){
                BigDecimal decimal7 = new BigDecimal(PDAPay);
                BigDecimal decimal8 = new BigDecimal(finishCount);
                repRoadStatisticsBelowVO.setPdaPayRatio(decimal7.divide(decimal8, 2, RoundingMode.HALF_UP));
            }else{
                repRoadStatisticsBelowVO.setPdaPayRatio(new BigDecimal(0.00));
            }
         startDate = sdf.format(DateUtil.dateAddDays(sdf.parse(startDate), 1));
            repRoadList.add(repRoadStatisticsBelowVO);
        }
        }catch (ParseException e){
            e.printStackTrace();
        }
        return CommonResult.success(repRoadList);
    }
}
