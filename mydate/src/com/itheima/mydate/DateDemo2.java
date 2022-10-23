package com.itheima.mydate;


import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        getDate();
        setDate();

    }

    private static void setDate() {
        // public void setTime(long time)  设置时间，传递毫秒值
        Date date = new Date();
        date.setTime(3600L * 1000);
        
        long time1 = date.getTime();
        System.out.println(time1);
    }

    private static void getDate() {
        // public long getTime()  获取时间对象的毫秒值
        // 将当前时间封装成一个date对象
        Date date = new Date();
        // 获取这个date对象的毫秒值 --- 获取当前时间的毫秒值
        long time = date.getTime();
        System.out.println(time);

        long time2 = System.currentTimeMillis();
        System.out.println(time2);
    }


}
