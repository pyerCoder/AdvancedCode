package com.itheima.streamdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream流的收集方法
 * 练习：
 * 定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
 * 将集合中的奇数删除，只保留偶数。
 * 遍历集合得到2,4,6,8,10
 */

public class MyStream6 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        // lambda 表达式
//        list.stream().filter((s)->{
//            return s % 2 == 0;
//        });

        // lambda 表达式简化版
        list.stream().filter(number -> number % 2 == 0).forEach(number -> System.out.println(number));
        System.out.println("++++++++++++++++++++");
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
