package com.itheima.threaddemo17;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class Foodie extends Thread {
    private ArrayBlockingQueue<String> list;

    public Foodie(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        String take = null;
        while (true) {
            try {
                take = list.take();
                System.out.println("吃货从队列中获取了" + take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
