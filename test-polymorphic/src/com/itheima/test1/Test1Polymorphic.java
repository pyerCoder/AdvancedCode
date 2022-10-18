package com.itheima.test1;

public class Test1Polymorphic {
    /*
         多态的前提：

                1、要有（继承 \ 实现）关系
                2、要有方法重写
                3、要有父类引用，指向子类对象
     */

    public static void main(String[] args) {
        // 3、要有父类引用，指向子类对象
        // 当前事物，是一只猫
        Cat cat = new Cat();
        // 当前事物，是一只动物
        Animal a = new Cat();

    }
}


class Animal {
    public void eat(){
        System.out.println("动物吃饭");
    }
}
// 1、要有（继承 \ 实现）关系
class Cat extends Animal{
    // 2、要有方法重写
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}