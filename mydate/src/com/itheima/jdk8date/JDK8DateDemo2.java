package com.itheima.jdk8date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JDK8DateDemo2 {
    public static void main(String[] args)  {
        // public static LocalDateTime now() 获取当前系统时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // public static LocalDateTime of(年, 月 , 日, 时, 分, 秒) 使用指定年月日和时分秒初始化一个LocalDateTime对象
        LocalDateTime date =  LocalDateTime.of(2020,11,11,11,11,11);
        System.out.println(date);
    }

}
