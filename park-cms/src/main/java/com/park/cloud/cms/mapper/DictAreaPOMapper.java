package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictAreaDto;
import com.park.cloud.common.domain.po.dict.DictAreaPO;
import com.park.cloud.common.domain.po.dict.DictAreaPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.DictAreaListVO;
import com.park.cloud.common.domain.vo.cms.DictAreaVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DictAreaPOMapper {
    long countByExample(DictAreaPOExample example);

    int deleteByExample(DictAreaPOExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(DictAreaPO record);

    int insertSelective(DictAreaPO record);

    List<DictAreaPO> selectByExample(DictAreaPOExample example);

    DictAreaPO selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") DictAreaPO record, @Param("example") DictAreaPOExample example);

    int updateByExample(@Param("record") DictAreaPO record, @Param("example") DictAreaPOExample example);

    int updateByPrimaryKeySelective(DictAreaPO record);

    int updateByPrimaryKey(DictAreaPO record);

    List<DictAreaVO> selectByDto(DictAreaDto dto);

    List<DictAreaListVO> selectListByDto(DictAreaDto dto);
}