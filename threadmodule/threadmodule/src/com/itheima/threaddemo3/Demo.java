package com.itheima.threaddemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();

        // Thread t1 = new Thread(mc);

        // 可以获取线程执行完毕之后的结果，也可以作为参数传递给Thread对象
        FutureTask<String> ft = new FutureTask<>(mc);

        // 创建线程对象
        Thread t1 = new Thread(ft);

         String s = ft.get();
        // 开启线程
        t1.start();

        // String s = ft.get();
        System.out.println(s);

    }
}
