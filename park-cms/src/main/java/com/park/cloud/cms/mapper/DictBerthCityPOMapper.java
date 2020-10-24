package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictBerthCityDto;
import com.park.cloud.common.domain.po.dict.DictBerthCityPO;
import com.park.cloud.common.domain.po.dict.DictBerthCityPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.DictBerthCityVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DictBerthCityPOMapper {
    long countByExample(DictBerthCityPOExample example);

    int deleteByExample(DictBerthCityPOExample example);

    int deleteByPrimaryKey(Integer berthId);

    int insert(DictBerthCityPO record);

    int insertSelective(DictBerthCityPO record);

    List<DictBerthCityPO> selectByExample(DictBerthCityPOExample example);

    DictBerthCityPO selectByPrimaryKey(Integer berthId);

    int updateByExampleSelective(@Param("record") DictBerthCityPO record, @Param("example") DictBerthCityPOExample example);

    int updateByExample(@Param("record") DictBerthCityPO record, @Param("example") DictBerthCityPOExample example);

    int updateByPrimaryKeySelective(DictBerthCityPO record);

    int updateByPrimaryKey(DictBerthCityPO record);

    List<DictBerthCityVO> selectByDto(DictBerthCityDto dto);
}