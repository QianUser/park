package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.OpmPeccancyParkAddParams;
import com.park.cloud.common.domain.params.cms.OpmPeccancyParkCancelUploadParams;
import com.park.cloud.common.domain.params.cms.OpmPeccancyParkDeleteParams;
import com.park.cloud.common.domain.params.cms.OpmPeccancyParkSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.OpmPeccancyParkVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * 违停车辆服务
 *
 * @author qianxiang
 * @create 2020/10/31
 * @since 1.0.0
 */
public interface OpmPeccancyParkService {

    /**
     * 违停车辆添加接口
     * @param param
     * @return
     */
    CommonResult add(OpmPeccancyParkAddParams param);

    /**
     * 违停车辆搜索接口
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<OpmPeccancyParkVO>> search(OpmPeccancyParkSearchParams param);

    /**
     * 违停车辆删除接口
     * @param param
     * @return
     */
    CommonResult delete(OpmPeccancyParkDeleteParams param);

    /**
     * 违停现场照片上传接口
     * @param file
     * @return
     */
    CommonResult upload(MultipartFile file);

    /**
     * 违停现场照片删除接口
     * @param param
     * @return
     */
    CommonResult deletePhoto(OpmPeccancyParkCancelUploadParams param);

}
