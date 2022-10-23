package com.itheima.jdk8date;

import java.time.LocalDateTime;

public class JDK8DateDemo7 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        // public LocalDateTime minusYears (long years) 减去或者添加年
         LocalDateTime newLocalDateTime = localDateTime.minusYears(1L);
         System.out.println(newLocalDateTime);
        // LocalDateTime newLocalDateTime = localDateTime.minusYears(-1);
        // System.out.println(newLocalDateTime);
        // public LocalDateTime minusMonths(long months) 减去或者添加月
        // public LocalDateTime minusDays(long days) 减去或者添加日
        // public LocalDateTime minusHours(long hours) 减去或者添加时
        // public LocalDateTime minusMinutes(long minutes) 减去或者添加分
        // public LocalDateTime minusSeconds(long seconds) 减去或者添加秒
        // public LocalDateTime minusWeeks(long weeks) 减去或者添加周
    }

}
