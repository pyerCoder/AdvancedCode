package com.itheima.jdk8date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JDK8DateDemo5 {
    public static void main(String[] args) {
        method1();
        // public LocalDateTime parse (准备解析的字符串, 解析格式)  把一个日期字符串解析成为一个LocalDateTime对象
        String s = "2020年11月12日 13:14:15";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime t = LocalDateTime.parse(s,dateTimeFormatter);
        System.out.println(t);
    }

    private static void method1() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 12, 13, 14, 15);
        // public String format (指定格式)  把一个LocalDateTime格式化成为一个字符串
        // public static DateTimeFormatter ofPattern(String pattern)  使用指定的日期模板获取一个日期格式化器DateTimeFormatter对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s = localDateTime.format(dateTimeFormatter);
        System.out.println(s);
    }

}
