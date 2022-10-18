package com.itheima.test1;

public class Zi extends Fu {
    // 同一个包下，被子类访问
    public void show(){
        super.show();
        System.out.println("子类 .... show 方法");
    }
}
