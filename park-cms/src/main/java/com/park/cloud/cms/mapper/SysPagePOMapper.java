package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.po.sys.SysPagePO;
import com.park.cloud.common.domain.po.sys.SysPagePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysPagePOMapper {
    long countByExample(SysPagePOExample example);

    int deleteByExample(SysPagePOExample example);

    int deleteByPrimaryKey(Integer pageId);

    int insert(SysPagePO record);

    int insertSelective(SysPagePO record);

    List<SysPagePO> selectByExample(SysPagePOExample example);

    SysPagePO selectByPrimaryKey(Integer pageId);

    int updateByExampleSelective(@Param("record") SysPagePO record, @Param("example") SysPagePOExample example);

    int updateByExample(@Param("record") SysPagePO record, @Param("example") SysPagePOExample example);

    int updateByPrimaryKeySelective(SysPagePO record);

    int updateByPrimaryKey(SysPagePO record);
}