package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.CmsMebUserDto;
import com.park.cloud.common.domain.po.meb.MebUserPO;
import com.park.cloud.common.domain.po.meb.MebUserPOExample;
import com.park.cloud.common.domain.vo.cms.CmsMebUserVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MebUserPOMapper {
    long countByExample(MebUserPOExample example);

    int deleteByExample(MebUserPOExample example);

    int deleteByPrimaryKey(Integer mebUserId);

    int insert(MebUserPO record);

    int insertSelective(MebUserPO record);

    List<MebUserPO> selectByExample(MebUserPOExample example);

    MebUserPO selectByPrimaryKey(Integer mebUserId);

    int updateByExampleSelective(@Param("record") MebUserPO record, @Param("example") MebUserPOExample example);

    int updateByExample(@Param("record") MebUserPO record, @Param("example") MebUserPOExample example);

    int updateByPrimaryKeySelective(MebUserPO record);

    int updateByPrimaryKey(MebUserPO record);

    List<CmsMebUserVO> selectByDto(CmsMebUserDto dto);
}