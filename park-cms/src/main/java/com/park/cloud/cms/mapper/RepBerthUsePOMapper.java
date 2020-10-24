package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.RepBerthUseByDayDto;
import com.park.cloud.common.domain.po.rep.RepBerthUsePO;
import com.park.cloud.common.domain.po.rep.RepBerthUsePOExample;
import com.park.cloud.common.domain.vo.cms.RepBerthUseByDayVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RepBerthUsePOMapper {
    long countByExample(RepBerthUsePOExample example);

    int deleteByExample(RepBerthUsePOExample example);

    int deleteByPrimaryKey(Integer berthUseId);

    int insert(RepBerthUsePO record);

    int insertSelective(RepBerthUsePO record);

    List<RepBerthUsePO> selectByExample(RepBerthUsePOExample example);

    RepBerthUsePO selectByPrimaryKey(Integer berthUseId);

    int updateByExampleSelective(@Param("record") RepBerthUsePO record, @Param("example") RepBerthUsePOExample example);

    int updateByExample(@Param("record") RepBerthUsePO record, @Param("example") RepBerthUsePOExample example);

    int updateByPrimaryKeySelective(RepBerthUsePO record);

    int updateByPrimaryKey(RepBerthUsePO record);

    List<RepBerthUseByDayVO> getRepBerthUse(RepBerthUseByDayDto dto);
}