package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.controller.CmsExportController;
import com.park.cloud.cms.mapper.SysExportMapper;
import com.park.cloud.cms.service.SysExportService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysExportDto;
import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import com.park.cloud.common.domain.params.cms.SysExportParams;
import com.park.cloud.common.domain.po.sys.SysExportPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysExportVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.compress.archivers.zip.Zip64Mode;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 导出记录服务
 *
 * @author zyj
 */
@Service
@Slf4j
public class SysExportServiceImpl implements SysExportService {

    @Autowired
    SysExportMapper sysExportMapper;

    /**
     * 导出记录列表
     */
    @Override
    public CommonResult<PageHelperVO<SysExportVO>> list(CmsPageHelperParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            SysExportDto dto = new SysExportDto();
            BeanUtils.copyProperties(param, dto);
            List<SysExportPO> resultList = sysExportMapper.selectExport(dto);
            PageInfo<SysExportPO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<SysExportVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<SysExportVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (SysExportPO po : resultList) {
                    SysExportVO vo = new SysExportVO();
                    BeanUtils.copyProperties(po, vo);
                    list.add(vo);
                }
            }
            return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("获取导出记录列表失败：", e);
            return CommonResult.failed();
        }
    }

    @Override
    public ResponseEntity<byte[]> download(SysExportParams param, String userAgent) {
        SysExportPO po = sysExportMapper.selectExportById(param.getExportId());
        if (po == null) {
            return null;
        }
        File file = new File(po.getFileUrl());
        log.info("Download file: {}", po.getFileUrl());
        if (file.exists()) {
            // 构建响应
            ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.ok();
            // 文件大小
            bodyBuilder.contentLength(file.length());
            // 二进制数据流
            bodyBuilder.contentType(MediaType.valueOf("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
            // 文件名编码
            try {
                String encodeFileName = URLEncoder.encode(po.getExportContent(), "UTF-8");
                // 设置以附件下载，设置文件名
                if (userAgent.contains("MSIE") || userAgent.contains("Trident") || userAgent.contains("Edge")) {
                    bodyBuilder.header("Content-Disposition", "attachment;filename=" + encodeFileName);
                } else {
                    bodyBuilder.header("Content-Disposition", "attachment;filename*=UTF-8''" + encodeFileName);
                }
                // 直接下载
                return bodyBuilder.body(FileUtils.readFileToByteArray(file));
            } catch (IOException e) {
                log.error("Download error.", e);
            }
        }
        return null;
    }

    @Override
    public CommonResult delete(SysExportParams param) {
        try {
            if (param.getExportId() == null) {
                return CommonResult.failed("参数为空");
            }
            SysExportPO po = sysExportMapper.selectExportById(param.getExportId());
            if (po == null) {
                return CommonResult.failed("导出记录不存在");
            }
            File file = new File(po.getFileUrl());
            if (file.exists()) {
                boolean result = file.delete();
                log.info("Delete the file {}: {}", po.getFileUrl(), result);
            }

            SysExportDto dto = new SysExportDto();
            BeanUtils.copyProperties(param, dto);
            sysExportMapper.delete(dto);
        } catch (Exception e) {
            log.error("Export delete error.", e);
            return CommonResult.failed();
        }
        return CommonResult.success();
    }

    @Override
    public ResponseEntity<byte[]> downloadBatch(SysExportParams param, String userAgent) {
        List<SysExportPO> poList = sysExportMapper.selectExportByIds(param.getExportIds());

        String fileName = System.currentTimeMillis() + ".zip";
        File zipFile = new File(CmsExportController.EXPORT_PATH + fileName);
        try {
            // 将文件写入压缩包
            if (!zipFile.createNewFile()) {
                return null;
            }
            ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(zipFile);
            zipArchiveOutputStream.setUseZip64(Zip64Mode.AsNeeded);
            for (SysExportPO po : poList) {
                File file = new File(po.getFileUrl());
                //将每个文件用ZipArchiveEntry封装，使用ZipArchiveOutputStream写到压缩文件
                ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry(file, file.getName());
                zipArchiveOutputStream.putArchiveEntry(zipArchiveEntry);
                InputStream inputStream = new FileInputStream(file);
                byte[] buffer = new byte[1024 * 5];
                int len = -1;
                while ((len = inputStream.read(buffer)) != -1) {
                    //把缓冲区的字节写入到ZipArchiveEntry
                    zipArchiveOutputStream.write(buffer, 0, len);
                }
            }
            zipArchiveOutputStream.closeArchiveEntry();
            zipArchiveOutputStream.finish();
        } catch (IOException e) {
            log.error("Download batch zip error.", e);
        }

        if (zipFile.exists()) {
            // 下载压缩文件
            // 构建响应
            ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.ok();
            // 文件大小
            bodyBuilder.contentLength(zipFile.length());
            // 二进制数据流
            bodyBuilder.contentType(MediaType.valueOf("application/zip"));
            // 文件名编码
            try {
                String encodeFileName = URLEncoder.encode(fileName, "UTF-8");
                // 设置以附件下载，设置文件名
                if (userAgent.contains("MSIE") || userAgent.contains("Trident") || userAgent.contains("Edge")) {
                    bodyBuilder.header("Content-Disposition", "attachment;filename=" + encodeFileName);
                } else {
                    bodyBuilder.header("Content-Disposition", "attachment;filename*=UTF-8''" + encodeFileName);
                }

                // 直接下载
                return bodyBuilder.body(FileUtils.readFileToByteArray(zipFile));
            } catch (IOException e) {
                log.error("Download error.", e);
            } finally {
                boolean result = zipFile.delete();
                log.info("Delete the file {}: {}", fileName, result);
            }
        }
        return null;
    }

    @Override
    public CommonResult deleteBatch(SysExportParams param) {
        try {
            if (CollectionUtils.isEmpty(param.getExportIds())) {
                return CommonResult.failed("参数为空");
            }
            List<SysExportPO> poList = sysExportMapper.selectExportByIds(param.getExportIds());
            if (CollectionUtils.isEmpty(poList)) {
                return CommonResult.failed("导出记录不存在");
            }
            for (SysExportPO po : poList) {
                File file = new File(po.getFileUrl());
                if (file.exists()) {
                    boolean result = file.delete();
                    log.info("Delete the file {}: {}", po.getFileUrl(), result);
                } else {
                    log.info("{} not exist.", po.getFileUrl());
                }
            }

            SysExportDto dto = new SysExportDto();
            BeanUtils.copyProperties(param, dto);
            sysExportMapper.deleteBatch(dto);
        } catch (Exception e) {
            log.error("Export deleteBatch error.", e);
            return CommonResult.failed();
        }
        return CommonResult.success();
    }

    @Override
    public void insertExport(SysExportPO exportPO) {
        sysExportMapper.insertExport(exportPO);
    }

    @Override
    public void updateExport(SysExportPO exportPO) {
        sysExportMapper.updateExport(exportPO);
    }
}