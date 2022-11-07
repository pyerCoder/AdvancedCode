package com.itheima.threaddemo4;

import com.itheima.threaddemo3.MyCallable;

public class Demo {
    // 1、线程是有默认名字的，格式：Thread-编号
    public static void main(String[] args) {
        MyThread t1 = new MyThread("小菜");
        MyThread t2 = new MyThread("小强");

//        t1.setName("小菜");
//        t2.setName("小强");


        t1.start();
        t2.start();
    }
}
