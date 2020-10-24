package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.ParkingSaturationParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;

import java.util.List;

/**
 * OverviewService
 * 〈CMS概况服务〉
 *
 * @author zyj
 * @create 2020/2/6
 * @since 1.0.0
 */
public interface OverviewService {
    CommonResult<ParkingDiagramInfoVO> parkingDiagram(CmsBaseParams param);

    CommonResult<PageHelperVO<ParkingSaturationVO>> saturation(ParkingSaturationParams params);

    CommonResult<ParkingAmountVO> parkingAmount(CmsBaseParams param);

    CommonResult<ParkingAmountMonthVO> parkingAmountMonth(CmsBaseParams param);

    CommonResult<ParkingAmountHourVO> parkingAmountDay(CmsBaseParams param);

    CommonResult<ParkingCountHourVO> parkingCountDay(CmsBaseParams param);

    CommonResult<ParkingTypeVO> parkingType(CmsBaseParams param);

    CommonResult<ParkingServiceVO> parkingService(CmsBaseParams param);

    CommonResult<ParkingTimeVO> parkingTime(CmsBaseParams param);

    CommonResult<List<ParkingAmountAllVO>> parkingAmountAll(CmsBaseParams param);
}