package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.OpmCorrectOrderAuditParams;
import com.park.cloud.common.domain.params.cms.OpmCorrectOrderListParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.OpmCorrectOrderVO;

import java.util.List;

/**
 * @author liuhainan
 */
public interface OpmCorrectOrderService {

    CommonResult<PageHelperVO<OpmCorrectOrderVO>> search(OpmCorrectOrderListParams params);

    CommonResult<List<OpmCorrectOrderVO>> searchList(OpmCorrectOrderListParams params);

    CommonResult<String> update(OpmCorrectOrderAuditParams params);
}
