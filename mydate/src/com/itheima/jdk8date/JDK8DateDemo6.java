package com.itheima.jdk8date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8DateDemo6 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        // public LocalDateTime plusYears (long years) 添加或者减去年
        // LocalDateTime newLocalDateTime = localDateTime.plusYears(1L);
        // System.out.println(newLocalDateTime);
        LocalDateTime newLocalDateTime = localDateTime.plusYears(-1);
        System.out.println(newLocalDateTime);
        // public LocalDateTime plusMonths(long months) 添加或者减去月
        // public LocalDateTime plusDays(long days) 添加或者减去日
        // public LocalDateTime plusHours(long hours) 添加或者减去时
        // public LocalDateTime plusMinutes(long minutes) 添加或者减去分
        // public LocalDateTime plusSeconds(long seconds) 添加或者减去秒
        // public LocalDateTime plusWeeks(long weeks) 添加或者减去周
    }

}
