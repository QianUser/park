package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictSpecialListDto;
import com.park.cloud.common.domain.po.dict.DictSpecialListPO;
import com.park.cloud.common.domain.po.dict.DictSpecialListPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.DictSpecialListVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DictSpecialListPOMapper {
    long countByExample(DictSpecialListPOExample example);

    int deleteByExample(DictSpecialListPOExample example);

    int deleteByPrimaryKey(Integer specialListId);

    int insert(DictSpecialListPO record);

    int insertSelective(DictSpecialListPO record);

    List<DictSpecialListPO> selectByExample(DictSpecialListPOExample example);

    DictSpecialListPO selectByPrimaryKey(Integer specialListId);

    int updateByExampleSelective(@Param("record") DictSpecialListPO record, @Param("example") DictSpecialListPOExample example);

    int updateByExample(@Param("record") DictSpecialListPO record, @Param("example") DictSpecialListPOExample example);

    int updateByPrimaryKeySelective(DictSpecialListPO record);

    int updateByPrimaryKey(DictSpecialListPO record);

    List<DictSpecialListVO> selectByDto(DictSpecialListDto dto);
}