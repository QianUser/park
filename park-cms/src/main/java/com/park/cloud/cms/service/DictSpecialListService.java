package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.DictSpecialListAddParams;
import com.park.cloud.common.domain.params.cms.DictSpecialListDeleteParams;
import com.park.cloud.common.domain.params.cms.DictSpecialListSearchParams;
import com.park.cloud.common.domain.params.cms.DictSpecialListUpdateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictSpecialListVO;

/**
 * DictSpecialListService
 * 〈黑白名单服务〉
 *
 * @author liyj1
 * @create 2020/2/11
 * @since 1.0.0
 */
public interface DictSpecialListService {

    /**
     * 添加黑白名单接口
     *
     * @param param
     * @return
     */
    CommonResult add(DictSpecialListAddParams param);

    /**
     * 更新黑白名单接口
     *
     * @param param
     * @return
     */
    CommonResult update(DictSpecialListUpdateParams param);

    /**
     * 黑白名单删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(DictSpecialListDeleteParams param);

    /**
     * 搜索黑白名单接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictSpecialListVO>> search(DictSpecialListSearchParams param);
}