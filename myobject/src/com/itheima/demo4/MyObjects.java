package com.itheima.demo4;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.Objects;

public class MyObjects {
    /*
        public static String toString(对象) 返回参数中对象的字符串表示形式。
        public static String toString(对象, 默认字符串) 返回对象的字符串表示形式。
        public static Boolean isNull(对象) 判断对象是否为空
        public static Boolean nonNull(对象) 判断对象是否不为空

     */

    public static void main(String[] args) {
        Student s = new Student("小罗同学", 50);
        // public static String toString(对象) 返回参数中对象的字符串表示形式。
        String s1 = Objects.toString(s);
        System.out.println(s1);
        System.out.println(s);

        // public static String toString(对象, 默认字符串) 返回对象的字符串表示形式。如果对象为空，那么返回第二个参数
        Student ss = null;
        String s2 = Objects.toString(ss, "随便写一个");
        System.out.println(s2);

        // public static Boolean isNull(对象) 判断对象是否为空
//        Student sss = null;
        Student sss = new Student();
        boolean aNull = Objects.isNull(sss);
        System.out.println(aNull);

        // public static Boolean nonNull(对象) 判断对象是否不为空
        Student ssss = null;
        boolean nonNull = Objects.nonNull(ssss);
        System.out.println(nonNull);


    }




}
