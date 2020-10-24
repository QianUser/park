package com.park.cloud.cms.service.impl;

import com.park.cloud.cms.mapper.RepParkOperateByHourPOMapper;
import com.park.cloud.cms.mapper.RepParkTimePOMapper;
import com.park.cloud.cms.service.RepParkOperateByHourService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.constant.ParkTimeEnum;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.FindCantonDto;
import com.park.cloud.common.domain.dto.cms.ReoFindEarningsCaseDto;
import com.park.cloud.common.domain.dto.cms.RepParkByHourTopDto;
import com.park.cloud.common.domain.dto.cms.RepStatisticsByDayDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.rep.RepParkTimePO;
import com.park.cloud.common.domain.vo.cms.*;
import com.park.cloud.common.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @ClassNameRepParkOperateByHourServiceImpl
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/11 13:47
 **/
@Service
@Slf4j
public class RepParkOperateByHourServiceImpl implements RepParkOperateByHourService {
    @Autowired
    SysAreaAssService sysAreaAssService;
    @Autowired
    private RepParkOperateByHourPOMapper repParkOperateByHourPOMapper;
    @Autowired
    private RepParkTimePOMapper repParkTimePOMapper;

    @Override
    public CommonResult<RepParkByHourStatisticsTopVO> repParkByHourStatistics(RepParkByHourTopParams params) {
        RepParkByHourTopDto dto = new RepParkByHourTopDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
     List<RepParkByHourStatisticsTopVO> list =   repParkOperateByHourPOMapper.findTop(dto);
     //获取总泊位数
       Integer berthCount = repParkOperateByHourPOMapper.findBerthCount(dto);
       //停车总次数
        Integer parkNum=0;
        //停车金额
        Integer receiptPrice=0;
        //当前在场车辆数
        Integer currentParkNum=0;
        for (int i=0;i<list.size();i++){
            if (list.get(i).getParkNum()!=null){
                parkNum+=list.get(i).getParkNum();
            }
            if (list.get(i).getReceiptPrice()!=null){
                receiptPrice+=list.get(i).getReceiptPrice();
            }
            if (list.get(i).getCurrentParkNum()!=null){
                currentParkNum+=list.get(i).getCurrentParkNum();
            }


        }
        RepParkByHourStatisticsTopVO repParkByHourStatisticsTopVO =new RepParkByHourStatisticsTopVO();
        //获取当前车位占有率
        BigDecimal decimal3 = new BigDecimal(currentParkNum);
        BigDecimal decimal4 = new BigDecimal(berthCount);
        repParkByHourStatisticsTopVO.setStallOccupancy( decimal3.divide(decimal4,2, RoundingMode.HALF_UP));
        //获取当前车位周转率
        BigDecimal decimal1 = new BigDecimal(parkNum);
        BigDecimal decimal2 = new BigDecimal(berthCount);
        repParkByHourStatisticsTopVO.setTurnoverRate( decimal1.divide(decimal2,2, RoundingMode.HALF_UP));
        repParkByHourStatisticsTopVO.setCurrentParkNum(currentParkNum);
        repParkByHourStatisticsTopVO.setParkNum(parkNum);
        repParkByHourStatisticsTopVO.setReceiptPrice(receiptPrice);
        return CommonResult.success(repParkByHourStatisticsTopVO);
    }

    @Override
    public CommonResult<List<CantonIdSVO>> findAllRegion(CmsBaseParams params) {
        FindCantonDto dto = new FindCantonDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        //根据行政的id 查询行政区的名称和id
      List<CantonIdSVO>list =   repParkOperateByHourPOMapper.findAllCantonById(dto.getLoginUserCityIds());
          return CommonResult.success(list);
    }

    /**
     * @Description:根据传过来的行政区id查询相对应的数据
     * @Author: liangshuang
     * @Date: 2020/3/13 14:45
     * @param params
     com.park.cloud.common.domain.CommonResult<java.util.List<com.park.cloud.common.domain.vo.cms.RepDataStatisticsByDayVO>>
     **/


    @Override
    public CommonResult<List<RepDataStatisticsByDayVO>> findStatisticsByDay(RepDataStatisticsParams params) {
        RepParkByHourTopDto topDto = new RepParkByHourTopDto();
        if(ArrayUtils.isEmpty(params.getCantonId())){
            return CommonResult.success(new ArrayList<>());
        }
        BeanUtils.copyProperties(params, topDto);
        //设置登陆用户辖区
         sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), topDto);
        //获取总泊位数
        Integer berthCount = repParkOperateByHourPOMapper.findBerthCount(topDto);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        List<RepDataStatisticsByDayVO>list= new ArrayList<>();
        //遍历时间
        for (int i=0;i<24;i++){
            RepDataStatisticsByDayVO  dataVo=new RepDataStatisticsByDayVO();
            RepStatisticsByDayDto dto = new RepStatisticsByDayDto();
            dto.setStatisticsDay(df.format(new Date()).substring(0,10));
            //拼接时间
           String time = i+":00";
            dto.setTime(time);
            dataVo.setTime(time);
           //再遍历行政区id
            for (int w=0;w<params.getCantonId().length;w++){
                if(StringUtils.isBlank(params.getCantonId()[w])){
                    continue;
                }
                //根据行政id查询行政区名称
              String cantonName =  repParkOperateByHourPOMapper.findNameById(Integer.parseInt(params.getCantonId()[w]));
                //根据时间和行政区id查询停车指数
                dto.setCantonId(Integer.parseInt(params.getCantonId()[w]));
                RepParkByHourStatisticsTopVO repVo= repParkOperateByHourPOMapper.findDataStatistics(dto);
                if (repVo!=null){
                    dataVo.setCantonName(cantonName);
                    dataVo.setCantonId(Integer.parseInt(params.getCantonId()[w]));
                    dataVo.setParkNum(repVo.getParkNum());
                    //获取当前停车指数
                    BigDecimal decimal3 = new BigDecimal(repVo.getCurrentParkNum());
                    BigDecimal decimal4 = new BigDecimal(berthCount);
                    dataVo.setStallOccupancy( decimal3.divide(decimal4,2, RoundingMode.HALF_UP));
                    //获取当前车位周转率
                    BigDecimal decimal1 = new BigDecimal(repVo.getParkNum());
                    BigDecimal decimal2 = new BigDecimal(berthCount);
                    dataVo.setTurnoverRate( decimal1.divide(decimal2,2, RoundingMode.HALF_UP));
                    list.add(dataVo);
                }
            }
        }
        return CommonResult.success(list);
    }

    @Override
    public CommonResult<List<RepParkTimeVO>> findVehParkTime(RepParkByHourTopParams params) {
        RepParkByHourTopDto dto = new RepParkByHourTopDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
      //  sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        List<RepParkTimeVO> list = new ArrayList<>();
        //查询出所有数据
        List<RepParkTimePO> allData = repParkTimePOMapper.findAllData(dto);
        //总停车数
        Integer payNum=  repParkTimePOMapper.findParkCount(dto);
        //遍历数据集,根据类型不同塞值
        for(int i=0;i<allData.size();i++){
            RepParkTimeVO repParkTimeVO=new RepParkTimeVO();
            if (allData.get(i).getParkTimeType()== ParkTimeEnum.ONE.getCode()){
               repParkTimeVO.setParkTime(ParkTimeEnum.ONE.getName());
            }
            if (allData.get(i).getParkTimeType()== ParkTimeEnum.TWO.getCode()){
                repParkTimeVO.setParkTime(ParkTimeEnum.TWO.getName());
            }
            if (allData.get(i).getParkTimeType()== ParkTimeEnum.THREE.getCode()){
                repParkTimeVO.setParkTime(ParkTimeEnum.THREE.getName());
            }
            if (allData.get(i).getParkTimeType()== ParkTimeEnum.FOUR.getCode()){
                repParkTimeVO.setParkTime(ParkTimeEnum.FOUR.getName());
            }
            if (allData.get(i).getParkTimeType()== ParkTimeEnum.FIVE.getCode()){
                repParkTimeVO.setParkTime(ParkTimeEnum.FIVE.getName());
            }
            if (allData.get(i).getParkTimeType()== ParkTimeEnum.SIX.getCode()){
                repParkTimeVO.setParkTime(ParkTimeEnum.SIX.getName());
            }
            if (allData.get(i).getParkNum()!=null){
                BigDecimal decimal1 = new BigDecimal(allData.get(i).getParkNum());
                BigDecimal decimal2 = new BigDecimal(payNum);
                repParkTimeVO.setParkTimeRatio(decimal1.divide(decimal2,2, RoundingMode.HALF_UP));
            }else{
                repParkTimeVO.setParkTimeRatio(new BigDecimal(0));
            }
         list.add(repParkTimeVO);
        }
        return CommonResult.success(list);
    }

    @Override
    public CommonResult<List<FindEarningsCaseVO>> findEarningsCase(RepFindEarningsByTypeParams params) {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       //获取当前时间
        String format = sdf.format(new Date());
        List<FindEarningsCaseVO> list=new ArrayList<>();
        //先判断时间类型.
        if(params.getDateType()==1) {
            //是1就是周正常查询,当前天数往前7天
            Date date = DateUtil.dateAddDays(new Date(), -7);
            ReoFindEarningsCaseDto dto = new ReoFindEarningsCaseDto();
            dto.setStatisticsStartDay(sdf.format(date));
            dto.setStatisticsEndDay(format);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
            //根据时间查询出所有时间区间的数据
            list = repParkOperateByHourPOMapper.findAllByDate(dto);
            return CommonResult.success(list);
        }
          if (params.getDateType()==2){
            //是2就是月,正差查询,当前天数往前一个月
            Date date = DateUtil.dateAddMonths(new Date(), -1);
            ReoFindEarningsCaseDto dto = new ReoFindEarningsCaseDto();
            dto.setStatisticsStartDay(sdf.format(date));
            dto.setStatisticsEndDay(format);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
            //根据时间查询出所有时间区间的数据
            list = repParkOperateByHourPOMapper.findAllByDate(dto);
            return CommonResult.success(list);
        }
         if (params.getDateType()==3){
             //3就是年,当前时间往前推12个月
             Date date = DateUtil.dateAddMonths(new Date(), -12);
             ReoFindEarningsCaseDto dto = new ReoFindEarningsCaseDto();
             dto.setStatisticsStartDay(sdf.format(date));
             dto.setStatisticsEndDay(format);
             //设置登陆用户辖区
             sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
             list = repParkOperateByHourPOMapper.findAllByYearDate(dto);
             return CommonResult.success(list);
         }
         return null;
    }
}
