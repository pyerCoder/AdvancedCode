package com.itheima.mylistdemo1;

import java.util.LinkedList;

public class MyLinkedListDemo4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        System.out.println("-----------------------");
        method1(list);
        method2(list);
        method3(list);
        method4(list);
        method5(list);
        method6(list);
    }

    private static void method6(LinkedList<String> list) {
        // public E removeLast () 从此列表中删除并返回最后一个元素
        String last = list.removeLast();
        System.out.println(last);
        System.out.println(list);
        System.out.println("-----------------------");
    }

    private static void method5(LinkedList<String> list) {
        // public E removeFirst () 从此列表中删除并返回第一个元素
        String first = list.removeFirst();
        System.out.println(first);
        System.out.println(list);
        System.out.println("-----------------------");
    }

    private static void method4(LinkedList<String> list) {
        // public E getLast () 返回此列表中的最后一个元素
        String s = list.getLast();
        System.out.println(s);
        System.out.println("-----------------------");
    }

    private static void method3(LinkedList<String> list) {
        // public E getFirst () 返回此列表中的第一个元素
        String s = list.getFirst();
        System.out.println(s);
        System.out.println("-----------------------");
    }

    private static void method2(LinkedList<String> list) {
        // public void addLast (E e) 将指定的元素追加到此列表的末尾
        list.addLast("www");
        System.out.println(list);
        System.out.println("-----------------------");
    }

    private static void method1(LinkedList<String> list) {
        // public void addFirst (E e) 在该列表开头插入指定的元素
        list.addFirst("qqq");
        System.out.println(list);
        System.out.println("-----------------------");
    }
}
