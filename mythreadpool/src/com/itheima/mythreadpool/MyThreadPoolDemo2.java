package com.itheima.mythreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// static ExecutorService newFixedThreadPool(int nThreads)
// 创建一个指定最多线程数量的线程池
public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        // 参数不是初始值而是最大值
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor pool = (ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize());
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });
        System.out.println(pool.getPoolSize());

        executorService.shutdown();
    }
}
