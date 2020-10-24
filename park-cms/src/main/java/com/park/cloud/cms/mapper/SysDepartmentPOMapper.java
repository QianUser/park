package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysDepartmentDto;
import com.park.cloud.common.domain.po.sys.SysDepartmentPO;
import com.park.cloud.common.domain.po.sys.SysDepartmentPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.SysDepartmentListVO;
import com.park.cloud.common.domain.vo.cms.SysDepartmentVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysDepartmentPOMapper {
    long countByExample(SysDepartmentPOExample example);

    int deleteByExample(SysDepartmentPOExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(SysDepartmentPO record);

    int insertSelective(SysDepartmentPO record);

    List<SysDepartmentPO> selectByExample(SysDepartmentPOExample example);

    SysDepartmentPO selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") SysDepartmentPO record, @Param("example") SysDepartmentPOExample example);

    int updateByExample(@Param("record") SysDepartmentPO record, @Param("example") SysDepartmentPOExample example);

    int updateByPrimaryKeySelective(SysDepartmentPO record);

    int updateByPrimaryKey(SysDepartmentPO record);

    List<SysDepartmentVO> selectByDto(SysDepartmentDto dto);

    List<SysDepartmentListVO> selectListByDto(SysDepartmentDto dto);
}