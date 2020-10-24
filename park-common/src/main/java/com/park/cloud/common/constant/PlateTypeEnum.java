package com.park.cloud.common.constant;

/**
 * 车牌类型枚举。
 */
public enum PlateTypeEnum {

    BLUE(1, "蓝牌"),
    GREEN(2, "绿牌"),
    YELLOW(3, "黄牌"),
    OTHER(4, "其他");

    /**
     * 名称
     */
    private String name;

    /**
     * code
     */
    private int code;

    PlateTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static PlateTypeEnum getByCode(int code) {
        for (PlateTypeEnum plateTypeEnum : values()) {
            if (plateTypeEnum.getCode() == code) {
                return plateTypeEnum;
            }
        }
        return null;
    }
}
