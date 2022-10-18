package com.itheima.block.local;

public class Test {
    /*
        局部代码块

            位置：方法中定义
            作用：限定变量的生命周期，及早释放，提高内存利用率
     */
    public static void main(String[] args) {
        {
            int a = 10;
            System.out.println(a);
        }
        // 局部变量，已经超出了作用域，无法访问到
        // System.out.println(a);
    }
}
