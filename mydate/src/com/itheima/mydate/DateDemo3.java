package com.itheima.mydate;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) {
        // public SimpleDateFormat ()  构造一个SimpleDateFormat，使用默认格式
        // public SimpleDateFormat (String pattern)  构造一个SimpleDateFormat，使用指定的格式
        // 当前时间的Date对象
        Date date = new Date();

        // 创建了一个日期格式对象
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // public final String format(Date date)：将日期格式化成日期/时间字符串
        String str = simpleDateFormat.format(date);
        System.out.println(str);


    }

}
