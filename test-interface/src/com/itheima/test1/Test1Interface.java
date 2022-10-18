package com.itheima.test1;

public class Test1Interface {
    /*
        接口的定义格式：
            public interface 接口名 {}

        类实现接口的格式：
            public class 类名 implements 接口名 {}
     */
    public static void main(String[] args) {
//        Inter i = new Inter(); // 接口是不允许创建实例对象的
        InterImpl ii = new InterImpl();
        ii.study();
        ii.print1();
        ii.print2();
        }

    }
