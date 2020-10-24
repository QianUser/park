package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.SysPdaUserTeamBerthDto;
import com.park.cloud.common.domain.dto.cms.SysPdaUserTeamDto;
import com.park.cloud.common.domain.po.sys.SysPdaUserTeamBerthPO;
import com.park.cloud.common.domain.po.sys.SysPdaUserTeamPO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamBerthVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamListVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysPdaUserTeamMapper {

    List<SysPdaUserTeamPO> selectUserTeam(SysPdaUserTeamDto dto);

    void insertSelective(SysPdaUserTeamPO po);

    void updateByPrimaryKeySelective(SysPdaUserTeamPO po);

    SysPdaUserTeamPO selectByPrimaryKey(SysPdaUserTeamDto dto);

    void deleteByPrimaryKey(SysPdaUserTeamPO po);

    List<SysPdaUserTeamListVO> selectListByDto(SysPdaUserTeamDto dto);

    List<SysPdaUserTeamBerthVO> selectUserTeamBerth(SysPdaUserTeamBerthDto dto);

    int selectOtherTeam(SysPdaUserTeamBerthDto dto);

    void deleteTeamBerth(SysPdaUserTeamBerthDto dto);

    void insertTeamBerth(SysPdaUserTeamBerthPO po);
}