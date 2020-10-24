package com.park.cloud.cms.service;


import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepRoadStatisticsParams;
import com.park.cloud.common.domain.vo.cms.RepRoadStatisticsBelowVO;
import com.park.cloud.common.domain.vo.cms.RepRoadStatisticsTopVO;

import java.util.List;

public interface RepRoadStatisticsService {
    CommonResult<RepRoadStatisticsTopVO> dealStatistics(RepRoadStatisticsParams params);

    CommonResult<List<RepRoadStatisticsBelowVO>> roadStatisticsBelow(RepRoadStatisticsParams params);
}
