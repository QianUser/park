package com.park.cloud.common.util;

import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.constant.Constants;

import java.util.Date;
import java.util.Random;

/**
 * Created by Yingjie_Li on 2016/9/9.
 */
public class RandomUtil {
    private static final Random random = new Random();

    /**
     * 生成区间内的随机数
     * @param min
     * @param max
     * @return
     */
    public static int nextInt(int min, int max) {
        return (int) ((max - min) * Math.random() + min);
    }

    /**
     * 生成最大值以内的随机数
     * @param max
     * @return
     */
    public static int nextInt(int max) {
        return random.nextInt(max);
    }

    public static String getTokenCode() {
        Date now = new Date();
        String dateStr = DatetimeUtil.dateAsString(now, DatetimeUtil.DATETIME_17_PATTERN);
        String randomChar = Constants.allStringCodes[(int) (Math.random() * Constants.allStringCodes.length)];
        return dateStr + randomChar;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(RandomUtil.nextInt(30, 40));
        }
    }
}
