package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysCompanyDto;
import com.park.cloud.common.domain.po.sys.SysCompanyPO;
import com.park.cloud.common.domain.po.sys.SysCompanyPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.SysCompanyListVO;
import com.park.cloud.common.domain.vo.cms.SysCompanyVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysCompanyPOMapper {
    long countByExample(SysCompanyPOExample example);

    int deleteByExample(SysCompanyPOExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(SysCompanyPO record);

    int insertSelective(SysCompanyPO record);

    List<SysCompanyPO> selectByExample(SysCompanyPOExample example);

    SysCompanyPO selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") SysCompanyPO record, @Param("example") SysCompanyPOExample example);

    int updateByExample(@Param("record") SysCompanyPO record, @Param("example") SysCompanyPOExample example);

    int updateByPrimaryKeySelective(SysCompanyPO record);

    int updateByPrimaryKey(SysCompanyPO record);

    List<SysCompanyVO> selectByDto(SysCompanyDto dto);

    List<SysCompanyListVO> selectListByDto(SysCompanyDto dto);
}