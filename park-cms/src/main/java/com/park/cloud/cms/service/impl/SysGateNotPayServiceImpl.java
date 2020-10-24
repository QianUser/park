package com.park.cloud.cms.service.impl;

import com.park.cloud.cms.mapper.SysGateNotPayMapper;
import com.park.cloud.cms.service.SysGateNotPayService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.SysGateNotPayDetailParams;
import com.park.cloud.common.domain.params.cms.SysGateNotPayUpdateParams;
import com.park.cloud.common.domain.po.sys.SysGateNotPayPO;
import com.park.cloud.common.domain.vo.cms.SysGateNotPayVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 闸机未支付处理服务
 */
@Service
@Slf4j
public class SysGateNotPayServiceImpl implements SysGateNotPayService {

    @Autowired
    private SysGateNotPayMapper sysGateNotPayMapper;

    @Override
    public CommonResult<SysGateNotPayVO> detail(SysGateNotPayDetailParams param) {
        SysGateNotPayVO vo = sysGateNotPayMapper.selectByOrderId(param.getTraBargainOrderId());
        return CommonResult.success(vo);
    }

    @Override
    public CommonResult<Object> update(SysGateNotPayUpdateParams param) {
        SysGateNotPayPO po = new SysGateNotPayPO();
        BeanUtils.copyProperties(param, po);
        sysGateNotPayMapper.update(po);
        return CommonResult.success();
    }


}