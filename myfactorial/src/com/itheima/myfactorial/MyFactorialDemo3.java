package com.itheima.myfactorial;

public class MyFactorialDemo3 {

    public static void main(String[] args) {
        int res = get_factorial(5);
        System.out.println(res);
    }

    private static int get_factorial(int i) {
        // 1、一定要找到程序的出口
        if (i == 1) {
            return 1;
        }
        // 可以用debug调试流程，查看执行过程！
        int a = get_factorial(i-1);
//        System.out.println(a);
//        System.out.println(Integer.toString(i) + "*" + get_factorial(i-1));
//        System.out.println(i * get_factorial(i-1));
        // 2、递归的规则
        return i * get_factorial(i-1);
    }
}
