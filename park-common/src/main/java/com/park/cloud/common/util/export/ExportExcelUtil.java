package com.park.cloud.common.util.export;

import com.park.cloud.common.domain.vo.export.BaseExportVO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * excel文件导出工具类
 * @author liyj1
 */
public class ExportExcelUtil {

    /**
     * excel文件导出
     * @param response
     * @param dataList
     * @param fileName
     * @throws IOException
     */
    public static void expoerDataExcel(HttpServletResponse response, List<? extends BaseExportVO> dataList, String fileName) throws IOException {

        //输出xls文件名称
        String xlsFile_name = fileName + ".xlsx";
        //内存中只创建100个对象
        Workbook wb = new SXSSFWorkbook(100);

        CellStyle style = wb.createCellStyle();

        // 生成一个字体
        Font font = wb.createFont();
        font.setColor(IndexedColors.RED.getIndex());
        font.setFontHeightInPoints((short) 11); //设置字号

        style.setFont(font);

        //工作表对象
        Sheet sheet = null;
        //行对象
        Row nRow = null;
        //列对象
        Cell nCell = null;

        //总行号
        int rowNo = 0;
        //页行号
        int pageRowNo = 0;

        sheet = wb.createSheet("工作簿"+(rowNo));

        sheet = wb.getSheetAt(rowNo);


        pageRowNo = 0;

        // -----------定义表头-----------
        nRow = sheet.createRow(pageRowNo++);



        // 获取实体所有属性
        Field[] fields = dataList.get(0).getClass().getDeclaredFields();

        // 列名称
        String name = "";

        ExcelAnnotation excelAnnotation;

        // 创建表头
        for (int i=0;i<fields.length;i++) {
            // 是否是注解
            if (fields[i].isAnnotationPresent(ExcelAnnotation.class)) {
                // 获取注解
                excelAnnotation = fields[i].getAnnotation(ExcelAnnotation.class);

                // 获取列索引
                int index = excelAnnotation.columnIndex();

                // 列名称
                name = excelAnnotation.columnName();

                Cell cell_tem = nRow.createCell(index);

                cell_tem.setCellValue(name);
            }
        }

        int i = 0;

        for (Object obj : dataList) {

            rowNo++;

            nRow = sheet.createRow(pageRowNo++);    //新建行对象

            for (Field f : fields) {
                // 设置属性可访问
                f.setAccessible(true);
                // 判断是否是注解
                if (f.isAnnotationPresent(ExcelAnnotation.class)) {
                    // 获取注解
                    excelAnnotation = f.getAnnotation(ExcelAnnotation.class);
                    // 获取列索引
                    int index = excelAnnotation.columnIndex();
                    try {

                        Cell cell_tem = nRow.createCell(index);

                        if(f.getType().equals(Date.class)){
                            Date date = (Date) f.get(obj);
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            cell_tem.setCellValue(dateFormat.format(date));
                        }else{
                            Object cellValue = f.get(obj);
                            if(cellValue != null) {
                                cell_tem.setCellValue(String.valueOf(cellValue));
                            }
                        }


                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            BaseExportVO baseExportVO = dataList.get(i);

            if(baseExportVO.getChildList() != null && baseExportVO.getChildList().size()>0){
                for (Object childObj : baseExportVO.getChildList()) {
                    nRow = sheet.createRow(pageRowNo++);    //新建行对象

                    for (Field childF : fields) {
                        // 设置属性可访问
                        childF.setAccessible(true);
                        // 判断是否是注解
                        if (childF.isAnnotationPresent(ExcelAnnotation.class)) {
                            // 获取注解
                            excelAnnotation = childF.getAnnotation(ExcelAnnotation.class);
                            System.out.println("-------------");
                            // 获取列索引
                            int index = excelAnnotation.columnIndex();
                            try {

                                Cell cell_tem = nRow.createCell(index);

                                if(childF.getType().equals(Date.class)){
                                    Date date = (Date) childF.get(obj);
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                    cell_tem.setCellValue(dateFormat.format(date));
                                }else{
                                    Object cellValue = childF.get(obj);
                                    if(cellValue != null) {
                                        cell_tem.setCellValue(String.valueOf(cellValue));
                                    }
                                }

                                cell_tem.setCellStyle(style);


                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
            i++;
        }
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-disposition", "attachment;filename=" + xlsFile_name);
        response.flushBuffer();
        OutputStream outputStream = response.getOutputStream();
        wb.write(response.getOutputStream());
        wb.close();
        outputStream.flush();
        outputStream.close();
    }
}
