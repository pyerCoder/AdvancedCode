package com.itheima.test2;

public interface Inter {
    // 接口中的成员变量，就算没有写final关键字，系统默认也是有加final关键字的
    // 接口中的成员变量，就算没有写static关键字，系统默认也是有加static关键字的
    // 接口中的成员变量，就算没有写public关键字，系统默认也是有加public关键字的
    int NUM = 10;
//    public static final int NUM = 10; 【默认有加的】
    public abstract void show();

}
