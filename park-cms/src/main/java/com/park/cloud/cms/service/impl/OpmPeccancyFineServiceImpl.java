package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.OpmPeccancyFinePOMapper;
import com.park.cloud.cms.service.OpmPeccancyFineService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.PeccancyFineSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.PeccancyFineSearchVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuhainan
 */
@Slf4j
@Service
public class OpmPeccancyFineServiceImpl implements OpmPeccancyFineService {

    @Autowired
    private OpmPeccancyFinePOMapper opmPeccancyFinePOMapper;

    @Override
    public CommonResult<PageHelperVO<PeccancyFineSearchVO>> search(PeccancyFineSearchParams param) {
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<PeccancyFineSearchVO> list = opmPeccancyFinePOMapper.search(param);
        PageInfo<PeccancyFineSearchVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<PeccancyFineSearchVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(list);
        return CommonResult.success();
    }
}
