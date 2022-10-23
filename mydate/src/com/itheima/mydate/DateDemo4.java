package com.itheima.mydate;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        String s = "2099-10-20";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(s);
        System.out.println(date);
    }

}
