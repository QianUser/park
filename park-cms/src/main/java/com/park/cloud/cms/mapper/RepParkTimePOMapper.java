package com.park.cloud.cms.mapper;

import java.util.List;

import com.park.cloud.common.domain.dto.cms.RepParkByHourTopDto;
import com.park.cloud.common.domain.po.rep.RepParkTimePO;
import com.park.cloud.common.domain.po.rep.RepParkTimePOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RepParkTimePOMapper {
    long countByExample(RepParkTimePOExample example);

    int deleteByExample(RepParkTimePOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepParkTimePO record);

    int insertSelective(RepParkTimePO record);

    List<RepParkTimePO> selectByExample(RepParkTimePOExample example);

    RepParkTimePO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepParkTimePO record, @Param("example") RepParkTimePOExample example);

    int updateByExample(@Param("record") RepParkTimePO record, @Param("example") RepParkTimePOExample example);

    int updateByPrimaryKeySelective(RepParkTimePO record);

    int updateByPrimaryKey(RepParkTimePO record);

    List<RepParkTimePO> findAllData(RepParkByHourTopDto dto);

    Integer findParkCount(RepParkByHourTopDto dto);
}