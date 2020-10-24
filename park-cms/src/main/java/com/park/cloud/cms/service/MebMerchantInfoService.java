package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MebMerchantVO;

import java.util.List;

/**
 * MebMerchantInfoService
 * 〈商户服务〉
 *
 * @author liyj
 * @create 2020/1/21
 * @since 1.0.0
 */
public interface MebMerchantInfoService {

    /**
     * 添加商户接口
     *
     * @param param
     * @return
     */
    CommonResult add(MebMerchantAddParams param);

    /**
     * 更新商户接口
     *
     * @param param
     * @return
     */
    CommonResult update(MebMerchantUpdateParams param);

    /**
     * 商户详情
     *
     * @param param
     * @return
     */
    CommonResult<MebMerchantVO> detail(MebMerchantDetailParams param);

    /**
     * 商户删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(MebMerchantDeleteParams param);

    /**
     * 搜索商户接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<MebMerchantVO>> search(MebMerchantSearchParams param);

    /**
     * 商户列表接口
     * @param param
     * @return
     */
    CommonResult<List<MebMerchantVO>> list(MebMerchantSearchParams param);
}