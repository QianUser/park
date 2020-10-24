package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.cms.*;

import java.util.List;

public interface RepParkOperateByHourService {
    CommonResult<RepParkByHourStatisticsTopVO> repParkByHourStatistics(RepParkByHourTopParams params);

    CommonResult<List<CantonIdSVO>> findAllRegion(CmsBaseParams params);

    CommonResult<List<RepDataStatisticsByDayVO>> findStatisticsByDay(RepDataStatisticsParams params);

    CommonResult<List<RepParkTimeVO>> findVehParkTime(RepParkByHourTopParams params);

    CommonResult<List<FindEarningsCaseVO>> findEarningsCase(RepFindEarningsByTypeParams params);
}
