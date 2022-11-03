package com.itheima.variableparameter;

public class MyVariableParameter1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int sum1 = getSum(a, b);
        System.out.println(sum1);

        System.out.println("+++++++++++++");

        int sum2 = getSum(a, b, c);
        System.out.println(sum2);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}
