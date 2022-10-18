package com.itheima.test1;

// 此种方式不建议，没有意义，还得新建子类去实现该抽象类
// 接口的子类（实现类）
    // 要么重写接口中的所有抽象方法
    // 要么是抽象类
//public abstract class InterImpl implements Inter{
//
//}


public class InterImpl implements Inter, InterA {
    @Override
    public void study() {
        System.out.println("我是实现类中的study方法！");
    }

    @Override
    public void print1() {
        System.out.println("我是实现类中的print1方法！");
    }

    @Override
    public void print2() {
        System.out.println("我是实现类中的print2方法！");
    }
}

