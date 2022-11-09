package com.itheima.threadatom2;

public class MyAtomThread implements Runnable{
    private  volatile int  count = 0; // 送冰激淋的数量
    private Object lock = new Object();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 1、从共享数据中读取数据到本线程栈中。
            // 2、修改本线程栈中变量副本的值
            // 3、会把本线程栈中变量副本的值赋值给共享数据

            synchronized (lock) {
                count++; // count++ 不是一个原子性操作，也就是说他在执行的过程中，有可能被其他线程打断操作

                System.out.println("已经送了" + count + "个冰激淋");
            }

        }

    }
}
