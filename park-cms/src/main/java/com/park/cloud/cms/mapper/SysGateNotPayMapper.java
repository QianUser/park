package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.po.sys.SysGateNotPayPO;
import com.park.cloud.common.domain.vo.cms.SysGateNotPayVO;
import org.springframework.stereotype.Repository;

@Repository
public interface SysGateNotPayMapper {
    void insert(SysGateNotPayPO po);

    void update(SysGateNotPayPO po);

    SysGateNotPayVO selectByOrderId(Long traBargainOrderId);
}
