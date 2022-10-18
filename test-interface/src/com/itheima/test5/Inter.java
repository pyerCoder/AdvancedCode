package com.itheima.test5;

public interface Inter {
    public default void start() {
        System.out.println("start方法执行了...");
        // System.out.println("日志记录（模拟）");

        log();
    }

    public default void end() {
        System.out.println("end方法执行了...");
        // System.out.println("日志记录（模拟）");

        log();
    }

    private void log() {
        System.out.println("日志记录（模拟）");
    }

    public static void open() {
        check();
//        System.out.println("权限校验（模拟）");
        System.out.println("open方法执行了");
    }

    public static void close() {
        check();
//        System.out.println("权限校验（模拟）");
        System.out.println("close方法执行了");
    }

    private static void check() {
        System.out.println("权限校验（模拟）");
    }
}
