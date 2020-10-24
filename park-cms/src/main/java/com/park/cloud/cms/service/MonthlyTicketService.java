package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.MonthlyTicketSearchParam;
import com.park.cloud.common.domain.params.cms.MonthlyTrategyBackParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MonthlyTicketListVO;
import com.park.cloud.common.domain.params.cms.MonthlyTicketParams;
import com.park.cloud.common.domain.params.cms.MonthlyTicketAddParams;

import java.util.List;

public interface MonthlyTicketService {

    CommonResult<PageHelperVO<MonthlyTicketListVO>> list(MonthlyTicketParams param);

    CommonResult add(MonthlyTicketAddParams param);

    CommonResult update(MonthlyTicketAddParams param);

    CommonResult delete(int id);

    CommonResult<List<MonthlyTrategyBackParams>> strategy(int parkingSectionId);
}
