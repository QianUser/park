package com.park.cloud.common.constant;

/**
 * 辖区类型。
 */
public enum AreaAssTypeEnum {

    /**
     * 0为全部辖区
     */
    CITY(1, "城市"),
    CANTON(2, "行政区"),
    AREA(3, "片区");

    /**
     * 名称
     */
    private String name;

    /**
     * code
     */
    private int code;

    AreaAssTypeEnum(int code, String name) {
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
