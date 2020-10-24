package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysPdaUserScheduleDetailDto;
import com.park.cloud.common.domain.dto.cms.SysPdaUserScheduleDto;
import com.park.cloud.common.domain.po.sys.SysPdaUserScheduleDetailPO;
import com.park.cloud.common.domain.po.sys.SysPdaUserSchedulePO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysPdaUserScheduleMapper {

    void insertSelective(SysPdaUserSchedulePO po);

    void deleteByPrimaryKey(SysPdaUserScheduleDetailPO po);

    List<SysPdaUserSchedulePO> selectUserSchedule(SysPdaUserScheduleDto dto);

    List<SysPdaUserScheduleDetailPO> selectUserScheduleDetail(SysPdaUserScheduleDetailDto dto);
}