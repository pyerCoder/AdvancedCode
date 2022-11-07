package com.itheima.threaddemo7;

import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo {
    public static void main(String[] args) {
        // 优先级：1 - 10，默认值：5
        MyCallable mc = new MyCallable();
        FutureTask<String> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);
        t1.setName("飞机");
        t1.setPriority(10);
        int priority1 = t1.getPriority();
        System.out.println(priority1); // 默认是5
        t1.start();

        FutureTask<String> ft2 = new FutureTask<>(mc);
        Thread t2 = new Thread(ft2);
        t2.setName("坦克");
        t1.setPriority(1);
        int priority2 = t2.getPriority();
        System.out.println(priority2); // 默认是5
        t2.start();

    }
}
