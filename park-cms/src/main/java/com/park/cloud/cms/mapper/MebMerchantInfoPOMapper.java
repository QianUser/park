package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.MebMerchantDto;
import com.park.cloud.common.domain.po.meb.MebMerchantInfoPO;
import com.park.cloud.common.domain.po.meb.MebMerchantInfoPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.MebMerchantVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface MebMerchantInfoPOMapper {
    long countByExample(MebMerchantInfoPOExample example);

    int deleteByExample(MebMerchantInfoPOExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(MebMerchantInfoPO record);

    int insertSelective(MebMerchantInfoPO record);

    List<MebMerchantInfoPO> selectByExample(MebMerchantInfoPOExample example);

    MebMerchantInfoPO selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") MebMerchantInfoPO record, @Param("example") MebMerchantInfoPOExample example);

    int updateByExample(@Param("record") MebMerchantInfoPO record, @Param("example") MebMerchantInfoPOExample example);

    int updateByPrimaryKeySelective(MebMerchantInfoPO record);

    int updateByPrimaryKey(MebMerchantInfoPO record);

    List<MebMerchantVO> selectByDto(MebMerchantDto dto);
}