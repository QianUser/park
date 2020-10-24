package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.OpmUnbindVehicleInfoAddParams;
import com.park.cloud.common.domain.params.cms.OpmUnbindVehicleInfoSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.OpmUnbindVehicleInfoVO;

/**
 * OpmUnbindVehicleInfoService
 * 〈车牌解绑服务〉
 *
 * @author liyj1
 * @create 2020/2/11
 * @since 1.0.0
 */
public interface OpmUnbindVehicleInfoService {

    /**
     * 搜索解绑车牌接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<OpmUnbindVehicleInfoVO>> search(OpmUnbindVehicleInfoSearchParams param);

    /**
     * 解绑车牌接口
     *
     * @param param
     * @return
     */
    CommonResult add(OpmUnbindVehicleInfoAddParams param);
}