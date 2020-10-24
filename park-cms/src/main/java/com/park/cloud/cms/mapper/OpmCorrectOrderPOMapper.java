package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.params.cms.OpmCorrectOrderListParams;
import com.park.cloud.common.domain.po.opm.OpmCorrectOrderPO;
import com.park.cloud.common.domain.po.opm.OpmCorrectOrderPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.OpmCorrectOrderVO;
import org.apache.ibatis.annotations.Param;

public interface OpmCorrectOrderPOMapper {
    long countByExample(OpmCorrectOrderPOExample example);

    int deleteByExample(OpmCorrectOrderPOExample example);

    int deleteByPrimaryKey(Integer correctId);

    int insert(OpmCorrectOrderPO record);

    int insertSelective(OpmCorrectOrderPO record);

    List<OpmCorrectOrderPO> selectByExample(OpmCorrectOrderPOExample example);

    OpmCorrectOrderPO selectByPrimaryKey(Integer correctId);

    int updateByExampleSelective(@Param("record") OpmCorrectOrderPO record, @Param("example") OpmCorrectOrderPOExample example);

    int updateByExample(@Param("record") OpmCorrectOrderPO record, @Param("example") OpmCorrectOrderPOExample example);

    int updateByPrimaryKeySelective(OpmCorrectOrderPO record);

    int updateByPrimaryKey(OpmCorrectOrderPO record);

    List<OpmCorrectOrderVO> list(OpmCorrectOrderListParams params);
}