package com.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class DateUtils {
	 
    /**
     * unix时间戳转换为dateFormat
     * 
     * @param beginDate
     * @return
     */
    public static String timestampToDate(String beginDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(beginDate)));
        return sd;
    }
 
    /**
     * 自定义格式时间戳转换
     * 
     * @param beginDate
     * @return
     */
    public static String timestampToDate(String beginDate,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String sd = sdf.format(new Date(Long.parseLong(beginDate)));
        return sd;
    }
 
    /**
     * 将字符串转为时间戳
     * 
     * @param user_time
     * @return
     * @throws java.text.ParseException 
     */
    public static String dateToTimestamp(String user_time) throws java.text.ParseException {
        String re_time = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date d;
        try {
            d = sdf.parse(user_time);
            long l = d.getTime();
            String str = String.valueOf(l);
            re_time = str.substring(0, 10);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return re_time;
    }
 
}
