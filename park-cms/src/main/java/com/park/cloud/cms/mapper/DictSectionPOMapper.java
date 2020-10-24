package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictSectionDto;
import com.park.cloud.common.domain.dto.cms.FindCantonDto;
import com.park.cloud.common.domain.po.dict.DictSectionPO;
import com.park.cloud.common.domain.po.dict.DictSectionPOExample;
import com.park.cloud.common.domain.vo.cms.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DictSectionPOMapper {
    long countByExample(DictSectionPOExample example);

    int deleteByExample(DictSectionPOExample example);

    int deleteByPrimaryKey(Integer sectionId);

    int insert(DictSectionPO record);

    int insertSelective(DictSectionPO record);

    List<DictSectionPO> selectByExample(DictSectionPOExample example);

    DictSectionPO selectByPrimaryKey(Integer sectionId);

    int updateByExampleSelective(@Param("record") DictSectionPO record, @Param("example") DictSectionPOExample example);

    int updateByExample(@Param("record") DictSectionPO record, @Param("example") DictSectionPOExample example);

    int updateByPrimaryKeySelective(DictSectionPO record);

    int updateByPrimaryKey(DictSectionPO record);

    DictSectionVO selectDetailById(@Param("sectionId") Integer sectionId);

    List<DictSectionVO> selectByDto(DictSectionDto dto);

    int updateTotalBerthNo(@Param("sectionId") Integer sectionId);

    List<DictSectionListVO> selectListByDto(DictSectionDto dto);

    List<DictSectionVO> selectListWithParentByDto(DictSectionDto dto);

    List<FindSectionAndParkVO> findSection(FindCantonDto dto);

    List<FindSectionAndParkVO> findParkName(FindCantonDto dto);
}