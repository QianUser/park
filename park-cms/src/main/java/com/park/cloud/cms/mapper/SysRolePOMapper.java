package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysRoleDto;
import com.park.cloud.common.domain.po.sys.SysRolePO;
import com.park.cloud.common.domain.po.sys.SysRolePOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.SysRoleListVO;
import com.park.cloud.common.domain.vo.cms.SysRoleVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysRolePOMapper {
    long countByExample(SysRolePOExample example);

    int deleteByExample(SysRolePOExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(SysRolePO record);

    int insertSelective(SysRolePO record);

    List<SysRolePO> selectByExample(SysRolePOExample example);

    SysRolePO selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") SysRolePO record, @Param("example") SysRolePOExample example);

    int updateByExample(@Param("record") SysRolePO record, @Param("example") SysRolePOExample example);

    int updateByPrimaryKeySelective(SysRolePO record);

    int updateByPrimaryKey(SysRolePO record);

    List<SysRoleVO> selectByDto(SysRoleDto dto);

    List<SysRoleListVO> selectListByDto(SysRoleDto dto);
}