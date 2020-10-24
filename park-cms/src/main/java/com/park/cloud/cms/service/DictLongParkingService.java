package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.DictLongParkingSearchParams;
import com.park.cloud.common.domain.po.dict.DictLongParkingPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictLongParkingVO;

import java.util.List;

/**
 * DictLongParkingService
 * 僵尸车查询服务
 *
 * @author zyj
 * @date 2020/3/17
 */
public interface DictLongParkingService {

    /**
     * 僵尸车查询
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictLongParkingVO>> search(DictLongParkingSearchParams param);

    List<DictLongParkingPO> allList(DictLongParkingSearchParams param);
}