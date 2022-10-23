package com.itheima.jdk8date;

import java.time.LocalDateTime;

public class JDK8DateDemo8 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        // public LocalDateTime withYear(int year)  直接修改年
        LocalDateTime newLocalDateTime = localDateTime.withYear(2048);
        System.out.println(newLocalDateTime);
        // public LocalDateTime withMonth(int month)  直接修改月
        // public LocalDateTime withDayOfMonth(int dayofmonth)  直接修改日期(一个月中的第几天)
        // public LocalDateTime withDayOfYear(int dayOfYear)  直接修改日期(一年中的第几天)
        // public LocalDateTime withHour(int hour)  直接修改小时
        // public LocalDateTime withMinute(int minute)  直接修改分钟
        // public LocalDateTime withSecond(int second)  直接修改秒
    }

}
