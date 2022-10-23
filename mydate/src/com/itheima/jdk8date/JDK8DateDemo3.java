package com.itheima.jdk8date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class JDK8DateDemo3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 11, 11, 20);
        // public int getYear() 获取年
        int year = localDateTime.getYear();
        System.out.println("年份为：" + year);
        // public int getMonthValue() 获取月份（1-12）
        int month = localDateTime.getMonthValue();
        System.out.println("月份为：" + month);
        // public int getMonth() 此方法返回本月的枚举Month 。
        // 这样可以避免混淆int值的含义。 如果您需要访问原始的int值，则枚举将提供int value 。
        // Month month1 = localDateTime.getMonth();
        // System.out.println(month1);
        // public int getDayOfMonth() 获取月份中的第几天（1-31）
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("当月第：" + dayOfMonth);
        // public int getDayOfYear() 获取一年中的第几天（1-366）
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("当年第：" + dayOfYear);
        // public DayOfWeek getDayOfWeek() 获取星期
        // DayOfWeek dayOfWeek = localDateTime.getDayOfWeek().getValue();
        int dayOfWeek = localDateTime.getDayOfWeek().getValue();
        System.out.println("当周第：" + dayOfWeek);
        // public int getMinute() 获取分钟
        int minute = localDateTime.getMinute();
        System.out.println("分钟为：" + minute);
        // public int getHour() 获取小时
        int hour = localDateTime.getHour();
        System.out.println("小时为：" + hour);
        // public int getHour() 获取小时
        int second = localDateTime.getSecond();
        System.out.println("秒数为：" + second);
    }

}
