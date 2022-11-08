package com.itheima.threaddemo17;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        // 创建一个阻塞队列，容量为1
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<>(100);

        // 创建线程并开启

        Cooker c = new Cooker(list);
        Foodie f = new Foodie(list);

        c.start();
        f.start();


    }
}
