package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysPdaUserSignMapper;
import com.park.cloud.cms.service.SysPdaUserSignService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysPdaUserSignDto;
import com.park.cloud.common.domain.params.cms.SysPdaUserSignListParams;
import com.park.cloud.common.domain.params.cms.SysPdaUserSignSearchParams;
import com.park.cloud.common.domain.po.sys.SysPdaUserSignPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserSignListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserSignVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 签到信息服务
 *
 * @author zyj
 * @date 2020/2/25
 */
@Service
@Slf4j
public class SysPdaUserSignServiceImpl implements SysPdaUserSignService {

    @Autowired
    SysPdaUserSignMapper sysPdaUserSignMapper;

    /**
     * 签到列表查询
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysPdaUserSignVO>> search(SysPdaUserSignSearchParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            SysPdaUserSignDto dto = new SysPdaUserSignDto();
            BeanUtils.copyProperties(param, dto);
            List<String> signTime = param.getSignTime();
            if (!CollectionUtils.isEmpty(signTime) && signTime.size() == 2) {
                dto.setSignStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(signTime.get(0)));
                dto.setSignEndTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(signTime.get(1)));
            }
            List<SysPdaUserSignPO> resultList = sysPdaUserSignMapper.selectUserSign(dto);
            PageInfo<SysPdaUserSignPO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<SysPdaUserSignVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<SysPdaUserSignVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (SysPdaUserSignPO po : resultList) {
                    SysPdaUserSignVO vo = new SysPdaUserSignVO();
                    BeanUtils.copyProperties(po, vo);
                    list.add(vo);
                }
            }
        return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("获取签到列表失败：", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<List<SysPdaUserSignListVO>> list(SysPdaUserSignListParams param) {
        return null;
    }

    @Override
    public List<SysPdaUserSignPO> allList(SysPdaUserSignSearchParams param) {
        SysPdaUserSignDto dto = new SysPdaUserSignDto();
        BeanUtils.copyProperties(param, dto);
        return sysPdaUserSignMapper.selectUserSign(dto);
    }
}