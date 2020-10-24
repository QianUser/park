package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysExportDto;
import com.park.cloud.common.domain.po.sys.SysExportPO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysExportMapper {

    List<SysExportPO> selectExport(SysExportDto dto);

    void insertExport(SysExportPO exportPO);

    void delete(SysExportDto dto);

    void deleteBatch(SysExportDto dto);

    SysExportPO selectExportById(Integer exportId);

    List<SysExportPO> selectExportByIds(List<Integer> exportIds);

    void updateExport(SysExportPO exportPO);
}