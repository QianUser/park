package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictCantonDto;
import com.park.cloud.common.domain.po.dict.DictCantonPO;
import com.park.cloud.common.domain.po.dict.DictCantonPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.DictCantonListVO;
import com.park.cloud.common.domain.vo.cms.DictCantonVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DictCantonPOMapper {
    long countByExample(DictCantonPOExample example);

    int deleteByExample(DictCantonPOExample example);

    int deleteByPrimaryKey(Integer cantonId);

    int insert(DictCantonPO record);

    int insertSelective(DictCantonPO record);

    List<DictCantonPO> selectByExample(DictCantonPOExample example);

    DictCantonPO selectByPrimaryKey(Integer cantonId);

    int updateByExampleSelective(@Param("record") DictCantonPO record, @Param("example") DictCantonPOExample example);

    int updateByExample(@Param("record") DictCantonPO record, @Param("example") DictCantonPOExample example);

    int updateByPrimaryKeySelective(DictCantonPO record);

    int updateByPrimaryKey(DictCantonPO record);

    List<DictCantonVO> selectByDto(DictCantonDto dto);

    List<DictCantonListVO> selectListByDto(DictCantonDto dto);
}