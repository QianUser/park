package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.config.IpConfiguration;
import com.park.cloud.cms.mapper.OpmPeccancyParkPOMapper;
import com.park.cloud.cms.service.OpmPeccancyParkService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.OpmPeccancyParkDto;
import com.park.cloud.common.domain.params.cms.OpmPeccancyParkAddParams;
import com.park.cloud.common.domain.params.cms.OpmPeccancyParkCancelUploadParams;
import com.park.cloud.common.domain.params.cms.OpmPeccancyParkDeleteParams;
import com.park.cloud.common.domain.params.cms.OpmPeccancyParkSearchParams;
import com.park.cloud.common.domain.po.opm.OpmPeccancyParkPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.OpmPeccancyParkVO;
import javafx.util.Pair;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.net.URL;

/**
 * 违停车辆服务
 *
 * @author qianxiang
 * @create 2020/10/31
 * @since 1.0.0
 */
@Slf4j
@Service
public class OpmPeccancyParkServiceImpl implements OpmPeccancyParkService {

    @Autowired
    private OpmPeccancyParkPOMapper opmPeccancyParkPOMapper;

    @Autowired
    private IpConfiguration ipConfiguration;

    private Pair<String, String> mapping = new Pair<>("/opmPeccancyPark/peccPhoto/", System.getProperty("user.dir").replace("\\", "/") + "/../resource/opmPeccancyPark/peccPhoto/");

    @Override
    public CommonResult add(OpmPeccancyParkAddParams param) {
        OpmPeccancyParkPO po = new OpmPeccancyParkPO();
        BeanUtils.copyProperties(param, po);
        po.setPeccDate(new Date());
        po.setPeccPhotoUrl(urlToData(po.getPeccPhotoUrl()));
        opmPeccancyParkPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    @Override
    public CommonResult<PageHelperVO<OpmPeccancyParkVO>> search(OpmPeccancyParkSearchParams param) {
        OpmPeccancyParkDto dto = new OpmPeccancyParkDto();
        BeanUtils.copyProperties(param, dto);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<OpmPeccancyParkVO> resultList = opmPeccancyParkPOMapper.selectByDto(dto);
        for(OpmPeccancyParkVO vo: resultList) {
            vo.setPeccPhotoUrl(dataToUrl(vo.getPeccPhotoUrl()));
        }
        PageInfo<OpmPeccancyParkVO> pageInfo = new PageInfo<>(resultList);
        PageHelperVO<OpmPeccancyParkVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    @Override
    public CommonResult delete(OpmPeccancyParkDeleteParams param) {
        String data;
        try {
            data = opmPeccancyParkPOMapper.selectByPrimaryKey(param.getPeccParkId()).getPeccPhotoUrl();
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed("数据不存在");
        }
        opmPeccancyParkPOMapper.deleteByPrimaryKey(param.getPeccParkId());
        deletePhotoByData(data);
        return CommonResult.success();
    }

    @Override
    public CommonResult upload(MultipartFile file) {
        if (file == null) {
            return CommonResult.failed("图片不存在");
        }
        String fileName = file.getOriginalFilename();
        int index = fileName.lastIndexOf('.');
        String suffixName = index < 0 ? "" : fileName.substring(index);
        String filePath = mapping.getValue();
        fileName = UUID.randomUUID() + suffixName;
        File dest = new File(filePath, fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return CommonResult.success(dataToUrl(mapping.getKey()) + fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed("获取url失败");
        }
    }

    @Override
    public CommonResult deletePhoto(OpmPeccancyParkCancelUploadParams param) {
        return CommonResult.success(new File(urlToPath(param.getPeccPhotoUrl())).delete() ? "删除成功" : "不存在该图片");
    }

    private void deletePhotoByData(String data) {
        new File(dataToPath(data)).delete();
    }


    private String dataToUrl(String data) {
        if (data == null) {
            return "";
        }
        return ipConfiguration.getAddress() + data;
    }

    private String urlToData(String url) {
        if (url == null) {
            return "";
        }
        try {
            return new URL(url).getPath();
        } catch (Exception e) {
            return "";
        }
    }

    private String dataToPath(String data) {
        if (data == null) {
            return "";
        }
        return data.replaceFirst(mapping.getKey(), mapping.getValue());
    }

    private String urlToPath(String url) {
        return dataToPath(urlToData(url));
    }

}
