package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.params.cms.PeccancyFineSearchParams;
import com.park.cloud.common.domain.po.opm.OpmPeccancyFinePO;
import com.park.cloud.common.domain.po.opm.OpmPeccancyFinePOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.PeccancyFineSearchVO;
import org.apache.ibatis.annotations.Param;

public interface OpmPeccancyFinePOMapper {
    long countByExample(OpmPeccancyFinePOExample example);

    int deleteByExample(OpmPeccancyFinePOExample example);

    int deleteByPrimaryKey(Long peccFineId);

    int insert(OpmPeccancyFinePO record);

    int insertSelective(OpmPeccancyFinePO record);

    List<OpmPeccancyFinePO> selectByExample(OpmPeccancyFinePOExample example);

    OpmPeccancyFinePO selectByPrimaryKey(Long peccFineId);

    int updateByExampleSelective(@Param("record") OpmPeccancyFinePO record, @Param("example") OpmPeccancyFinePOExample example);

    int updateByExample(@Param("record") OpmPeccancyFinePO record, @Param("example") OpmPeccancyFinePOExample example);

    int updateByPrimaryKeySelective(OpmPeccancyFinePO record);

    int updateByPrimaryKey(OpmPeccancyFinePO record);

    List<PeccancyFineSearchVO> search(PeccancyFineSearchParams params);
}