package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.MebMerchantInfoPOMapper;
import com.park.cloud.cms.mapper.SysUserPOMapper;
import com.park.cloud.cms.service.MebMerchantInfoService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.CommonRuntimeException;
import com.park.cloud.common.domain.dto.cms.MebMerchantDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.meb.MebMerchantInfoPO;
import com.park.cloud.common.domain.po.meb.MebMerchantInfoPOExample;
import com.park.cloud.common.domain.po.sys.SysUserPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MebMerchantVO;
import com.park.cloud.common.util.ApiStringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * 商户服务
 *
 * @author liyj
 * @create 2020/1/21
 * @since 1.0.0
 */
@Service
@Slf4j
public class MebMerchantInfoServiceImpl implements MebMerchantInfoService {

    @Autowired
    MebMerchantInfoPOMapper mebMerchantInfoPOMapper;

    @Autowired
    SysUserPOMapper userPOMapper;

    /**
     * 添加商户接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(MebMerchantAddParams param) {
        this.checkMUid(param.getMUid(), null);

        //生成商户编号
        String mInfoCode = "m" + System.currentTimeMillis() + ApiStringUtil.getRandomNum(6);
        MebMerchantInfoPO po = new MebMerchantInfoPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setMInfoCode(mInfoCode);
        mebMerchantInfoPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新商户接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(MebMerchantUpdateParams param) {
        this.checkMUid(param.getMUid(), param.getMid());

        MebMerchantInfoPO po = new MebMerchantInfoPO();
        BeanUtils.copyProperties(param, po);
        mebMerchantInfoPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 商户详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<MebMerchantVO> detail(MebMerchantDetailParams param) {
        MebMerchantInfoPO po = mebMerchantInfoPOMapper.selectByPrimaryKey(param.getMid());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        MebMerchantVO vo = new MebMerchantVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 商户删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(MebMerchantDeleteParams param) {
        mebMerchantInfoPOMapper.deleteByPrimaryKey(param.getMid());
        return CommonResult.success();
    }

    /**
     * 搜索商户接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<MebMerchantVO>> search(MebMerchantSearchParams param) {
        MebMerchantDto dto = new MebMerchantDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<MebMerchantVO> resultList = mebMerchantInfoPOMapper.selectByDto(dto);
        PageInfo<MebMerchantVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<MebMerchantVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    @Override
    public CommonResult<List<MebMerchantVO>> list(MebMerchantSearchParams param) {
        MebMerchantDto dto = new MebMerchantDto();
        BeanUtils.copyProperties(param, dto);
        List<MebMerchantVO> resultList = mebMerchantInfoPOMapper.selectByDto(dto);
        return CommonResult.success(resultList);
     }

    /**
     * 检查登陆账号是否存在
     * 不能与sys_user表重复
     *
     * @param mUid
     * @param mid
     * @return
     */
    private void checkMUid(String mUid, Integer mid) {
        if(StringUtils.isEmpty(mUid)) {
            return;
        }
        SysUserPOExample example = new SysUserPOExample();
        example.createCriteria().andUserNameEqualTo(mUid);

        if (userPOMapper.countByExample(example) > 0) {
            throw new CommonRuntimeException("登录账号不能与系统人员账号重复");
        }

        MebMerchantInfoPOExample merchantInfoPOExample = new MebMerchantInfoPOExample();
        MebMerchantInfoPOExample.Criteria criteria = merchantInfoPOExample.createCriteria().andMUidEqualTo(mUid);
        if (mid != null) {
            criteria.andMidNotEqualTo(mid);
        }
        if(mebMerchantInfoPOMapper.countByExample(merchantInfoPOExample) > 0) {
            throw new CommonRuntimeException("登录账号重复");
        }
    }

}