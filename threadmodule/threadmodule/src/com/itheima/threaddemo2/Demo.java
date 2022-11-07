package com.itheima.threaddemo2;

public class Demo {
    public static void main(String[] args) {
        // 创建了一个参数的对象
        MyRunable mr = new MyRunable();
        MyRunable mr2 = new MyRunable();
        // 创建了一个线程对象，并把参数传递给这个线程
        // 在线程启动之后，执行的就是参数里面的run方法
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr2);
        // 开启线程
        t1.start();
        t2.start();
    }
}
