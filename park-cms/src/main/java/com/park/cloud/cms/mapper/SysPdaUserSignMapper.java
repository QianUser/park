package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysPdaUserSignDto;
import com.park.cloud.common.domain.po.sys.SysPdaUserSignPO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysPdaUserSignMapper {

    List<SysPdaUserSignPO> selectUserSign(SysPdaUserSignDto dto);

}