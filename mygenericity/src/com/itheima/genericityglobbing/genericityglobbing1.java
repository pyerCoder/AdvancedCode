package com.itheima.genericityglobbing;

import java.util.ArrayList;


public class genericityglobbing1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();
        ArrayList<Number> list4 = new ArrayList<>();

        printList(list1);
        printList(list2);
        method1(list1);
        method1(list4);
        // method1(list3); // 注意范围
        method2(list3);
        // method2(list1); // 注意范围
    }
    // 表示传递进来集合的类型，可以是Number类型，也可以是Number所有的子类类型
    private static void method1(ArrayList<? extends Number> list) {}

    // 表示传递进来集合的类型，可以是Number类型，也可以是Number所有的父类类型
    private static void method2(ArrayList<? super  Number> list) {}
    private static void printList(ArrayList<?> list) {

    }
}
