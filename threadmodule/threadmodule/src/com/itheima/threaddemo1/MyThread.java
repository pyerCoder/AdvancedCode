package com.itheima.threaddemo1;

public class MyThread extends Thread{
    @Override
    public void run() {
        // super.run();
        // 代码就是线程在开启之后执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开启了" + i);
        }
    }
}
