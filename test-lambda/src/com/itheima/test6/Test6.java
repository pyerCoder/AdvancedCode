package com.itheima.test6;

public class Test6 {
    public static void main(String[] args) {

    }

    public static void useInter(Inter i) {
        double result = i.method(12.3,22.3);
        System.out.println(result);

    }
}

interface Inter{
    // 用于计算 a + b 的结果返回
    double method(double a,double b);
}
