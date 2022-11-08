package com.itheima.threaddemo16;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        // 阻塞队列的基本用法

        // 创建阻塞队列的对象，容量为1
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);


        // 存储元素
        arrayBlockingQueue.put("汉堡包");

        // 取元素
        String take = arrayBlockingQueue.take();
        System.out.println(take);
        String take1 = arrayBlockingQueue.take();
    }
}
