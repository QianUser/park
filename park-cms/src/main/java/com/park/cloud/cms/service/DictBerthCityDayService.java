package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityDaySearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictBerthCityDayVO;
import com.park.cloud.common.domain.vo.cms.DictSectionListVO;

import java.util.List;

/**
 * DictBerthCityDayService
 * 今日泊位占用情况服务
 *
 * @author zyj
 * @date 2020/3/17
 */
public interface DictBerthCityDayService {

    /**
     * 今日泊位占用列表查询
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictBerthCityDayVO>> search(DictBerthCityDaySearchParams param);

    CommonResult<List<DictSectionListVO>> list(CmsBaseParams param);
}