package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysAreaAssDto;
import com.park.cloud.common.domain.po.sys.SysAreaAssPO;
import com.park.cloud.common.domain.po.sys.SysAreaAssPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.SysAreaAssVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysAreaAssPOMapper {
    long countByExample(SysAreaAssPOExample example);

    int deleteByExample(SysAreaAssPOExample example);

    int deleteByPrimaryKey(Integer areaassId);

    int insert(SysAreaAssPO record);

    int insertSelective(SysAreaAssPO record);

    List<SysAreaAssPO> selectByExample(SysAreaAssPOExample example);

    SysAreaAssPO selectByPrimaryKey(Integer areaassId);

    int updateByExampleSelective(@Param("record") SysAreaAssPO record, @Param("example") SysAreaAssPOExample example);

    int updateByExample(@Param("record") SysAreaAssPO record, @Param("example") SysAreaAssPOExample example);

    int updateByPrimaryKeySelective(SysAreaAssPO record);

    int updateByPrimaryKey(SysAreaAssPO record);

    List<SysAreaAssVO> selectByDto(SysAreaAssDto dto);
}