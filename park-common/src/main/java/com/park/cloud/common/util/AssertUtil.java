package com.park.cloud.common.util;


import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.constant.Constants;

import java.util.List;

/**
 * Created by v5njj on 2018/11/22.
 */
public class AssertUtil {

    public static boolean isEmptyList(List l){
        if (l !=null && l.size() > 0){
            return false;
        }
        return true;
    }

    public static boolean isNotEmptyList(List l){
        if (l == null || l.size() == 0){
            return false;
        }
        return true;
    }

    public static boolean isEmptyString(String str) {
        if (str == null || Constants.EMPTY_STRING.equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmptyString(String str) {
        if (str != null && !Constants.EMPTY_STRING.equals(str)) {
            return true;
        }
        return false;
    }
}
