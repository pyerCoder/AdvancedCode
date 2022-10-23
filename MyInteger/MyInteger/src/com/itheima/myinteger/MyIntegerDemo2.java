package com.itheima.myinteger;

public class MyIntegerDemo2 {
    public static void main(String[] args) {
        // public Integer(int value) 根据 int 值创建 Integer 对象(过时)
        Integer integer = new Integer(20);
        // public Integer(String s) 根据 String 值创建 Integer 对象(过时)
        Integer integer1 = new Integer("30");
        // public static Integer valueOf (int i) 返回表示指定的 int 值的 Integer 实例
        Integer integer2 = Integer.valueOf(20);
        // public static Integer valueOf (String s) 返回一个保存指定值的 Integer 对象 String
        Integer integer3 = Integer.valueOf("30");


        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);

    }

}
