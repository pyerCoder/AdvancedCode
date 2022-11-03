package com.itheima.variableparameter;

/**
 * 需求：定义一个方法求N个数的和
 * 可变参数实现
 */

public class MyVariableParameter3 {
    public static void main(String[] args) {
        int [] arr = {3, 3, 3, 3, 3};
        System.out.println(arr);
        int sum = getSum(1, 2, 3, 4, 5);
        System.out.println(sum);

    }

    public static int getSum(int number,int... a) {
        // System.out.println(a);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        return sum;

    }
}
