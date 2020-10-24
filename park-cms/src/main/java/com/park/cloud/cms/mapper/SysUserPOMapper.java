package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysUserDto;
import com.park.cloud.common.domain.po.sys.SysUserPO;
import com.park.cloud.common.domain.po.sys.SysUserPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.SysUserVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysUserPOMapper {
    long countByExample(SysUserPOExample example);

    int deleteByExample(SysUserPOExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SysUserPO record);

    int insertSelective(SysUserPO record);

    List<SysUserPO> selectByExample(SysUserPOExample example);

    SysUserPO selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SysUserPO record, @Param("example") SysUserPOExample example);

    int updateByExample(@Param("record") SysUserPO record, @Param("example") SysUserPOExample example);

    int updateByPrimaryKeySelective(SysUserPO record);

    int updateByPrimaryKey(SysUserPO record);

    List<SysUserVO> selectByDto(SysUserDto dto);
}