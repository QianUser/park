package com.park.cloud.cms.service.impl;

import com.park.cloud.cms.mapper.DictCityCodeTablePOMapper;
import com.park.cloud.cms.service.DictCityCodeService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictCityCodeDto;
import com.park.cloud.common.domain.params.cms.DictCityCodeListParams;
import com.park.cloud.common.domain.vo.cms.DictCityCodeListVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市编码服务
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
@Service
@Slf4j
public class DictCityCodeServiceImpl implements DictCityCodeService {

    @Autowired
    DictCityCodeTablePOMapper cityCodeTablePOMapper;

    /**
     * 返回全国省市行政区列表数据
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<DictCityCodeListVO>> list(DictCityCodeListParams param) {
        DictCityCodeDto dto = new DictCityCodeDto();
        BeanUtils.copyProperties(param, dto);

        return CommonResult.success(cityCodeTablePOMapper.selectByDtoForList(dto));
    }
}