package com.itheima.threadpool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Time;
import java.util.concurrent.*;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,// 核心线程数量
                10,// 线程池的总数量
                60, // 临时线程空闲时间
                TimeUnit.SECONDS,// 临时线程空闲时间的单位
                new ArrayBlockingQueue<>(5), // 阻塞队列
                Executors.defaultThreadFactory(), // 创建线程的方式
                new ThreadPoolExecutor.AbortPolicy() // 任务拒绝策略
        );

        while (true) {
            Socket accept = ss.accept();
            ThreadSocket ts = new ThreadSocket(accept);
            // new Thread(ts).start();
            pool.submit(ts);

            System.out.println("再来一次！");
        }
        // ss.close();
    }
}
