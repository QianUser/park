package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictBerthCityDayMapper;
import com.park.cloud.cms.mapper.DictSectionPOMapper;
import com.park.cloud.cms.service.DictBerthCityDayService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictBerthCityDayDto;
import com.park.cloud.common.domain.dto.cms.DictSectionDto;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityDaySearchParams;
import com.park.cloud.common.domain.po.dict.DictBerthCityDayPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictBerthCityDayVO;
import com.park.cloud.common.domain.vo.cms.DictSectionListVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 今日泊位占用情况服务
 *
 * @author zyj
 * @date 2020/3/17
 */
@Service
@Slf4j
public class DictBerthCityDayServiceImpl implements DictBerthCityDayService {

    @Autowired
    private DictBerthCityDayMapper dictBerthCityDayMapper;

    @Autowired
    DictSectionPOMapper dictSectionPOMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    /**
     * 今日泊位占用列表查询
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictBerthCityDayVO>> search(DictBerthCityDaySearchParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            DictBerthCityDayDto dto = new DictBerthCityDayDto();
            BeanUtils.copyProperties(param, dto);
            List<DictBerthCityDayPO> resultList = dictBerthCityDayMapper.selectBerthCityDay(dto);
            PageInfo<DictBerthCityDayPO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<DictBerthCityDayVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<DictBerthCityDayVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (DictBerthCityDayPO po : resultList) {
                    DictBerthCityDayVO vo = new DictBerthCityDayVO();
                    BeanUtils.copyProperties(po, vo);
                    list.add(vo);
                }
            }
            return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("获取今日泊位占用列表失败：", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<List<DictSectionListVO>> list(CmsBaseParams param) {
        DictSectionDto dto = new DictSectionDto();
        // 设置登录用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        List<DictSectionListVO> resultList = dictSectionPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }

}