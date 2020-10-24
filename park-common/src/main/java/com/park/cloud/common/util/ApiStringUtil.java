package com.park.cloud.common.util;

import com.park.cloud.common.constant.Constants;
import org.apache.http.Consts;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Yingjie_Li on 2015/5/20.
 */
public class ApiStringUtil {
    private static final Random random = new Random();
    private static final String baseString = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final int baseLength = baseString.length();
    private static final String baseNumString = "0123456789";
    private static final int baseNumLength = baseNumString.length();

    /**
     * 按照长度剪切字符串
     * @param target
     * @param length
     * @return
     */
    public static String cutString(String target, int length) {
        if (!StringUtils.isEmpty(target) && target.length() > length) {
            target = target.substring(0, length);
        }
        return target;
    }

    /**
     * 获取指定长度的随机字符串
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int num = random.nextInt(baseLength);
            sb.append(baseString.charAt(num));
        }
        return sb.toString();
    }

    /**
     * 获取指定长度的随机字符串(数字)
     * @param length
     * @return
     */
    public static String getRandomNum(int length) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int num = random.nextInt(baseNumLength);
            sb.append(baseNumString.charAt(num));
        }
        return sb.toString();
    }

    /**
     * 输入流转换成字符串
     * @param in
     * @return
     * @throws Exception
     */
    public static String convertToString(InputStream in) throws Exception {
        if(in == null) {
            return "";
        }
        BufferedReader bf = new BufferedReader(new InputStreamReader(in, Consts.UTF_8));
        StringBuilder r = new StringBuilder();
        String str;
        while ((str = bf.readLine()) != null) {
            r.append(str);
        }
        return r.toString();
    }

    /**
     * 拼接URL
     * @param url
     * @param map
     * @return
     */
    public static String convertUrl (String url, Map<String, String> map) {
        return convertUrl(url, map, "UTF-8");
    }

    /**
     * 拼接URL
     * @param url
     * @param map
     * @param enc
     * @return
     */
    public static String convertUrl(String url, Map<String, String> map, String enc) {
        StringBuffer sb = new StringBuffer(url);
        sb.append("?");
        boolean isFirst = true;
        for (String key : map.keySet()) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append("&");
            }
            String value = map.get(key);
            sb.append(key);
            sb.append("=");
            if (!StringUtils.isEmpty(value)) {
                try {
                    sb.append(URLEncoder.encode(value, enc));
                } catch (Exception e) {
                    e.printStackTrace();
                    sb.append(value);
                }
            }
        }
        return sb.toString();
    }

    /**
     * 截取字符串中间指定长度
     * @param s
     * @return
     */
    public static String getSub(String s, int length) {

        int n = s.length();
        int size = (n-length)/2;
        return s.substring(size, n-size);
    }

    /**
     * 计算百分比
     *
     * @param sub
     * @param total
     * @return
     */
    public static BigDecimal getRate(long sub, long total, int scale) {
        if(total == 0) {
            if(sub == 0) {
                return new BigDecimal("0");
            }
            return new BigDecimal("100");
        }
        BigDecimal subDecimal = new BigDecimal(sub * 100);
        BigDecimal totalDecimal = new BigDecimal(total);
        BigDecimal result = subDecimal.divide(totalDecimal, scale, RoundingMode.HALF_UP);
        return result;
    }

    /**
     * 是否为偶数
     * @param a
     * @return
     */
    public static boolean isEvenNumber(int a) {
        if (a % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 分隔符分隔的整数字符串转换为整型list
     * @param ids
     * @param sep(分隔符)
     * @return
     */
    public static List<Integer> toIdList(String ids, String sep) {
        List<Integer> pageIdList = new ArrayList<>();
        String[] pageIdArr = ids.split(sep);
        for(String pageId : pageIdArr) {
            if(StringUtils.isEmpty(pageId)) {
                continue;
            }
            pageIdList.add(Integer.parseInt(pageId));
        }

        return pageIdList;
    }

    /**
     * 逗号分隔的整数字符串转换为整型list
     * @param ids
     * @return
     */
    public static List<Integer> toIdList(String ids) {
        return toIdList(ids, Constants.COMMA_EN);
    }
}
