package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.MebUserPOMapper;
import com.park.cloud.cms.service.CmsMebUserService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.CmsMebUserDto;
import com.park.cloud.common.domain.params.cms.CmsMebUserSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.CmsMebUserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户端用户服务
 *
 * @author liyj1
 * @create 2020/2/10
 * @since 1.0.0
 */
@Service
@Slf4j
public class CmsMebUserServiceImpl implements CmsMebUserService {

    @Autowired
    MebUserPOMapper mebUserPOMapper;

    /**
     * 搜索用户接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<CmsMebUserVO>> search(CmsMebUserSearchParams param) {
        CmsMebUserDto dto = new CmsMebUserDto();
        BeanUtils.copyProperties(param, dto);

        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<CmsMebUserVO> resultList = mebUserPOMapper.selectByDto(dto);
        PageInfo<CmsMebUserVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<CmsMebUserVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    @Override
    public CommonResult<List<CmsMebUserVO>> searchAll(CmsMebUserSearchParams param) {
        CmsMebUserDto dto = new CmsMebUserDto();
        BeanUtils.copyProperties(param, dto);
        List<CmsMebUserVO> resultList = mebUserPOMapper.selectByDto(dto);
        return CommonResult.success(resultList);
    }
}