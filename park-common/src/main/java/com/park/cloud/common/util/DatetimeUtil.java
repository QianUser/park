package com.park.cloud.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
 
public class DatetimeUtil {

    // 日志工具类
    static Log log = LogFactory.getLog(DatetimeUtil.class);

    /** The datetime outpattern. */
    public static String DATETIME_OUTPATTERN = "yyyy-MM-dd HH:mm:ss";// 日期加时间的默认输出模式

    /** The time outpattern. */
    public static String TIME_OUTPATTERN = "HH:mm:ss";// 时间的默认输出模式

    /** The date outpattern. */
    public static String DATE_OUTPATTERN = "yyyy-MM-dd";// 日期的默认输出模式

    /** The Constant DATE_INPATTERN. */
    public final static String DATE_INPATTERN = "yyyy-MM-dd";// 时间的默认解析模式,暂不提供其他解析模式

    /** The Constant DATETIME_INPATTERN. */
    public final static String DATETIME_INPATTERN = "yyyy-MM-dd HH:mm:ss";// 时间加日期的默认解析模式,暂不提供其他解析模式

    /** The Constant TIME_INPATTERN. */
    public final static String TIME_INPATTERN = "HH:mm:ss";// 时间的默认解析模式,暂不提供其他解析模式

    /** The time zone. */
    public static String TIME_ZONE = "Asia/Shanghai";// 默认时区,暂不提供设置

    /** The country. */
    public static Locale COUNTRY = Locale.CHINESE;// 默认国家,暂不提供设置

    /** The DATETIM e_14_ pattern. */
    public static String DATETIME_14_PATTERN = "yyyyMMddHHmmss";// 14位时间模式

    public static String DATETIME_17_PATTERN = "yyyyMMddHHmmssSSS";

    /** The DAT e_08_ pattern. */
    public static String DATE_08_PATTERN = "yyyyMMdd";

    /**
     * 功能描述: <br>
     * 解析Date, 返回yyyyMMdd
     * 
     * @param date
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static String dateToStr(Date date) {
        DateFormat format = new SimpleDateFormat(DATE_08_PATTERN);
        return format.format(date);
    }

    /**
     * 功能描述: <br>
     * 解析yyyyMMdd格式
     * 
     * @param str
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static Date parse(final String str) {
        DateFormat format = new SimpleDateFormat(DATE_08_PATTERN);
        try {
            return format.parse(str);
        } catch (ParseException e) {
            log.error(str + " is not a valid Date String.", e);
        }
        return null;
    }

    /**
     * Parses the time.
     *
     * @param str the str
     * @return the date
     */
    public static Date parseDate(String str) {
        DateFormat format = new SimpleDateFormat(DATETIME_OUTPATTERN);
        try {
            return format.parse(str);
        } catch (ParseException e) {
            log.error(str + " is not a valid Date String.", e);
        }
        return null;
    }

    /**
     * Format date.
     *
     * @param date the date
     * @param patterm the patterm
     * @return the string
     */
    public static String formatDate(Date date, String patterm) {
        DateFormat format = new SimpleDateFormat(patterm);
        if (date != null) {
            return format.format(date);
        }
        return null;
    }

    /**
     * 得到当前日期和时间,输出模式为默认
     * 
     * @return String
     */
    public static String getDateTime() {
        try {
            return getDateTimePattern(null, null);
        } catch (ParseException e) {
            return "";
        }
    }

    /**
     * 得到指定的日期和时间,输出模式为默认
     * 
     * @param String 指定的日期和时间
     * @return String
     */
    public static String getDateTime(String dateTime) {
        try {
            return getDateTimePattern(dateTime, null);
        } catch (ParseException e) {

            return dateTime;
        }
    }

    /**
     * 得到当前日期和时间,指定输出模式
     * 
     * @return String
     */
    public static String getDateTimePattern(String pattern) throws ParseException {
        return getDateTimePattern(null, pattern);
    }

    /**
     * 得到指定的日期和时间,可指定输出模式
     * 
     * @param String 指定的日期和时间
     * @param String 指定的输出模式
     * @return String
     * @exception ParseException
     */
    public static String getDateTimePattern(String dateTime, String pattern) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (pattern == null || pattern.equals("")) {
            pattern = DATETIME_OUTPATTERN;
        }
        if (dateTime != null && !dateTime.equals("")) {
            c.setTime(new SimpleDateFormat(DATETIME_INPATTERN).parse(dateTime));
        }
        return (new SimpleDateFormat(pattern)).format(c.getTime());
    }

    /**
     * 得到当前日期,输出模式为默认
     *
     * @return String
     */
    public static String getDate() {
        try {
            return getDatePattern(null, null);
        } catch (ParseException e) {
            return "";
        }
    }

    /**
     * 得到指定的日期,输出模式为默认
     *
     * @param String 指定的日期
     * @return String
     */
    public static String getDate(String date) {
        try {
            return getDatePattern(date, null);
        } catch (ParseException e) {
            return date;
        }
    }

    /**
     * 得到当前日期,指定输出模式
     *
     * @return String
     */
    public static String getDatePattern(String pattern) throws ParseException {
        return getDatePattern(null, pattern);
    }

    /**
     * 得到指定的日期,可指定输出模式
     *
     * @param String 指定的日期
     * @param String 指定的输出模式
     * @return String
     * @exception ParseException
     */
    public static String getDatePattern(String date, String pattern) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (pattern == null || pattern.equals("")) {
            pattern = DATE_OUTPATTERN;
        }
        if (date != null && !date.equals("")) {
            c.setTime(new SimpleDateFormat(DATE_INPATTERN).parse(date));
        }
        return (new SimpleDateFormat(pattern)).format(c.getTime());
    }

    /**
     * 得到当前时间,输出模式为默认
     *
     * @return String
     */
    public static String getTime() {
        try {
            return getTimePattern(null, null);
        } catch (ParseException e) {
            return "";
        }
    }

    /**
     * 得到指定的时间,输出模式为默认
     *
     * @param String 指定的时间
     * @return String
     * @exception ParseException
     */
    public static String getTime(String time) {
        try {
            return getTimePattern(time, null);
        } catch (ParseException e) {
            return time;
        }
    }

    /**
     * 得到当前时间,指定输出模式
     *
     * @return String
     */
    public static String getTimePattern(String pattern) throws ParseException {
        return getTimePattern(null, pattern);
    }

    /**
     * 得到指定的时间,可指定输出模式
     *
     * @param String 指定的时间
     * @param String 指定的输出模式
     * @return String
     * @exception ParseException
     */
    public static String getTimePattern(String time, String pattern) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (pattern == null || pattern.equals("")) {
            pattern = TIME_OUTPATTERN;
        }
        if (time != null && !time.equals("")) {
            c.setTime(new SimpleDateFormat(TIME_INPATTERN).parse(time));
        }
        return (new SimpleDateFormat(pattern)).format(c.getTime());
    }

    /**
     * 得到当前年
     *
     * @return int
     */
    public static int getYear() {
        try {
            return getYear(null);
        } catch (ParseException e) {
            return -1;
        }
    }

    /**
     * 得到指定日期的年
     *
     * @param String 指定的日期
     * @return int
     * @exception ParseException
     */
    public static int getYear(String date) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (date != null && !date.equals("")) {
            c.setTime(new SimpleDateFormat(DATE_INPATTERN).parse(date));
        }
        return c.get(Calendar.YEAR);
    }

    /**
     * 得到当前月
     *
     * @return int
     */
    public static int getMonth() {
        try {
            return getMonth(null);
        } catch (ParseException e) {
            return -1;
        }
    }

    /**
     * 得到指定日期的月
     *
     * @param String 指定的日期
     * @return int
     * @exception ParseException
     */
    public static int getMonth(String date) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (date != null) {
            c.setTime(new SimpleDateFormat(DATE_INPATTERN).parse(date));
        }
        return c.get(Calendar.MONTH) + 1;
    }

    /**
     * Gets the month.
     *
     * @param date the date
     * @param format the format
     * @return the month
     * @throws ParseException the parse exception
     */
    public static int getMonth(String date, String format) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (date != null) {
            c.setTime(new SimpleDateFormat(format).parse(date));
        }
        return c.get(Calendar.MONTH) + 1;
    }

    /**
     * 得到当前天
     *
     * @return int
     */
    public static int getDay() {
        try {
            return getDay(null);
        } catch (ParseException e) {
            return -1;
        }
    }

    /**
     * 得到指定日期的天
     *
     * @param String 指定的日期
     * @return int
     * @exception ParseException
     */
    public static int getDay(String date) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (date != null) {
            c.setTime(new SimpleDateFormat(DATE_INPATTERN).parse(date));
        }
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 得到当前小时
     *
     * @return int
     */
    public static int getHour() {
        try {
            return getHour(null);
        } catch (ParseException e) {
            return -1;
        }
    }

    /**
     * 得到指定日期的小时
     *
     * @param String 指定的时间
     * @return int
     * @exception ParseException
     */
    public static int getHour(String time) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (time != null) {
            c.setTime(new SimpleDateFormat(TIME_INPATTERN).parse(time));
        }
        return c.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 得到当前分钟
     *
     * @return int
     */
    public static int getMinute() {
        try {
            return getMinute(null);
        } catch (ParseException e) {
            return -1;
        }
    }

    /**
     * 得到指定日期的分钟
     *
     * @param String 指定的时间
     * @return int
     * @exception ParseException
     */
    public static int getMinute(String time) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (time != null) {
            c.setTime(new SimpleDateFormat(TIME_INPATTERN).parse(time));
        }
        return c.get(Calendar.MINUTE);
    }

    /**
     * 得到当前秒
     *
     * @return int
     */
    public static int getSecond() {
        try {
            return getSecond(null);
        } catch (ParseException e) {
            return -1;
        }
    }

    /**
     * 得到指定日期的秒
     *
     * @param String 指定的时间
     * @return int
     * @exception ParseException
     */
    public static int getSecond(String time) throws ParseException {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (time != null) {
            c.setTime(new SimpleDateFormat(TIME_INPATTERN).parse(time));
        }
        return c.get(Calendar.SECOND);
    }

    /**
     * Gets the date instance.
     *
     * @param date the date
     * @return the date instance
     */
    public static GregorianCalendar getDateInstance(String date) {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (date != null && !date.equals("")) {
            try {
                c.setTime(new SimpleDateFormat(DATE_OUTPATTERN).parse(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return c;
    }

    /**
     * Gets the date time instance.
     *
     * @param datetime the datetime
     * @return the date time instance
     */
    public static GregorianCalendar getDateTimeInstance(String datetime) {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        if (datetime != null && !datetime.equals("")) {
            try {
                c.setTime(new SimpleDateFormat(DATETIME_OUTPATTERN).parse(datetime));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return c;
    }

    /**
     * Date as string.
     *
     * @param c the c
     * @return the string
     */
    public static String dateAsString(GregorianCalendar c) {
        if (c != null) {
            return c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH);
        } else {
            return null;
        }
    }

    /**
     * Date as string.
     *
     * @param date the date
     * @return the string
     */
    public static String dateAsString(Date date) {
        return dateAsString(date, null);
    }

    /**
     * Date as string.
     *
     * @param date the date
     * @param pattern the pattern
     * @return the string
     */
    public static String dateAsString(Date date, String pattern) {
        if (pattern == null || pattern.equals("")) {
            pattern = DATE_OUTPATTERN;
        }
        if (date != null && !date.equals("")) {
            return (new SimpleDateFormat(pattern)).format(date);
        } else {
            return null;
        }
    }

    /**
     * String to date with start.
     *
     * @param dateTime the date time
     * @return the date
     */
    public static Date stringToDateWithStart(String dateTime) {
        try {
            return stringToDate(dateTime + " 00:00:00", DATETIME_INPATTERN);
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * String to date with end.
     *
     * @param dateTime the date time
     * @return the date
     */
    public static Date stringToDateWithEnd(String dateTime) {
        try {
            return stringToDate(dateTime + " 23:59:59", DATETIME_INPATTERN);
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * String to date.
     *
     * @param date the date
     * @return the date
     */
    public static Date stringToDate(String date) {
        try {
            return stringToDate(date, DATE_INPATTERN);
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * String to calendar.
     *
     * @param date the date
     * @return the calendar
     */
    public static Calendar stringToCalendar(String date) {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        try {
            c.setTime(stringToDate(date, DATE_INPATTERN));
            return c;
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * String to calendar.
     *
     * @param date the date
     * @param pattern the pattern
     * @return the calendar
     */
    public static Calendar stringToCalendar(String date, String pattern) {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        try {
            c.setTime(stringToDate(date, pattern));
            return c;
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * String to date.
     *
     * @param dateTime the date time
     * @param pattern the pattern
     * @return the date
     */
    public static Date stringToDate(String dateTime, String pattern) {
        try {
            if (pattern == null || pattern.equals("")) {
                pattern = DATETIME_INPATTERN;
            }
            if (dateTime != null && !dateTime.equals("")) {
                return new SimpleDateFormat(pattern).parse(dateTime);
            }
        } catch (Exception e) {
        }

        return null;
    }

    /**
     * String to date time.
     *
     * @param dateTime the date time
     * @return the date
     */
    public static Date stringToDateTime(String dateTime) {
        try {
            return stringToDate(dateTime, DATETIME_INPATTERN);
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * Date time as string.
     *
     * @param date the date
     * @return the string
     */
    public static String dateTimeAsString(Date date) {
        return dateTimeAsString(date, null);
    }

    /**
     * Date time as string.
     *
     * @param date the date
     * @param pattern the pattern
     * @return the string
     */
    public static String dateTimeAsString(Date date, String pattern) {
        if (pattern == null || pattern.equals("")) {
            pattern = DATETIME_OUTPATTERN;
        }
        if (date != null) {
            return (new SimpleDateFormat(pattern)).format(date);
        } else {
            return null;
        }
    }

    /**
     * Compare to current.
     *
     * @param dateTime the date time
     * @param pattern the pattern
     * @return the int
     * @throws ParseException the parse exception
     */
    public static int compareToCurrent(String dateTime, String pattern) throws ParseException {
        return new Date().compareTo(stringToDate(dateTime, pattern));
    }

    /**
     * Compare to current.
     *
     * @param dateTime the date time
     * @return the int
     * @throws ParseException the parse exception
     */
    public static int compareToCurrent(String dateTime) throws ParseException {
        return new Date().compareTo(stringToDate(dateTime, null));
    }

    /**
     * Compare to current.
     *
     * @param dateTime the date time
     * @return the int
     * @throws ParseException the parse exception
     */
    public static int compareToCurrent(Date dateTime) throws ParseException {
        return new Date().compareTo(dateTime);
    }

    /**
     * Compare to date.
     *
     * @param date1 the date1
     * @param date2 the date2
     * @return the int
     * @throws ParseException the parse exception
     */
    public static int compareToDate(String date1, String date2) throws ParseException {
        return stringToDate(date1, null).compareTo(stringToDate(date2, null));
    }

    // 比较两个日期的大小,指定模式
    /**
     * Compare to date.
     *
     * @param date1 the date1
     * @param date2 the date2
     * @param pattern the pattern
     * @return the int
     * @throws ParseException the parse exception
     */
    public static int compareToDate(String date1, String date2, String pattern) throws ParseException {
        return stringToDate(date1, pattern).compareTo(stringToDate(date2, pattern));
    }

    /**
     * 计算间隔的天数，不足一天，返回0
     *
     * @param date1 endDate
     * @param date2 beginDate
     * @return the long
     * @throws ParseException the parse exception
     */
    public static long dateDiff(String date1, String date2) throws ParseException {
        return (stringToDate(date1, null).getTime() - stringToDate(date2, null).getTime()) / 60 / 60 / 1000 / 24;
    }
    
    public static long dateDiff(Date endDate, Date beginDate) throws ParseException {
        return (endDate.getTime() - beginDate.getTime()) / 60 / 60 / 1000 / 24;
    }
    
    /**
     * 计算剩余天数, 不足一天返回1
     *
     * @param  endDate
     * @param  beginDate
     * @return the long
     * @throws ParseException the parse exception
     */
    public static long remainDays(Date endDate, Date beginDate) throws ParseException {
    	long end = endDate.getTime();
    	long begin = beginDate.getTime();
    	long a = (end - begin) / (60 * 60 * 1000 * 24);
    	long b = (end - begin) % (60 * 60 * 1000 * 24);
    	
        return (b>0L)?a+1L:a;
    }
    
    public static long remainDays(String endDate, String beginDate) throws ParseException { 
    	
    	return remainDays(stringToDate(endDate, null), stringToDate(beginDate, null));
    }

    /**
     * 计算间隔的天数，不足一天，返回0
     *
     * @param date1 endDate
     * @param date2 beginDate
     * @param pattern the pattern
     * @return the long
     * @throws ParseException the parse exception
     */
    public static long dateDiff(String date1, String date2, String pattern) {
        return (stringToDate(date1, pattern).getTime() - stringToDate(date2, pattern).getTime()) / 60 / 60 / 1000 / 24;
    }

    /**
     * Convert date.
     *
     * @param date the date
     * @return the calendar
     */
    public static Calendar convertDate(Date date) {
        GregorianCalendar c = new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
        c.setTime(date);
        return c;
    }

    /**
     * Gets the cur calendar.
     *
     * @return the cur calendar
     */
    public static Calendar getCurCalendar() {
        return new GregorianCalendar(TimeZone.getTimeZone(TIME_ZONE), COUNTRY);
    }

    /**
     * Date add.
     *
     * @param date the date
     * @param days the days
     * @return the date
     */
    public static Date dateAdd(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, days);
        return cal.getTime();
    }

    /**
     * Date add.
     * @return the date
     */
    public static Date dateAdd(Date date, int field, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(field, amount);
        return cal.getTime();
    }

    /**
     *
     * @param time 秒转时间: 00:00:00
     * @return
     */
    public static String secToTime(int time) {
        String timeStr = null;
        int hour = 0;
        int minute = 0;
        int second = 0;
        if (time <= 0)
            return null;
        else {
            minute = time / 60;
            if (minute < 60) {
                second = time % 60;
                timeStr = unitFormat(minute) + ":" + unitFormat(second);
            } else {
                hour = minute / 60;
                if (hour > 99)
                    return "99:59:59";
                minute = minute % 60;
                second = time - hour * 3600 - minute * 60;
                timeStr = unitFormat(hour) + ":" + unitFormat(minute) + ":" + unitFormat(second);
            }
        }
        return timeStr;
    }

    /**
     * Unit format.
     *
     * @param i the i
     * @return the string
     */
    private static String unitFormat(int i) {
        String retStr = null;
        if (i >= 0 && i < 10)
            retStr = "0" + Integer.toString(i);
        else
            retStr = "" + i;
        return retStr;
    }

    /**
     * 使用的例子
     */
    public static void main(String[] args) {
        try {
        	System.out.println(DatetimeUtil.remainDays("2006-1-1 12:11:13","2006-1-1 12:11:12") );
            /*
             * System.out.println(DatetimeUtil.getDateTime());
             * System.out.println(DatetimeUtil.getDateTimePattern("yyyy年MM月dd日 HH时mm分ss秒 a"));
             * System.out.println(DatetimeUtil.getDateTimePattern("2006-1-1 12:11:12", "yyyy年MM月dd日 HH时mm分ss秒 a"));
             * System.out.println(DatetimeUtil.getDateTimePattern("2006-1-1 12:11:12", "yyyy@@@@@@MM@@dd@@"));
             * System.out.println(DatetimeUtil.getDateTimePattern("2006-1-1 12:11:12", "yyyy年MM月dd日 HH时mm分ss秒 a"));
             * System.out.println(DatetimeUtil.getDate()); System.out.println(DatetimeUtil.getDate("2006-3-21"));
             * System.out.println(DatetimeUtil.getDatePattern("2006-3-21", "EEE, d MMM yyyy HH:mm:ss Z"));
             * System.out.println(DatetimeUtil.getTime()); System.out.println(DatetimeUtil.getTime("15:21:11"));
             * System.out.println(DatetimeUtil.getTimePattern("10:21:11", "a"));
             * System.out.println(DatetimeUtil.getYear()); System.out.println(DatetimeUtil.getYear("2006-01-01"));
             * System.out.println(DatetimeUtil.getMonth()); System.out.println(DatetimeUtil.getMonth("2006-03-01"));
             * System.out.println(DatetimeUtil.getDay()); System.out.println(DatetimeUtil.getDay("2006-01-01"));
             * Calendar c = DatetimeUtil.getCurCalendar(); c.add(Calendar.MINUTE, 1); System.out.println(c);
             * System.out.println(DatetimeUtil.compareToCurrent("2005-01-01 12:00:00"));
             */
            // System.out.println(DateTimeUtil.manageDateTime(DateTimeUtil.getDateTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 计算两个日期之间相差的天数
     * 
     * @param smdate 较小的时间
     * @param bdate 较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(Date smdate, Date bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        smdate = sdf.parse(sdf.format(smdate));
        bdate = sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * String转时间再转毫秒，用于拼$后的时间戳
     */
    public static long getTimeLong(String timeStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(timeStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    /**
     * Gets the pre day long.
     *
     * @return the current day long
     */
    public static long getPreDayLong() {
        Date preDay = dateAdd(new Date(), -1);
        return preDay.getTime();
    }

    /**
     * Gets the current day long.
     *
     * @return the current day long
     */
    public static long getCurrentDayLong() {
        return System.currentTimeMillis();
    }

    public static Date getlongtoDate(long time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = format.format(time);
        Date date = null;
        try {
            date = format.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 获取距离下个整点的剩余时间
     *
     * @param hour 小时数量
     * @return 距离指定整点的秒
     * @throws ParseException
     */
    public static int getRemainingSec(int hour) throws ParseException {
        Calendar curtime = Calendar.getInstance();
        curtime.add(Calendar.HOUR, hour);
        curtime.set(Calendar.MINUTE, 0);
        curtime.set(Calendar.SECOND, 0);
        return (int) (curtime.getTimeInMillis() - System.currentTimeMillis()) / 1000;
    }

    public static Date getNow() {
        return new Date();
    }

    public static int difMinByNow(Date pre) {
        long preTime = pre.getTime();
        Long diff=(System.currentTimeMillis() - preTime)/1000/60;
        return diff.intValue() + 1;
    }

    public static boolean isWeekendToday(){
        Integer week = LocalDateTime.now().getDayOfWeek().getValue();
        if (week > 5) {
            return true;
        }
        return false;
    }

    public static Date asDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date asDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate asLocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime asLocalDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * 将LocalDateTime转化为指定格式字符串
     * @param localDateTime
     * @param format
     * @return
     */
    public static String getStringByLocalDateTime(LocalDateTime localDateTime, String format) {
        return localDateTime.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * 获取当前LocalDateTime并转化为指定格式字符串
     * @param format
     * @return
     */
    public static String getCurrentLocalDateTime(String format) {
        return getStringByLocalDateTime(LocalDateTime.now(), format);
    }


}
