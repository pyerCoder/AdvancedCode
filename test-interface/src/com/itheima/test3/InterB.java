package com.itheima.test3;

public interface InterB {
    public default void show(){
        System.out.println("我是B接口中的show方法");
    }
}
