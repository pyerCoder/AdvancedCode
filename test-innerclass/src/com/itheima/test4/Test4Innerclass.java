package com.itheima.test4;

public class Test4Innerclass {
    /*
        局部内部类：

            编写位置：方法中
            访问方式：
     */
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}

class Outer{

    int a = 10;

    public void method(){
        int b = 20;

        class Inner{
            public void show(){
                System.out.println("show...");
                System.out.println(a);
                System.out.println(b);
            }
        }

        Inner i = new Inner();
        i.show();
    }
}
