package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.ParkingDiagramMapper;
import com.park.cloud.cms.service.OverviewService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.OverviewDto;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.ParkingSaturationParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * CMS概况服务
 *
 * @author zyj
 * @since 1.0.0
 */
@Service
@Slf4j
public class OverviewServiceImpl implements OverviewService {
    @Autowired
    ParkingDiagramMapper parkingDiagramMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    @Override
    public CommonResult<ParkingDiagramInfoVO> parkingDiagram(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            List<ParkingDiagramVO> resultList = parkingDiagramMapper.selectParking(dto);

            ParkingDiagramInfoVO infoVO = parkingDiagramMapper.selectParkingLatLng(dto);
            if (infoVO == null) {
                infoVO = new ParkingDiagramInfoVO();
            }
            infoVO.setParkingList(resultList);
            return CommonResult.success(infoVO);
        } catch (Exception e) {
            log.error("parkingDiagram error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<PageHelperVO<ParkingSaturationVO>> saturation(ParkingSaturationParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());
            List<ParkingSaturationVO> resultList = parkingDiagramMapper.selectSaturation(dto);
            PageInfo<ParkingSaturationVO> pageInfo = new PageInfo<>(resultList);

            PageHelperVO<ParkingSaturationVO> pageHelperVO = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperVO);
            pageHelperVO.setList(resultList);
            return CommonResult.success(pageHelperVO);
        } catch (Exception e) {
            log.error("saturation error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<ParkingAmountVO> parkingAmount(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            ParkingAmountVO result = parkingDiagramMapper.selectParkingAmount(dto);
            result.setCurrentParkingNo(result.getParkingNo() - result.getCurrentParkingNo());
            result.setCurrentOffRoadParkingNo(result.getOffRoadParkingNo() - result.getCurrentOffRoadParkingNo());
            result.setCurrentCurbParkingNo(result.getCurbParkingNo() - result.getCurrentCurbParkingNo());
            if (0 == result.getParkingNo()) {
                result.setParkingRatio(BigDecimal.ZERO);
            } else {
                result.setParkingRatio(new BigDecimal(result.getParkingCount()).divide(new BigDecimal(result.getParkingNo()), 4, RoundingMode.HALF_EVEN));
            }
            if (0 == result.getCurbParkingNo()) {
                result.setCurbParkingRatio(BigDecimal.ZERO);
            } else {
                result.setCurbParkingRatio(new BigDecimal(result.getCurbParkingCount()).divide(new BigDecimal(result.getCurbParkingNo()), 4, RoundingMode.HALF_EVEN));
            }
            if (0 == result.getOffRoadParkingNo()) {
                result.setOffRoadParkingRatio(BigDecimal.ZERO);
            } else {
                result.setOffRoadParkingRatio(new BigDecimal(result.getOffRoadParkingCount()).divide(new BigDecimal(result.getOffRoadParkingNo()), 4, RoundingMode.HALF_EVEN));
            }
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("parkingAmount error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<ParkingAmountMonthVO> parkingAmountMonth(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            List<ParkingAmountDayVO> thisMonth = parkingDiagramMapper.selectParkingAmountThisMonth(dto);
            List<ParkingAmountDayVO> lastMonth = parkingDiagramMapper.selectParkingAmountLastMonth(dto);
            // 补全连续日期
            getDayOfMonth(thisMonth, Calendar.getInstance().get(Calendar.MONTH), Boolean.TRUE);
            getDayOfMonth(lastMonth, Calendar.getInstance().get(Calendar.MONTH) - 1, Boolean.FALSE);
            // 日期排序
            thisMonth.sort(Comparator.comparing(ParkingAmountDayVO::getDate));
            lastMonth.sort(Comparator.comparing(ParkingAmountDayVO::getDate));

            ParkingAmountMonthVO result = new ParkingAmountMonthVO();
            result.setThisMonthAmount(thisMonth);
            result.setLastMonthAmount(lastMonth);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("parkingAmountMonth error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<ParkingAmountHourVO> parkingAmountDay(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            List<ParkingAmountTimeVO> offRoadAmount = parkingDiagramMapper.selectParkingAmountOffRoad(dto);
            List<ParkingAmountTimeVO> curbAmount = parkingDiagramMapper.selectParkingAmountCurb(dto);
            // 补全时间
            getHourOfDay(offRoadAmount, Boolean.TRUE);
            getHourOfDay(curbAmount, Boolean.TRUE);
            // 时间排序
            offRoadAmount.sort(Comparator.comparing(ParkingAmountTimeVO::getHour));
            curbAmount.sort(Comparator.comparing(ParkingAmountTimeVO::getHour));

            ParkingAmountHourVO result = new ParkingAmountHourVO();
            result.setOffRoadAmount(offRoadAmount);
            result.setCurbAmount(curbAmount);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("parkingAmountDay error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<ParkingCountHourVO> parkingCountDay(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            List<ParkingCountTimeVO> offRoadCount = parkingDiagramMapper.selectParkingCountOffRoad(dto);
            List<ParkingCountTimeVO> curbCount = parkingDiagramMapper.selectParkingCountCurb(dto);
            // 补全时间
            getCountOfDay(offRoadCount, Boolean.TRUE);
            getCountOfDay(curbCount, Boolean.TRUE);
            // 时间排序
            offRoadCount.sort(Comparator.comparing(ParkingCountTimeVO::getHour));
            curbCount.sort(Comparator.comparing(ParkingCountTimeVO::getHour));
            ParkingCountHourVO result = new ParkingCountHourVO();
            result.setOffRoadCount(offRoadCount);
            result.setCurbCount(curbCount);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("parkingAmountDay error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<ParkingTypeVO> parkingType(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            ParkingTypeVO result = parkingDiagramMapper.selectParkingType(dto);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("parkingCountDay error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<ParkingServiceVO> parkingService(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            ParkingServiceVO result = parkingDiagramMapper.selectParkingService(dto);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("parkingService error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<ParkingTimeVO> parkingTime(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            ParkingTimeVO result = parkingDiagramMapper.selectParkingTime(dto);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("parkingTime error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<List<ParkingAmountAllVO>> parkingAmountAll(CmsBaseParams param) {
        try {
            OverviewDto dto = new OverviewDto();
            BeanUtils.copyProperties(param, dto);
            //设置登陆用户辖区
            sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
            List<ParkingAmountAllVO> result = parkingDiagramMapper.selectParkingAmountAll(dto);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("parkingAmountAll error.", e);
            return CommonResult.failed();
        }
    }

    /**
     * 补全日期
     *
     * @param amountDayVOList 月数据
     * @param month           月份
     * @param toToday         补全日期是否到当天
     */
    private void getDayOfMonth(List<ParkingAmountDayVO> amountDayVOList, int month, boolean toToday) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), month, 1);
        List<Date> list = new ArrayList<>();
        do {
            list.add(calendar.getTime());
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        } while (month == calendar.get(Calendar.MONTH));
        List<String> days = new ArrayList<>();
        for (Date d : list) {
            String day = new SimpleDateFormat("MM-dd").format(d);
            days.add(day);
            if (toToday && day.equals(new SimpleDateFormat("MM-dd").format(new Date()))) {
                break;
            }
        }

        for (String day : days) {
            boolean exist = true;
            for (ParkingAmountDayVO vo : amountDayVOList) {
                if (day.equals(vo.getDate())) {
                    exist = false;
                    break;
                }
            }
            if (exist) {
                ParkingAmountDayVO vo = new ParkingAmountDayVO();
                vo.setDate(day);
                vo.setDayAmount(BigDecimal.ZERO);
                amountDayVOList.add(vo);
            }
        }
    }

    /**
     * 今日营收指数补全小时
     *
     * @param offRoadAmount 数据
     * @param toNow 是否补全到当前时间
     */
    private void getHourOfDay(List<ParkingAmountTimeVO> offRoadAmount, boolean toNow) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, Calendar.FEBRUARY, Calendar.DATE, 1, 0);
        List<Date> list = new ArrayList<>();
        while (calendar.get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
            list.add(calendar.getTime());
            calendar.add(Calendar.HOUR_OF_DAY, 1);
        }
        List<Integer> hours = new ArrayList<>();
        for (Date d : list) {
            String hour = new SimpleDateFormat("H").format(d);
            hours.add(Integer.parseInt(hour));
            if (toNow && hour.equals(new SimpleDateFormat("H").format(new Date()))) {
                break;
            }
        }

        for (Integer hour : hours) {
            boolean exist = true;
            for (ParkingAmountTimeVO vo : offRoadAmount) {
                if (hour.equals(vo.getHour())) {
                    exist = false;
                    break;
                }
            }
            if (exist) {
                ParkingAmountTimeVO vo = new ParkingAmountTimeVO();
                vo.setHour(hour);
                vo.setHourAmount(BigDecimal.ZERO);
                offRoadAmount.add(vo);
            }
        }
    }

    /**
     * 今日停车指数补全小时
     *
     * @param offRoadAmount 数据
     * @param toNow 是否补全到当前时间
     */
    private void getCountOfDay(List<ParkingCountTimeVO> offRoadAmount, boolean toNow) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, Calendar.FEBRUARY, Calendar.DATE, 1, 0);
        List<Date> list = new ArrayList<>();
        while (calendar.get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
            list.add(calendar.getTime());
            calendar.add(Calendar.HOUR_OF_DAY, 1);
        }
        List<Integer> hours = new ArrayList<>();
        for (Date d : list) {
            String hour = new SimpleDateFormat("H").format(d);
            hours.add(Integer.parseInt(hour));
            if (toNow && hour.equals(new SimpleDateFormat("H").format(new Date()))) {
                break;
            }
        }

        for (Integer hour : hours) {
            boolean exist = true;
            for (ParkingCountTimeVO vo : offRoadAmount) {
                if (hour.equals(vo.getHour())) {
                    exist = false;
                    break;
                }
            }
            if (exist) {
                ParkingCountTimeVO vo = new ParkingCountTimeVO();
                vo.setHour(hour);
                vo.setHourCount(BigDecimal.ZERO);
                offRoadAmount.add(vo);
            }
        }
    }
}