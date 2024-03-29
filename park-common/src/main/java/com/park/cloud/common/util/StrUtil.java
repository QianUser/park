package com.park.cloud.common.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;


public class StrUtil {
    private static final String DEFAULT_ENCODING = "UTF-8";

    private static final String LINE_END = System.getProperty("line.separator");

    private static OutputStreamWriter out = null;

    static {
        try {
            out = new OutputStreamWriter(System.out, DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void out(String str, String encoding) {
        try {
            str = nullToString(str, "null");
            out = new OutputStreamWriter(System.out, encoding);
            out.write(str);
            out.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outln(String str, String encoding) {
        out(str, encoding);
        nl();
    }

    public static void out(String str) {
        try {
            str = nullToString(str, "null");
            out.write(str);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outln(String str) {
        out(str);
        nl();
    }

    public static void out(int str) {
        try {
            str = nullToInt(str + "", 0);
            out.write(str);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outln(int str) {
        out(str);
        nl();
    }

    public static void outln(Integer str) {
        out(str);
        nl();
    }

    public static void out(Integer str) {
        try {
            str = (str != null ? str : null);
            out.write(str.toString());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outln(Object str) {
        out(str);
        nl();
    }

    public static void out(Object str) {
        try {
            str = (str != null ? str : null);
            out.write(str.toString());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void nl() {
        try {
            out.write(LINE_END);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean nullToBoolean(Object obj) {
        return nullToBoolean(obj, false);
    }

    public static boolean nullToBoolean(Object obj, boolean isRevert) {
        return obj == null ? isRevert : !isRevert;
    }


    public static String nullToString(String str) {
        return str == null ? "" : str;
    }

    public static String nullToStringHtml(String str) {
        return str == null ? "" : escapeForHTML(str);
    }

    public static String nullToStringHtml(String str, String defaultString) {
        return str == null ? defaultString : escapeForHTML(str);
    }

    public static String nullToStringHtmlTrim(String str) {
        return str == null ? "" : escapeForHTML(str);
    }

    public static String nullToStringHtmlTrim(String str, String defaultString) {
        return str == null ? defaultString : escapeForHTML(str);
    }

    public static String nullToString(String str, String defaultString) {
        return str == null ? defaultString : str;
    }

    public static String nullToStringTrim(String str) {
        return str == null ? "" : str.trim();
    }

    public static String nullToStringTrim(String str, String defaultString) {
        return str == null ? defaultString : str.trim();
    }

    public static int nullToInt(String str) {
        return nullToInt(str, 0);
    }


    public static short nullToShort(String str) {
        short s = 0;
        return nullToShort(str, s);
    }


    public static Double nullToDouble(String str) {
        return nullToDouble(str, 0d);
    }

    public static Double nullToDouble(String str, Double defaultDouble) {
        Double temp = 0d;
        try {
            temp = Double.parseDouble(str.trim());
        } catch (Exception e) {
            temp = defaultDouble;
        }
        return temp;
    }

    public static long nullToLong(String str) {
        return nullToLong(str, 0l);
    }

    public static Integer nullToInt(String str, Integer defaultInt) {
        Integer temp = 0;
        try {
            temp = Integer.parseInt(str.trim());
        } catch (Exception e) {
            temp = defaultInt;
        }
        return temp;
    }


    public static Long nullToLong(String str, Long defaultInt) {
        Long temp = 0l;
        try {
            temp = Long.parseLong(str.trim());
        } catch (Exception e) {
            temp = defaultInt;
        }
        return temp;
    }

    public static Short nullToShort(String str, Short defaultInt) {
        Short temp = 0;
        try {
            temp = Short.parseShort(str.trim());
        } catch (Exception e) {
            temp = defaultInt;
        }
        return temp;
    }

    public static List<String> tokenizerString(String str, String dim) {
        return tokenizerString(str, dim, false);
    }

    public static List<String> tokenizerString(String str, String dim,
                                               boolean returndim) {
        str = nullToString(str);
        dim = nullToString(dim);
        List<String> strList = new ArrayList<String>();
        StringTokenizer strtoken = new StringTokenizer(str, dim, returndim);
        while (strtoken.hasMoreTokens()) {
            strList.add(strtoken.nextToken());
        }
        return strList;
    }

    public static String deleteLastChar(String s) {
        if (s != null && s.trim().length() > 1) {
            s = s.trim().substring(0, s.trim().length() - 1);
        }
        return s;
    }

    public static String firstCharToUpper(String str) {
        str = nullToString(str);
        if (str.length() > 1) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        } else {
            return str.toString().toUpperCase();
        }
    }

    public static String formatPath(String s) {
        if (File.separatorChar == '/') {
            return s.trim().replace('\\', '/');
        }
        return s.trim().replace('/', '\\');
    }

    public static String formatPathForUNIX(String s) {
        return s.replace('\\', '/');
    }

    public static String formatPathForWindows(String s) {
        return s.replace('/', '\\');
    }

    public static String addEndingFileSeparator(String s) {
        if (s.endsWith(File.separator)) {
            return s;
        }
        return (new StringBuilder()).append(s).append(File.separator)
                .toString();
    }

    public static final String escapeForHTML(String s) {
        StringBuffer stringbuffer = new StringBuffer();
        int i = s.length();
        char ac[] = new char[i];
        s.getChars(0, i, ac, 0);
        for (int j = 0; j < i; j++) {
            switch (ac[j]) {
                case 60: // '<'
                    stringbuffer.append("&lt;");
                    break;
                case 62: // '>'
                    stringbuffer.append("&gt;");
                    break;

                case 38: // '&'
                    stringbuffer.append("&amp;");
                    break;

                case 34: // '"'
                    stringbuffer.append("&quot;");
                    break;

                case 39: // '\''
                    stringbuffer.append("&#39;");
                    break;

                default:
                    if (Character.getNumericValue(ac[j]) > 127
                            && Character.getNumericValue(ac[j]) < 256) {
                        stringbuffer.append("&#");
                        stringbuffer.append(Character.getNumericValue(ac[j]));
                        stringbuffer.append(";");
                    } else {
                        stringbuffer.append(ac[j]);
                    }
                    break;
            }
        }
        return stringbuffer.toString();
    }

    public static String encodeBase64(String str) {
        return encodeBase64(str, DEFAULT_ENCODING);
    }

    public static String encodeBase64(String str, String encoding) {
        return new String(new BASE64Encoder().encode(str.getBytes()));
    }

    public static String decodeBase64(String str) {
        return decodeBase64(str, DEFAULT_ENCODING);
    }

    public static String decodeBase64(String str, String encoding) {
        try {
            return new String(new BASE64Decoder().decodeBuffer(str));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    public static String encodeMD5(String inStr) {
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            byteArray[i] = (byte) charArray[i];
        }

        byte[] md5Bytes;
        try {
            md5Bytes = MessageDigest.getInstance("MD5").digest(byteArray);
            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16)
                    hexValue.append("0");
                hexValue.append(Integer.toHexString(val));
            }
            return hexValue.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String generalFileName(String filename) {
        return generalFileName(filename, true);
    }

    public static String generalFileName(String filename, boolean isExtname) {
        String generalname = "";
        String extname = "";
        if (filename.lastIndexOf(".") != -1) {
            extname = filename.substring(filename.lastIndexOf("."), filename
                    .length());
        } else {
            extname = "";
        }
        Calendar today = Calendar.getInstance();
        String currentyear = add(today.get(Calendar.YEAR), 4);
        String currentmonth = add(today.get(Calendar.MONTH) + 1, 2);
        String currentday = add(today.get(Calendar.DATE), 2);
        String currenthour = add(today.get(Calendar.HOUR_OF_DAY), 2);
        String currentmin = add(today.get(Calendar.MINUTE), 2);
        String currentsec = add(today.get(Calendar.SECOND), 2);

        Random random = new Random();
        int randomint = random.nextInt(1000);
        String rndstr = add(randomint, 3);

        generalname = currentyear + currentmonth + currentday + currenthour
                + currentmin + currentsec + rndstr;
        if (isExtname) {
            generalname += extname;
        }
        return generalname;
    }

    public static String parseQuotes(String s) {
        int i = s.indexOf("'");
        int j = 0;
        if (i != -1) {
            StringBuffer stringbuffer = new StringBuffer(s);
            boolean flag = true;
            do {
                if (!flag) {
                    break;
                }
                stringbuffer.insert(i + j++, "'");
                i = s.indexOf("'", i + 1);
                if (i == -1) {
                    flag = false;
                }
            } while (true);
            return new String(stringbuffer);
        } else {
            return s;
        }
    }

    public static String add(int v, int l) {
        long lv = (long) Math.pow(10, l);
        return String.valueOf(lv + v).substring(1);
    }

    public static long doubleToLong(Double str) {
        if (str == null) {
            return 0L;
        }

        return (long) Math.floor(str);
    }

    public static void showSysProps() {
        Properties p = System.getProperties();
        Enumeration<?> em = p.propertyNames();
        while (em.hasMoreElements()) {
            String proName = (String) em.nextElement();
            String proValue = System.getProperty(proName);

            System.out
                    .println("proName = " + proName + "  value = " + proValue);
        }
    }

    public static String getSubStr(String str, int num) {
        String result = "";
        int i = 0;
        while (i < num) {
            int lastFirst = str.lastIndexOf('>');
            result = str.substring(lastFirst) + result;
            str = str.substring(0, lastFirst);
            i++;
        }
        return result.substring(1);
    }

    public static String numberToString(Object value) {
        if (value == null) {
            return "";
        }
        return String.valueOf(value);
    }
}
