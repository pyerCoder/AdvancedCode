package com.itheima.test3;

public class Test3Innerclass {
    /*
        私有的成员内部类
     */
    public static void main(String[] args) {
//        Outer.Inner oi = new Outer().new Inner(); // 错误的创建方式
        // 外部类名.内部类名 对象名 = new 外部类名.内部类名();
        Outer.Inner oi = new Outer.Inner();
        oi.show();
        oi.method();
        Outer.Inner.method();

    }

}

class Outer{
    static class Inner {
        public  void show(){
            System.out.println("inner..show");
        }
        public static void method(){
            System.out.println("inner...method");
        }
    }
}