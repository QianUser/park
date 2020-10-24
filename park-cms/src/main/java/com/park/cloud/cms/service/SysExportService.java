package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import com.park.cloud.common.domain.params.cms.SysExportParams;
import com.park.cloud.common.domain.po.sys.SysExportPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysExportVO;
import org.springframework.http.ResponseEntity;

/**
 * SysExportService
 * 导出记录服务
 *
 * @author zyj
 * @date 2020/4/9
 */
public interface SysExportService {
    CommonResult<PageHelperVO<SysExportVO>> list(CmsPageHelperParams param);

    ResponseEntity<byte[]> download(SysExportParams param, String userAgent);

    CommonResult delete(SysExportParams param);

    ResponseEntity<byte[]> downloadBatch(SysExportParams param, String userAgent);

    CommonResult deleteBatch(SysExportParams param);

    void insertExport(SysExportPO exportPO);

    void updateExport(SysExportPO exportPO);
}