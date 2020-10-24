package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysPdaScheduleDto;
import com.park.cloud.common.domain.po.sys.SysPdaSchedulePO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysPdaScheduleMapper {

    List<SysPdaSchedulePO> selectSchedule(SysPdaScheduleDto dto);

    void insertSelective(SysPdaSchedulePO po);

    void updateByPrimaryKeySelective(SysPdaSchedulePO po);

    SysPdaSchedulePO selectByPrimaryKey(SysPdaScheduleDto dto);

    void deleteByPrimaryKey(SysPdaSchedulePO po);
}