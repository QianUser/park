package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictSpecialListPOMapper;
import com.park.cloud.cms.service.DictSpecialListService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictSpecialListDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.dict.DictBerthCityPOExample;
import com.park.cloud.common.domain.po.dict.DictSpecialListPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictSpecialListVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 黑白名单服务
 *
 * @author liyj1
 * @create 2020/2/11
 * @since 1.0.0
 */
@Service
@Slf4j
public class DictSpecialListServiceImpl implements DictSpecialListService {

    @Autowired
    DictSpecialListPOMapper dictSpecialListPOMapper;

    /**
     * 添加黑白名单接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(DictSpecialListAddParams param) {
        DictSpecialListPO po = new DictSpecialListPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        dictSpecialListPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新黑白名单接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(DictSpecialListUpdateParams param) {
        DictSpecialListPO po = new DictSpecialListPO();
        BeanUtils.copyProperties(param, po);
        dictSpecialListPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 黑白名单删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(DictSpecialListDeleteParams param) {
        dictSpecialListPOMapper.deleteByPrimaryKey(param.getSpecialListId());
        return CommonResult.success();
    }

    /**
     * 搜索黑白名单接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictSpecialListVO>> search(DictSpecialListSearchParams param) {
        DictSpecialListDto dto = new DictSpecialListDto();
        BeanUtils.copyProperties(param, dto);

        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<DictSpecialListVO> resultList = dictSpecialListPOMapper.selectByDto(dto);
        PageInfo<DictSpecialListVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<DictSpecialListVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }
}