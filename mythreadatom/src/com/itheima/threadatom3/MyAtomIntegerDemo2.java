package com.itheima.threadatom3;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomIntegerDemo2 {
//    int get():  获取值
//    int getAndIncrement():  以原子方式将当前值加1，注意，这里返回的是自增前的值。
//    int incrementAndGet():  以原子方式将当前值加1，注意，这里返回的是自增后的值。
//    int addAndGet(int data):  以原子方式将输入的数值与实例中的值（AtomicInteger里的value）相加，并返回结果。
//    int getAndSet(int value):  以原子方式设置为newValue的值，并返回旧值。

    public static void main(String[] args) {
        AtomicInteger ac1 = new AtomicInteger(10);
        System.out.println(ac1.get());
        System.out.println("+++++++++++++++++++++");


        AtomicInteger ac2 = new AtomicInteger(10);
        int andIncrement = ac2.getAndIncrement();
        System.out.println(andIncrement);
        System.out.println(ac2.get());
        System.out.println("+++++++++++++++++++++");

        AtomicInteger ac3 = new AtomicInteger(10);
        int i = ac3.incrementAndGet();
        System.out.println(i);
        System.out.println(ac3.get());
        System.out.println("+++++++++++++++++++++");

        AtomicInteger ac4 = new AtomicInteger(10);
        int i1 = ac4.addAndGet(20);
        System.out.println(i1);
        System.out.println(ac4.get());
        System.out.println("+++++++++++++++++++++");

        AtomicInteger ac5 = new AtomicInteger(10);
        int i2 = ac5.getAndSet(20);
        System.out.println(i2);
        System.out.println(ac5.get());


    }
}
