package com.itheima.test3;

import com.itheima.test2.Inter;

public class TestInterface {
    public static void main(String[] args) {
        InterAImpl interA = new InterAImpl();
        interA.show();
    }
}

class InterAImpl implements InterA,InterB {
    @Override
    public void show() {
        System.out.println("我是重写后的show方法");
    }
}
