package com.itheima.test1;

//1、猫类和狗类中存在共性内容，应向上抽取出一个动物类（Animal）
//3、抽象方法需要存活在抽象类中，将Animal定义为抽象类
public abstract class Animal {
    //2、父类Animal中，无法将 eat 方法具体实现描述清楚，所以定义为抽象方法
    public abstract void eat();

    public void drink() {
        System.out.println("喝水！");
    }
}
