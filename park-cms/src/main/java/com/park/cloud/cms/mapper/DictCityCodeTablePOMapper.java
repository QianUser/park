package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictCityCodeDto;
import com.park.cloud.common.domain.po.dict.DictCityCodeTablePO;
import com.park.cloud.common.domain.po.dict.DictCityCodeTablePOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.DictCityCodeListVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DictCityCodeTablePOMapper {
    long countByExample(DictCityCodeTablePOExample example);

    int deleteByExample(DictCityCodeTablePOExample example);

    int deleteByPrimaryKey(Integer codeId);

    int insert(DictCityCodeTablePO record);

    int insertSelective(DictCityCodeTablePO record);

    List<DictCityCodeTablePO> selectByExample(DictCityCodeTablePOExample example);

    DictCityCodeTablePO selectByPrimaryKey(Integer codeId);

    int updateByExampleSelective(@Param("record") DictCityCodeTablePO record, @Param("example") DictCityCodeTablePOExample example);

    int updateByExample(@Param("record") DictCityCodeTablePO record, @Param("example") DictCityCodeTablePOExample example);

    int updateByPrimaryKeySelective(DictCityCodeTablePO record);

    int updateByPrimaryKey(DictCityCodeTablePO record);

    List<DictCityCodeListVO> selectByDtoForList(DictCityCodeDto dto);
}