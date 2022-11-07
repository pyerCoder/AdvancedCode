package com.itheima.threaddemo4;

import com.itheima.threaddemo3.MyCallable;

public class MyThread extends Thread {

    public MyThread() {
        super();

    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@@@" + i);
        }
    }

}
