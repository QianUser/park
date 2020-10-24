package com.park.cloud.cms.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.park.cloud.cms.feign.*;
import com.park.cloud.cms.service.*;
import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.params.order.TraBargainOrderListParams;
import com.park.cloud.common.domain.params.order.TraCouponPurchaseParams;
import com.park.cloud.common.domain.params.order.TraCouponUsageRecordParams;
import com.park.cloud.common.domain.params.order.TraUserCouponParams;
import com.park.cloud.common.domain.params.user.InvEinvoiceListPasrams;
import com.park.cloud.common.domain.params.user.OutsideListParams;
import com.park.cloud.common.domain.po.dict.DictLongParkingPO;
import com.park.cloud.common.domain.po.sys.SysExportPO;
import com.park.cloud.common.domain.po.sys.SysPdaUserPO;
import com.park.cloud.common.domain.po.sys.SysPdaUserSignPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
import com.park.cloud.common.domain.vo.order.*;
import com.park.cloud.common.domain.vo.user.DacImportRecordVO;
import com.park.cloud.common.domain.vo.user.ExportEinvoiceListVO;
import com.park.cloud.common.domain.vo.user.InvEinvoiceListVO;
import com.park.cloud.common.domain.vo.user.OutsideListVO;
import com.park.cloud.common.util.DatetimeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <Description>
 *
 * @author liuhainan
 */
@Api(value = "CmsExportController", tags = {"数据导出接口"})
@RestController
@RequestMapping(value = "cmsExport")
@Validated
@Slf4j
public class CmsExportController {
    public static final String EXPORT_PATH = "/home/work/park/export/";

    private static final BigDecimal EXPORTING = new BigDecimal("50");

    @Autowired
    private SysExportService sysExportService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private TraCouponPurchaseService purchaseService;

    @Autowired
    private SysPdaUserService sysPdaUserService;

    @Autowired
    private SysPdaUserSignService sysPdaUserSignService;

    @Autowired
    private DictLongParkingService dictLongParkingService;
    @Autowired
    private ParkClearingService parkClearingService;
    @Autowired
    private  RepParkFinanceByDayService repParkFinanceByDayService;
    @Autowired
    private  RepParkRefundByDayService repParkRefundByDayService;
    @Autowired
    private  RepParkOperateByMonthService repParkOperateByMonthService;
    @Autowired
    private  RepParkOperateService repParkOperateService;
    @Autowired
    private RepPdaUserPeccancyService repPdaUserPeccancyService;
    @Autowired
    private  RepBerthUseByDayService repBerthUseByDayService;
    @Autowired
    private SysAreaAssService areaAssService;
    @Autowired
    private OpmCorrectOrderService correctOrderService;
    @Autowired
    private TraRefundOrderService refundOrderService;
    @Autowired
    private DacImportRecordService importRecordService;
    @Autowired
    private CmsMebUserService  mebUserService;
    @Autowired
    private InvEinvoiceService einvoiceService;
    @Autowired
    private TraUserCouponService couponService;
    @Autowired
    private TraCouponUsageRecordService usageRecordService;
    @Autowired
    private IQSMonthCardService iqsMonthCardService;
    @Autowired
    private IQSCarplatRegistHostelService qsCarplatRegistHostelService;

    @PostMapping(value = "exporInside")
    @ApiOperation(value = "路内交易订单记录导出", notes = "路内交易订单记录导出(分页信息不用传)")
    public CommonResult exporInside(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params) {

        String fileName = "路内订单记录" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("路内订单-交易订单");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);

        try{

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            CommonResult<List<BargainOrderVO>> result = orderService.insideAllList(params);
            if (result.getCode() != Constants.SUCCESS_CODE) {
                return result;
            }
            List<BargainOrderExportVO> exporVo = new ArrayList<>();
            List<BargainOrderVO> data = result.getData();
            if (Objects.nonNull(data) && data.size() > 0) {
                data.forEach(a -> {
                    BargainOrderExportVO vo = new BargainOrderExportVO();
                    BeanUtils.copyProperties(a, vo);
                    exporVo.add(vo);
                });

                ExcelWriter excelWriter = EasyExcel.write(name, BargainOrderExportVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "路内订单记录").head(BargainOrderExportVO.class).build();
                excelWriter.write(exporVo, writeSheetTemp);
                excelWriter.finish();
            }
            exportPO.setExportProgress(BigDecimal.valueOf(100));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporInside error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }


    }

    @PostMapping(value = "exporCouponPurchase")
    @ApiOperation(value = "优惠券购买记录导出", notes = "优惠券购买记录导出(分页信息不用传)")
    public CommonResult exporCouponPurchase(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraCouponPurchaseParams params) {
        String fileName = "优惠券购买记录" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("优惠券管理-优惠券购买记录");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            CommonResult<List<CouponPurchaseVO>> result = purchaseService.allList(params);

            if (result.getCode() != Constants.SUCCESS_CODE) {
                return result;
            }
            List<CouponPurchaseExporVO> exporVo = new ArrayList<>();
            List<CouponPurchaseVO> data = result.getData();
            if (Objects.nonNull(data) && data.size() > 0) {
                data.forEach(a -> {
                    CouponPurchaseExporVO vo = new CouponPurchaseExporVO();
                    BeanUtils.copyProperties(a, vo);
                    exporVo.add(vo);
                });

                ExcelWriter excelWriter = EasyExcel.write(name, CouponPurchaseExporVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "优惠券购买记录").head(CouponPurchaseExporVO.class).build();
                excelWriter.write(exporVo, writeSheetTemp);
                excelWriter.finish();
            }
            exportPO.setExportProgress(BigDecimal.valueOf(100));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporCouponPurchase error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping(value = "exportSysPdaUser")
    @ApiOperation(value = "巡检员导出", notes = "巡检员导出")
    public CommonResult exportSysPdaUser(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) SysPdaUserSearchParams param) {
        String fileName = "巡检员" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("排班管理-巡检员管理");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            List<SysPdaUserPO> result = sysPdaUserService.allList(param);

            List<SysPdaUserExportVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(result)) {
                result.forEach(po -> {
                    SysPdaUserExportVO vo = new SysPdaUserExportVO();
                    BeanUtils.copyProperties(po, vo);
                    vo.setPdsUserStatusStr(po.getPdaUserStatus());
                    exportVO.add(vo);
                });
            }
                ExcelWriter excelWriter = EasyExcel.write(name, SysPdaUserExportVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "巡检员").head(SysPdaUserExportVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));

            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportSysPdaUser error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping(value = "exportSysPdaUserSign")
    @ApiOperation(value = "签到信息导出", notes = "签到信息导出")
    public CommonResult exportSysPdaUserSign(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) SysPdaUserSignSearchParams param) {
        String fileName = "签到信息" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("排班管理-签到信息");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            List<SysPdaUserSignPO> result = sysPdaUserSignService.allList(param);

            List<SysPdaUserSignExportVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(result)) {
                result.forEach(po -> {
                    SysPdaUserSignExportVO vo = new SysPdaUserSignExportVO();
                    BeanUtils.copyProperties(po, vo);
                    vo.setSignTypeStr(po.getSignType());
                    vo.setSignResultStr(po.getSignResult());
                    exportVO.add(vo);
                });
            }
                ExcelWriter excelWriter = EasyExcel.write(name, SysPdaUserExportVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "签到信息").head(SysPdaUserSignExportVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));

            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportSysPdaUserSign error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping(value = "exportDictLongParking")
    @ApiOperation(value = "僵尸车导出", notes = "僵尸车导出")
    public CommonResult exportDictLongParking(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) DictLongParkingSearchParams param) {
        String fileName = "僵尸车" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("实时记录-僵尸车查询");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            List<DictLongParkingPO> result = dictLongParkingService.allList(param);
            result.removeAll(Collections.singleton(null));
            List<DictLongParkingExportVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(result)) {
                result.forEach(po -> {
                    DictLongParkingExportVO vo = new DictLongParkingExportVO();
                    BeanUtils.copyProperties(po, vo);
                    vo.setParkingTypeStr(po.getParkingType());
                    vo.setPlateTypeStr(po.getPlateType());
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, DictLongParkingExportVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "僵尸车").head(DictLongParkingExportVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportDictLongParking error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }



    @PostMapping(value = "exporParkClearing")
    @ApiOperation(value = "清分结算导出", notes = "清分结算导出")
    public CommonResult exporParkClearing(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) ParkClearingCountParams param) {
        String fileName = "清分结算" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-清分结算");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            CommonResult<List<ParkClearingPageVO>> result = parkClearingService.getALLParkClearing(param,false);
                  if (result.getCode()!=Constants.SUCCESS_CODE){
                      return result;
                  }
            List<ParkClearingPageVO> list = result.getData();
            List<ParkClearingPageExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    ParkClearingPageExporVO vo = new ParkClearingPageExporVO();
                    BeanUtils.copyProperties(po, vo);
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, ParkClearingPageVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "清分结算").head(ParkClearingPageExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporParkClearing error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "exporRepParkFinanceByDay")
    @ApiOperation(value = "财务总报表导出", notes = "财务总报表导出")
    public CommonResult exporRepParkFinanceByDay(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepParkFinanceByDayParams param) {
        String fileName = "财务总报表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-财务总报表");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            CommonResult<PageHelperVO<RepParkFinanceByDayPageVO>> result = repParkFinanceByDayService.getRepParkFinance(param);
             if (result.getCode()!=Constants.SUCCESS_CODE){
                 return result;
             }
            List<RepParkFinanceByDayPageVO> list = result.getData().getList();
            List<RepParkFinanceByDayPageExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    RepParkFinanceByDayPageExporVO vo = new RepParkFinanceByDayPageExporVO();
                    BeanUtils.copyProperties(po, vo);
                    if (po.getPayType()!=null){
                        vo.setPayTypeStr(po.getPayType());
                    }
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepParkFinanceByDayPageVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "财务总报表").head(RepParkFinanceByDayPageExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporRepParkFinanceByDay error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "exporRepParkFinanceDetails")
    @ApiOperation(value = "财务总报表详情导出", notes = "财务总报表详情导出")
    public CommonResult exporRepParkFinanceDetails(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepParkFinanceDetailsParams param) {
        String fileName = "财务总报表详情" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-财务总报表详情");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            CommonResult<List<RepParkFinanceDetailsVO>> result = repParkFinanceByDayService.detailsAllList(param,false);
             if (result.getCode()!=Constants.SUCCESS_CODE){
                 return result;
             }
            List<RepParkFinanceDetailsVO> list = result.getData();

            List<RepParkFinanceDetailsExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    RepParkFinanceDetailsExporVO vo = new RepParkFinanceDetailsExporVO();
                    BeanUtils.copyProperties(po, vo);
                    if (po.getPayType()!=null){
                        vo.setPayTypeStr(po.getPayType());
                    }
                    if (po.getPayPrice()!=null&&po.getPayPrice()>0){
                        BigDecimal decimal1 = new BigDecimal(po.getPayPrice());
                        BigDecimal decimal2 = new BigDecimal(100);
                        vo.setPayPrice(decimal1.divide(decimal2,2, RoundingMode.HALF_UP));
                    }else{
                        vo.setPayPrice(new BigDecimal(0));
                    }
                    if (po.getRefundPrice()!=null&&po.getRefundPrice()>0){
                        BigDecimal decimal1 = new BigDecimal(po.getRefundPrice());
                        BigDecimal decimal2 = new BigDecimal(100);
                        vo.setRefundPrice(decimal1.divide(decimal2,2, RoundingMode.HALF_UP));
                    }else{
                        vo.setRefundPrice(new BigDecimal(0));
                    }
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepParkFinanceDetailsExporVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "财务总报表详情").head(RepParkFinanceDetailsExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporRepParkFinanceDetails error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "exporRepParkRefundByDay")
    @ApiOperation(value = "退费报表导出", notes = "退费报表导出")
    public CommonResult exporRepParkRefundByDay(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepParkRefundByDayParams param) {
        String fileName = "退费报表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-退费报表");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            CommonResult<PageHelperVO<RepParkRefundByDayVO>> result = repParkRefundByDayService.getRepParkRefund(param);
                    if (result.getCode()!=Constants.SUCCESS_CODE){
                        return result;
                    }
            List<RepParkRefundByDayVO> list = result.getData().getList();
            List<RepParkRefundByDayEXporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    RepParkRefundByDayEXporVO vo = new RepParkRefundByDayEXporVO();
                    BeanUtils.copyProperties(po, vo);
                    vo.setparkingTypeStr(po.getParkingType());
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepParkRefundByDayVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "退费报表").head(RepParkRefundByDayEXporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporRepParkRefundByDay error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "exporRunStatisticsByMonth")
    @ApiOperation(value = "运营统计分析导出", notes = "运营统计分析导出")
    public CommonResult exporRunStatisticsByMonth(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepRunStatisticsByMonthParams param) {
        String fileName = "运营统计分析" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-运营统计分析");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }

            CommonResult<PageHelperVO<RepRunStatisticsByMonthVO>> result = repParkOperateByMonthService.getRunStatisticsByMonth(param);
            if (result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<RepRunStatisticsByMonthVO> list = result.getData().getList();
            List<RepRunStatisticsByMonthExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    RepRunStatisticsByMonthExporVO vo = new RepRunStatisticsByMonthExporVO();
                    BeanUtils.copyProperties(po, vo);
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepRunStatisticsByMonthVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "运营统计分析").head(RepRunStatisticsByMonthExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporRunStatisticsByMonth error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "exporRepParkOperate")
    @ApiOperation(value = "停车日报表导出", notes = "停车日报表导出")
    public CommonResult exporRepParkOperate(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepParkOperateParams param) {
        String fileName = "停车日报表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-停车日报表");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<PageHelperVO<RepParkOperatePageVO>> result = repParkOperateService.getRepBerthUse(param);
                 if (result.getCode()!=Constants.SUCCESS_CODE){
                     return result;
                 }
            List<RepParkOperatePageVO> list = result.getData().getList();
            List<RepParkOperatePageExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    RepParkOperatePageExporVO vo = new RepParkOperatePageExporVO();
                    BeanUtils.copyProperties(po, vo);
                    if (po.getPayType()!=null){
                        vo.setPayTypeStr(po.getPayType());
                    }
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepParkOperatePageVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "停车日报表").head(RepParkOperatePageExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporRepParkOperate error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "exporRepParkOperateByMonth")
    @ApiOperation(value = "停车月报表导出", notes = "停车月报表导出")
    public CommonResult exporRepParkOperateByMonth(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepParkOperateByMonthParams param) {
        String fileName = "停车月报表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-停车月报表");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<PageHelperVO<RepParkOperateByMonthPageVO>> result = repParkOperateByMonthService.getRepOperateByMonth(param);
            if (result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<RepParkOperateByMonthPageVO> list = result.getData().getList();
            List<RepParkOperateByMonthPageExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    RepParkOperateByMonthPageExporVO vo = new RepParkOperateByMonthPageExporVO();
                    BeanUtils.copyProperties(po, vo);
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepParkOperateByMonthPageVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "停车月报表").head(RepParkOperateByMonthPageExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporRepParkOperateByMonth error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "expordetails")
    @ApiOperation(value = "停车月报表详情导出", notes = "停车月报表详情导出")
    public CommonResult expordetails(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepPerkOperateDetailsParams param) {
        String fileName = "停车月报表详情" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-停车月报表详情");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<PageHelperVO<RepParkOperateDetailsVO>> result = repParkOperateByMonthService.detailsList(param);
          if (result.getCode()!=Constants.SUCCESS_CODE){
                 return result;
          }
            List<RepParkOperateDetailsVO> list = result.getData().getList();
            List<RepParkOperateDetailsExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    RepParkOperateDetailsExporVO vo = new RepParkOperateDetailsExporVO();
                    BeanUtils.copyProperties(po, vo);
                    if (po.getPayType()!=null){
                        vo.setPayTypeStr(po.getPayType());
                    }

                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepParkOperateDetailsVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "停车月报表详情").head(RepParkOperateDetailsExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();

                exportPO.setExportProgress(new BigDecimal("100"));
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("expordetails error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "exporRepBerth")
    @ApiOperation(value = "巡检员派单报表导出", notes = "巡检员派单报表导出")
    public CommonResult exporRepBerth(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepPdaUserPeccancyParams param) {
        String fileName = "巡检员派单报表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-巡检员派单报表");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<PageHelperVO<RepPdaUserPeccancyVO>> result = repPdaUserPeccancyService.getRepPdaUserPeccancy(param);
             if (result.getCode()!=Constants.SUCCESS_CODE){
                 return result;
             }
            List<RepPdaUserPeccancyVO> list = result.getData().getList();

            List<RepPdaUserPeccancyExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(list)) {
                list.forEach(po -> {
                    RepPdaUserPeccancyExporVO vo = new RepPdaUserPeccancyExporVO();
                    BeanUtils.copyProperties(po, vo);
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepPdaUserPeccancyVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "巡检员派单报表").head(RepPdaUserPeccancyExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();
                exportPO.setExportProgress(new BigDecimal("100"));
            }

            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporRepBerth error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }


    @PostMapping(value = "exporParkRepBerth")
    @ApiOperation(value = "路边停车收费率报表导出", notes = "路边停车收费率报表导出")
    public CommonResult exporParkRepBerth(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)RepBerthUseByDayParams param) {
        String fileName = "路边停车收费率报表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-路边停车收费率报表");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(param.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<PageHelperVO<RepBerthUseByDayVO>> result = repBerthUseByDayService.getRepBerthUse(param);
               if (result.getCode()!=Constants.SUCCESS_CODE){
                   return result;
               }
            List<RepBerthUseByDayVO> data = result.getData().getList();
            List<RepBerthUseByDayExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(data)) {
                data.forEach(po -> {
                    RepBerthUseByDayExporVO vo = new RepBerthUseByDayExporVO();
                    BeanUtils.copyProperties(po, vo);
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, RepBerthUseByDayVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "路边停车收费率报表").head(RepBerthUseByDayExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();


            }
            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporParkRepBerth error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exporSelfParkingArrears")
    @ApiOperation(value = "自泊欠费导出", notes = "自泊欠费订单导出(分页信息不用传)")
    public CommonResult<List<BargainOrderVO>> exporSelfParkingArrears(@Valid @RequestBody @ApiParam(name = "参数信息",
            value = "参数实体", required = true) TraBargainOrderListParams params) {
        String fileName = "自泊欠费订单列表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("路内订单-自泊欠费订单");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try{

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            SysAreaAssCacheVO areaAss = areaAssService.getUserAreaAss(params.getLoginSysUserId());
            if(Objects.nonNull(areaAss) && Objects.nonNull(areaAss.getAreaAssType())){
                setAreaAss(areaAss,params);
                CommonResult<List<BargainOrderVO>> result = orderService.insideAllList(params);
                if (result.getCode() != Constants.SUCCESS_CODE) {
                    return result;
                }
                List<BargainOrderVO> data = result.getData();
                List<SelfParkingExportVO> list = new ArrayList<>();
                if(!CollectionUtils.isEmpty(data)){

                    data.stream().forEach(a->{
                        SelfParkingExportVO parkingExportVO = new SelfParkingExportVO();
                        BeanUtils.copyProperties(a,parkingExportVO);
                        list.add(parkingExportVO);
                    });
                }
                    ExcelWriter excelWriter = EasyExcel.write(name, SelfParkingExportVO.class).build();
                    WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "自泊欠费订单").head(SelfParkingExportVO.class).build();
                    excelWriter.write(list, writeSheetTemp);
                    excelWriter.finish();

                    exportPO.setExportProgress(new BigDecimal("100"));

                    return CommonResult.success();
            }else {
                return CommonResult.failed("用户辖区信息为空！");
            }


        } catch (Exception e) {
            log.error("exporSelfParkingArrears error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exporPDAParkingArrears")
    @ApiOperation(value = "PDA未缴费导出", notes = "PDA未缴费订单导出(分页信息不用传)")
    public CommonResult<List<BargainOrderVO>> exporPDAParkingArrears(@Valid @RequestBody @ApiParam(name = "参数信息",
            value = "参数实体", required = true) TraBargainOrderListParams params) {
        String fileName = "PDA未缴费订单列表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("路内订单-PDA未缴费查询");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try{

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            SysAreaAssCacheVO areaAss = areaAssService.getUserAreaAss(params.getLoginSysUserId());
            if(Objects.nonNull(areaAss) && Objects.nonNull(areaAss.getAreaAssType())){
                setAreaAss(areaAss,params);
                CommonResult<List<BargainOrderVO>> result = orderService.insideAllList(params);
                if (result.getCode() != Constants.SUCCESS_CODE) {
                    return result;
                }
                List<BargainOrderVO> data = result.getData();
                List<PDAParkingExportVO> list = new ArrayList<>();
                if(!CollectionUtils.isEmpty(data)){

                    data.stream().forEach(a->{
                        PDAParkingExportVO parkingExportVO = new PDAParkingExportVO();
                        BeanUtils.copyProperties(a,parkingExportVO);
                        list.add(parkingExportVO);
                    });
                }
                    ExcelWriter excelWriter = EasyExcel.write(name, PDAParkingExportVO.class).build();
                    WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "自泊欠费订单").head(PDAParkingExportVO.class).build();
                    excelWriter.write(list, writeSheetTemp);
                    excelWriter.finish();

                    exportPO.setExportProgress(new BigDecimal("100"));

                    return CommonResult.success();
            }else {
                return CommonResult.failed("用户辖区信息为空！");
            }

        } catch (Exception e) {
            log.error("exporPDAParkingArrears error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportCorrectOrder")
    @ApiOperation(value = "纠错订单导出", notes = "纠错订单导出(分页信息不用传)")
    public CommonResult exportCorrectOrder(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) OpmCorrectOrderListParams params){
        String fileName = "纠错订单列表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("路内订单-纠错订单");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<OpmCorrectOrderVO>> result = correctOrderService.searchList(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<OpmCorrectOrderVO> data = result.getData();
            List<ExportCorrectOrderVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    ExportCorrectOrderVO correctOrderVO = new ExportCorrectOrderVO();
                    BeanUtils.copyProperties(a,correctOrderVO);
                    list.add(correctOrderVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, ExportCorrectOrderVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "纠错订单").head(ExportCorrectOrderVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportCorrectOrder error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportOutSideOrder")
    @ApiOperation(value = "路外订单导出", notes = "路外订单导出(分页信息不用传)")
    public CommonResult exportOutSideOrder(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params){
        String fileName = "路外订单列表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("路内订单-路外订单");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<BargainOrderVO>> result = orderService.outsideAllList(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<BargainOrderVO> data = result.getData();
            List<ExportOutsideOrderVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    ExportOutsideOrderVO outSideOrderVO = new ExportOutsideOrderVO();
                    BeanUtils.copyProperties(a,outSideOrderVO);
                    list.add(outSideOrderVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, ExportOutsideOrderVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "路外订单").head(ExportOutsideOrderVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportOutSideOrder error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportRefundInside")
    @ApiOperation(value = "路内订单退费导出", notes = "路内订单退费导出(分页信息不用传)")
    public CommonResult exportRefundInside(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)TraBargainOrderListParams params){
        String fileName = "路内订单退费列表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("退费管理-路内订单退费");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<RefundBargainOrderVO>> result = refundOrderService.insideAllList(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<RefundBargainOrderVO> data = result.getData();
            List<ExportRefundInsideVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    ExportRefundInsideVO refundInsideVO = new ExportRefundInsideVO();
                    BeanUtils.copyProperties(a,refundInsideVO);
                    list.add(refundInsideVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, ExportRefundInsideVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "路内订单退费").head(ExportRefundInsideVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportRefundInside error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportRefundOutSide")
    @ApiOperation(value = "路外订单退费导出", notes = "路外订单退费导出(分页信息不用传)")
    public CommonResult exportRefundOutSide(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraBargainOrderListParams params){
        String fileName = "路外订单退费列表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("退费管理-路外订单退费");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<RefundBargainOrderVO>> result = refundOrderService.outsideAllList(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<RefundBargainOrderVO> data = result.getData();
            List<ExportRefundOutsideVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    ExportRefundOutsideVO outSideOrderVO = new ExportRefundOutsideVO();
                    BeanUtils.copyProperties(a,outSideOrderVO);
                    list.add(outSideOrderVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, ExportRefundOutsideVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "路外订单退费").head(ExportRefundOutsideVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportRefundOutSide error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportRefundList")
    @ApiOperation(value = "退费订单管理导出", notes = "退费订单管理导出(分页信息不用传)")
    public CommonResult exportRefundList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraRefundOrderParams params){
        String fileName = "退费订单管理列表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("退费管理-退费订单管理");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<TraRefundOrderVO>> result = refundOrderService.listAll(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<TraRefundOrderVO> data = result.getData();
            List<ExportRefundListVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    ExportRefundListVO outSideOrderVO = new ExportRefundListVO();
                    BeanUtils.copyProperties(a,outSideOrderVO);
                    list.add(outSideOrderVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, ExportRefundListVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "退费订单管理").head(ExportRefundListVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportRefundList error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportOutSideRecord")
    @ApiOperation(value = "路外停车场实时记录导出", notes = "路外停车场实时记录导出(分页信息不用传)")
    public CommonResult exportOutSideRecord(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)OutsideListParams params) {
        String fileName = "实时记录-路外停车场列表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("实时记录-路外停车场");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<OutsideListVO>> result = importRecordService.outsideAllList(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<OutsideListVO> data = result.getData();
            List<DacImportRecordVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    DacImportRecordVO importRecordVO = new DacImportRecordVO();
                    BeanUtils.copyProperties(a,importRecordVO);
                    list.add(importRecordVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, DacImportRecordVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "路外停车场").head(DacImportRecordVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportOutSideRecord error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportMebUser")
    @ApiOperation(value = "用户信息导出", notes = "用户信息导出(分页信息不用传)")
    public CommonResult exportMebUser(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)CmsMebUserSearchParams params) {
        String fileName = "用户信息" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("用户管理-用户信息");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<CmsMebUserVO>> result = mebUserService.searchAll(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<CmsMebUserVO> data = result.getData();
            List<ExportCmsMebUserVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    ExportCmsMebUserVO mebUserVO = new ExportCmsMebUserVO();
                    BeanUtils.copyProperties(a,mebUserVO);
                    list.add(mebUserVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, ExportCmsMebUserVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "用户信息").head(ExportCmsMebUserVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportMebUser error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportEinvoice")
    @ApiOperation(value = "发票查询导出", notes = "发票查询导出(分页信息不用传)")
    public CommonResult exportEinvoice(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) InvEinvoiceListPasrams params) {
        String fileName = "发票查询" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("发票管理-发票查询");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<InvEinvoiceListVO>> result = einvoiceService.einvoiceAllList(params);
            if (result.getCode() != Constants.SUCCESS_CODE) {
                return result;
            }
            List<InvEinvoiceListVO> data = result.getData();
            List<ExportEinvoiceListVO> list = new ArrayList<>();
            if (!CollectionUtils.isEmpty(data)) {
                data.stream().forEach(a -> {
                    ExportEinvoiceListVO einvoiceListVO = new ExportEinvoiceListVO();
                    BeanUtils.copyProperties(a, einvoiceListVO);
                    list.add(einvoiceListVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, ExportEinvoiceListVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "发票查询").head(ExportEinvoiceListVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exportEinvoice error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportUserCoupon")
    @ApiOperation(value = "优惠券发放记录导出", notes = "优惠券发放记录导出(分页信息不用传)")
    public CommonResult exportUserCoupon(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraUserCouponParams params) {
        String fileName = "优惠券发放记录" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("优惠券管理-优惠券发放记录");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<UserCouponVO>> result = couponService.allList(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<UserCouponVO> data = result.getData();
            List<UserCouponExportVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    UserCouponExportVO userCouponExportVO = new UserCouponExportVO();
                    BeanUtils.copyProperties(a,userCouponExportVO);
                    list.add(userCouponExportVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, UserCouponExportVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "优惠券发放记录").head(UserCouponExportVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        }catch (Exception e){
            log.error("exportUserCoupon error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        }finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping("exportUsageCoupon")
    @ApiOperation(value = "优惠券使用记录导出", notes = "优惠券使用记录导出(分页信息不用传)")
    public CommonResult exportUsageCoupon(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraCouponUsageRecordParams params) {
        String fileName = "优惠券使用记录" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("优惠券管理-优惠券使用记录");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {

            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<List<CouponUsageRecordVO>> result = usageRecordService.allList(params);
            if(result.getCode()!=Constants.SUCCESS_CODE){
                return result;
            }
            List<CouponUsageRecordVO> data = result.getData();
            List<CouponUsageRecordExporVO> list = new ArrayList<>();
            if(!CollectionUtils.isEmpty(data)){
                data.stream().forEach(a->{
                    CouponUsageRecordExporVO usageRecordExporVO = new CouponUsageRecordExporVO();
                    BeanUtils.copyProperties(a,usageRecordExporVO);
                    list.add(usageRecordExporVO);
                });
            }
            ExcelWriter excelWriter = EasyExcel.write(name, CouponUsageRecordExporVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "优惠券使用记录").head(CouponUsageRecordExporVO.class).build();
            excelWriter.write(list, writeSheetTemp);
            excelWriter.finish();

            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        }catch (Exception e){
            log.error("exportUsageCoupon error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        }finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    /**
     * 设置用户管理区域权限
     */
    private void setAreaAss(SysAreaAssCacheVO areaAss,TraBargainOrderListParams params){
        Integer areaAssType = areaAss.getAreaAssType();
        String[] areas = null;
        List<Integer> lsit =new ArrayList();
        if(areaAssType==0){
            params.setAreaAssType(areaAssType);
        }else if(areaAssType==1 && StringUtils.isNotEmpty(areaAss.getCityIds())){
            areas = areaAss.getCityIds().split(",");
            for (String area : areas) {
                lsit.add(Integer.valueOf(area));
            }
            params.setAreaIds(lsit);
        }else if(areaAssType==2 && StringUtils.isNotEmpty(areaAss.getCantonIds())){
            areas = areaAss.getCantonIds().split(",");
            for (String area : areas) {
                lsit.add(Integer.valueOf(area));
            }
            params.setAreaIds(lsit);
        }else if(areaAssType==3 && StringUtils.isNotEmpty(areaAss.getAreaIds())){
            areas = areaAss.getAreaIds().split(",");
            for (String area : areas) {
                lsit.add(Integer.valueOf(area));
            }
            params.setAreaIds(lsit);
        }
    }

    @PostMapping(value = "exporMonthCardByParams")
    @ApiOperation(value = "月卡订单导出", notes = "月卡订单导出")
    public CommonResult exporMonthCardByParams(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) QSMonthCardParams params) {
        String fileName = "月卡订单报表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-月卡订单报表");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<PageHelperVO<QSMonthCardVO>> result = iqsMonthCardService.queryMonthCardAll(params);
            if (result.getCode() != Constants.SUCCESS_CODE) {
                return result;
            }
            List<QSMonthCardVO> data = result.getData().getList();
            List<QSMonthCardExportVO> exportVo = new ArrayList<>();
            if (!CollectionUtils.isEmpty(data)) {
                exportVo = data.stream().map(po -> {
                    QSMonthCardExportVO vo = new QSMonthCardExportVO();
                    BeanUtils.copyProperties(po, vo);
                    return vo;
                }).collect(Collectors.toList());
            }
            ExcelWriter excelWriter = EasyExcel.write(name, QSMonthCardExportVO.class).build();
            WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "月卡订单报表").head(QSMonthCardExportVO.class).build();
            excelWriter.write(exportVo, writeSheetTemp);
            excelWriter.finish();
            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.info("error={}",e.toString());
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

    @PostMapping(value = "exporMonthOrderByParams")
    @ApiOperation(value = "酒店订单导出", notes = "酒店订单导出")
    public CommonResult exporMonthOrderByParams(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) QSCarplatRegistHostelParams params) {
        String fileName = "酒店订单报表" + DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.getCurrentLocalDateTime(DatetimeUtil.DATETIME_17_PATTERN)) + ".xlsx";
        String name = EXPORT_PATH + fileName;
        SysExportPO exportPO = new SysExportPO();
        exportPO.setExportContent(fileName);
        exportPO.setExportService("报表管理-酒店订单报表");
        exportPO.setFileUrl(name);
        exportPO.setAddUser(params.getLoginSysUserId());
        exportPO.setAddTime(new Date());
        exportPO.setExportProgress(EXPORTING);
        sysExportService.insertExport(exportPO);
        try {
            File file = new File(EXPORT_PATH);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return CommonResult.failed();
                }
            }
            CommonResult<PageHelperVO<QSCarplatRegistHostelVO>> result = qsCarplatRegistHostelService.queryMonthOrderList(params);
            if (result.getCode() != Constants.SUCCESS_CODE) {
                return result;
            }
            List<QSCarplatRegistHostelVO> data = result.getData().getList();
            List<QSCarplatRegistHostelExporVO> exportVO = new ArrayList<>();
            if (!CollectionUtils.isEmpty(data)) {
                data.forEach(po -> {
                    QSCarplatRegistHostelExporVO vo = new QSCarplatRegistHostelExporVO();
                    BeanUtils.copyProperties(po, vo);
                    exportVO.add(vo);
                });
                ExcelWriter excelWriter = EasyExcel.write(name, QSCarplatRegistHostelExporVO.class).build();
                WriteSheet writeSheetTemp = EasyExcel.writerSheet(1, "酒店订单报表").head(QSCarplatRegistHostelExporVO.class).build();
                excelWriter.write(exportVO, writeSheetTemp);
                excelWriter.finish();
            }
            exportPO.setExportProgress(new BigDecimal("100"));
            return CommonResult.success();
        } catch (Exception e) {
            log.error("exporParkRepBerth error.", e);
            exportPO.setExportProgress(new BigDecimal("-1"));
            return CommonResult.failed("导出失败！请重试！");
        } finally {
            // 插入导出记录
            sysExportService.updateExport(exportPO);
        }
    }

}
