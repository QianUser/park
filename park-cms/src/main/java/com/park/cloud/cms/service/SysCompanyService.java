package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysCompanyListVO;
import com.park.cloud.common.domain.vo.cms.SysCompanyVO;

import javax.validation.Valid;
import java.util.List;

/**
 * SysCompanyService
 * 〈单位管理服务〉
 *
 * @author liyj
 * @create 2020/1/20
 * @since 1.0.0
 */
public interface SysCompanyService {

    /**
     * 添加单位接口
     * @param param
     * @return
     */
    CommonResult add(SysCompanyAddParams param);

    /**
     * 更新单位接口
     * @param param
     * @return
     */
    CommonResult update(SysCompanyUpdateParams param);

    /**
     * 单位详情接口
     * @param param
     * @return
     */
    CommonResult<SysCompanyVO> detail(SysCompanyDetailParams param);

    /**
     * 搜索单位接口
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysCompanyVO>> search(SysCompanySearchParams param);

    /**
     * 单位列表接口,用于下拉框
     * @param param
     * @return
     */
    CommonResult<List<SysCompanyListVO>> list(SysCompanyListParams param);
}