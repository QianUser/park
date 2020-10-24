package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysPdaUserDto;
import com.park.cloud.common.domain.po.sys.SysPdaUserPO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysPdaUserMapper {

    List<SysPdaUserPO> selectUser(SysPdaUserDto dto);

    void insertSelective(SysPdaUserPO po);

    void updateByPrimaryKeySelective(SysPdaUserPO po);

    SysPdaUserPO selectByPrimaryKey(SysPdaUserDto dto);

    void deleteByPrimaryKey(SysPdaUserPO po);

}