package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsMebUserSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.CmsMebUserVO;

import java.util.List;

/**
 * CmsMebUserService
 * 〈客户端用户服务〉
 *
 * @author liyj1
 * @create 2020/2/10
 * @since 1.0.0
 */
public interface CmsMebUserService {

    /**
     * 搜索用户接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<CmsMebUserVO>> search(CmsMebUserSearchParams param);

    CommonResult<List<CmsMebUserVO>> searchAll(CmsMebUserSearchParams param);
}