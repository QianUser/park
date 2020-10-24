package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysPositionDto;
import com.park.cloud.common.domain.po.sys.SysPositionPO;
import com.park.cloud.common.domain.po.sys.SysPositionPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.SysPositionListVO;
import com.park.cloud.common.domain.vo.cms.SysPositionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysPositionPOMapper {
    long countByExample(SysPositionPOExample example);

    int deleteByExample(SysPositionPOExample example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(SysPositionPO record);

    int insertSelective(SysPositionPO record);

    List<SysPositionPO> selectByExample(SysPositionPOExample example);

    SysPositionPO selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") SysPositionPO record, @Param("example") SysPositionPOExample example);

    int updateByExample(@Param("record") SysPositionPO record, @Param("example") SysPositionPOExample example);

    int updateByPrimaryKeySelective(SysPositionPO record);

    int updateByPrimaryKey(SysPositionPO record);

    List<SysPositionVO> selectByDto(SysPositionDto dto);

    List<SysPositionListVO> selectListByDto(SysPositionDto dto);
}