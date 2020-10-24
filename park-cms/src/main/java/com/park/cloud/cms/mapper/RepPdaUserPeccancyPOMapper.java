package com.park.cloud.cms.mapper;

import java.util.List;

import com.park.cloud.common.domain.dto.cms.RepPdaUserPeccancyDto;
import com.park.cloud.common.domain.po.rep.RepPdaUserPeccancyPO;
import com.park.cloud.common.domain.po.rep.RepPdaUserPeccancyPOExample;
import com.park.cloud.common.domain.vo.cms.RepBerthUseByDayVO;
import com.park.cloud.common.domain.vo.cms.RepPdaUserPeccancyVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RepPdaUserPeccancyPOMapper {
    long countByExample(RepPdaUserPeccancyPOExample example);

    int deleteByExample(RepPdaUserPeccancyPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepPdaUserPeccancyPO record);

    int insertSelective(RepPdaUserPeccancyPO record);

    List<RepPdaUserPeccancyPO> selectByExample(RepPdaUserPeccancyPOExample example);

    RepPdaUserPeccancyPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepPdaUserPeccancyPO record, @Param("example") RepPdaUserPeccancyPOExample example);

    int updateByExample(@Param("record") RepPdaUserPeccancyPO record, @Param("example") RepPdaUserPeccancyPOExample example);

    int updateByPrimaryKeySelective(RepPdaUserPeccancyPO record);

    int updateByPrimaryKey(RepPdaUserPeccancyPO record);

    List<RepPdaUserPeccancyVO> getRepPdaUserPeccancy(RepPdaUserPeccancyDto dto);
}