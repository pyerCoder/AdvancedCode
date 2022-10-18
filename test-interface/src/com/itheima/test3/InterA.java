package com.itheima.test3;

public interface InterA {
    // 定义有方法体的方法，需要有default关键字
    public default void show(){
        System.out.println("我是A接口中的show方法");
    }
}
