package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictCityDto;
import com.park.cloud.common.domain.po.dict.DictCityPO;
import com.park.cloud.common.domain.po.dict.DictCityPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.DictCityListVO;
import com.park.cloud.common.domain.vo.cms.DictCityVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DictCityPOMapper {
    long countByExample(DictCityPOExample example);

    int deleteByExample(DictCityPOExample example);

    int deleteByPrimaryKey(Integer cityId);

    int insert(DictCityPO record);

    int insertSelective(DictCityPO record);

    List<DictCityPO> selectByExample(DictCityPOExample example);

    DictCityPO selectByPrimaryKey(Integer cityId);

    int updateByExampleSelective(@Param("record") DictCityPO record, @Param("example") DictCityPOExample example);

    int updateByExample(@Param("record") DictCityPO record, @Param("example") DictCityPOExample example);

    int updateByPrimaryKeySelective(DictCityPO record);

    int updateByPrimaryKey(DictCityPO record);

    List<DictCityVO> selectByDto(DictCityDto dto);

    List<DictCityListVO> selectListByDto(DictCityDto dto);
}