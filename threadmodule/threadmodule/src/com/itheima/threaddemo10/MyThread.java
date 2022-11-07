package com.itheima.threaddemo10;

public class MyThread extends Thread {
    private static int ticketCount = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (this) { // 就是当前的线程对象
            synchronized (obj) { // 就是当前的线程对象
                if (ticketCount <= 0) {
                    // 卖完了
                    break;
                } else {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩下" + ticketCount + "张票");
                }

            }
        }
    }
}
