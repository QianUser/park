package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysGateVO;

/**
 * 闸机
 */
public interface SysGateService {
    /**
     * 添加闸机接口
     * @param param
     */
    CommonResult add(SysGateAddParams param);

    /**
     * 更新闸机接口
     * @param param
     */
    CommonResult update(SysGateUpdateParams param);

    /**
     * 闸机详情
     * @param param
     */
    CommonResult<SysGateVO> detail(SysGateDetailParams param);

    /**
     * 闸机删除接口
     * @param param
     */
    CommonResult delete(SysGateDeleteParams param);

    /**
     * 搜索闸机接口
     * @param param
     */
    CommonResult<PageHelperVO<SysGateVO>> search(SysGateSearchParams param);

}