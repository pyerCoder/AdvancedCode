package com.itheima.test5;

public class Zi extends Fu {
    public void show(){
//        super.show();
        System.out.println("子类show方法");
    }
    public void method(){
        show();
        super.show();
    }
}
