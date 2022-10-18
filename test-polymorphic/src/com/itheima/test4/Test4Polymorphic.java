package com.itheima.test4;

public class Test4Polymorphic {
    public static void main(String[] args) {
        // 1、向上转型：父类引用指向子类对象
        Fu f = new Zi();
        f.show();
        // 不能这样调用，多态的弊端：不能调用子类特有的成员
        // f.method(); // 编译时异常

        // 如要调用，有两种方案

        // A：直接创建子类对象
        // B：向下转型

        // 2、向下转型：从父亲类型，转换回子类类型
        Zi z = (Zi) f;
        z.method();

    }
}


class Fu {
    public void show(){
        System.out.println("Fu...show");
    }
}

class Zi extends Fu{
    @Override
    public void show() {
        System.out.println("Zi...show");
    }

    public void method(){
        System.out.println("我是子类特有方法，method");
    }
}