package com.itheima.test4;


public class Zi extends Fu {
    // 子父类当中，出现了重名的成员
    int a = 20;

    public void method() {
        int a = 30;
        System.out.println(a); // 20，30 就近原则
//        需求1：在控制台打印本类成员变量 20
        System.out.println(this.a);
//        需求2：在控制台打印父类成员变量 10
        System.out.println(super.a);
    }
}
