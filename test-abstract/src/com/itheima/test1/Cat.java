package com.itheima.test1;

public class Cat extends Animal {
//    4、让 Cat 和 Dog 分别继承 Animal ，重写eat方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
