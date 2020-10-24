package com.park.cloud.common.util.export;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelAnnotation {

    /**
     * 列序号。从0开始
     *
     * @return
     */
    int columnIndex();


    /**
     * 列名
     *
     * @return
     */
    String columnName();
}
