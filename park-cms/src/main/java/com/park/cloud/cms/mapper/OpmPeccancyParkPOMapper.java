package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.OpmPeccancyParkDto;
import com.park.cloud.common.domain.po.opm.OpmPeccancyParkPO;
import com.park.cloud.common.domain.po.opm.OpmPeccancyParkPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.OpmPeccancyParkVO;
import org.apache.ibatis.annotations.Param;

public interface OpmPeccancyParkPOMapper {

    int countByExample(OpmPeccancyParkPOExample example);

    int deleteByExample(OpmPeccancyParkPOExample example);

    int deleteByPrimaryKey(Integer peccParkId);

    int insert(OpmPeccancyParkPO record);

    int insertSelective(OpmPeccancyParkPO record);

    List<OpmPeccancyParkPO> selectByExample(OpmPeccancyParkPOExample example);

    OpmPeccancyParkPO selectByPrimaryKey(Integer peccParkId);

    int updateByExampleSelective(@Param("record") OpmPeccancyParkPO record, @Param("example") OpmPeccancyParkPOExample example);

    int updateByExample(@Param("record") OpmPeccancyParkPO record, @Param("example") OpmPeccancyParkPOExample example);

    int updateByPrimaryKeySelective(OpmPeccancyParkPO record);

    int updateByPrimaryKey(OpmPeccancyParkPO record);

    List<OpmPeccancyParkVO> selectByDto(OpmPeccancyParkDto dto);

}