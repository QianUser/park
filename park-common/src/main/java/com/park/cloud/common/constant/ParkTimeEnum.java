package com.park.cloud.common.constant;

/**
 * @ClassNameParkTimeEnum
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/13 16:13
 **/
public enum ParkTimeEnum {

    ONE(1, "0～0.5小时"),
    TWO(2, "0.5～1小时"),
    THREE(3, "1～2小时"),
    FOUR(4, "2～3小时"),
    FIVE(5, "3～4小时"),
    SIX(6, ">4小时");


    /**
     * 名称
     */
    private String name;

    /**
     * code
     */
    private int code;

    ParkTimeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
