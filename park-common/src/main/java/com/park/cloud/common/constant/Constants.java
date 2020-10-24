package com.park.cloud.common.constant;

/**
 * Created by v5njj on 2018/9/30.
 */
public interface Constants {

    int SUCCESS_CODE = 0;
    int ERROR_CODE = -1;
    String OK = "ok";
    String ERR = "err";

    String SUCCESS = "success";

    String RESULT = "result";

    String COMMA_EN = ",";

    /**
     * 短信验证码有效时间（秒）
     */
    int SMS_VERIFY_CODE_EXPIRE = 600;

    String[] allNumberCodes = { "5", "6", "7", "3", "4", "0", "1", "2", "8", "9" };

    String[] allStringCodes = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
            "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };


    String CHAR_AT = "@";

    String EMPTY_STRING = "";

    String CN_TIME_ZONE = "+08:00";

    String CN_TIME_ZONE_ID = "Asia/shanghai";

    String STR_ZERO = "0";

    String PARKING_SERVICE_DOWN = "ParkingService_down";

    // 酒店结算后给用户的出场时间
    int HOTEL_MINUTES_PLUS = 30;

}
