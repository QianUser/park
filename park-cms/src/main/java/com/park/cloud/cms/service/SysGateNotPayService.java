package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.SysGateNotPayDetailParams;
import com.park.cloud.common.domain.params.cms.SysGateNotPayUpdateParams;
import com.park.cloud.common.domain.vo.cms.SysGateNotPayVO;

/**
 * 未处理服务
 */
public interface SysGateNotPayService {
    /**
     * 闸机未处理接口
     */
    CommonResult<SysGateNotPayVO> detail(SysGateNotPayDetailParams param);

    /**
     * 更新未处理接口
     */
    CommonResult<Object> update(SysGateNotPayUpdateParams param);

}