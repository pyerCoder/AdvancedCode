package com.itheima.mycollectiondemo1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyCollectionDemo2 {


    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        // boolean add(E e) 向集合中添加元素
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        System.out.println(collection);
        System.out.println("######################");
        method1(collection);
        method2(collection);
        method3(collection);
        method4(collection);
        method5(collection);
        method6(collection);
    }

    private static void method6(Collection<String> collection) {
        // int size() 获取集合的长度
        int result = collection.size();
        System.out.println(result);
        System.out.println("######################");
    }

    private static void method5(Collection<String> collection) {
        // boolean isEmpty() 判断集合是否为空
        boolean result = collection.isEmpty();
        System.out.println(result);
        System.out.println("######################");
    }

    private static void method4(Collection<String> collection) {
        // boolean contains(E e) 判断集合中是否包含指定的元素
        boolean result = collection.contains("a");
        boolean result1 = collection.contains("aaa");
        System.out.println(result);
        System.out.println(result1);
        System.out.println("######################");
    }

    private static void method3(Collection<String> collection) {
        // void clear () 清空集合所有的元素
        // 就是将集合中所有元素全部删除
        collection.clear();
        System.out.println(collection);
        System.out.println("######################");
    }

    private static void method2(Collection<String> collection) {
        // boolean removeIf(Object o) 根据条件进行删除
        // removeif 底层会遍历集合，得到集合中的每一个元素
        // s依次表示集合中的每一个元素
        // 就会把这每一个元素都到lambda表达式中去判断一下
        // 如果返回的是true，则删除
        // 如果返回的是false，则保留不删除
        // boolean test(T t);
        collection.removeIf(
                (String s) -> {
                    return s.length() == 3;
                }
        );
        System.out.println(collection);
        System.out.println("######################");
    }

    private static void method1(Collection<String> collection) {
        // boolean remove(E e) 将元素从集合中删除
        // 如果删除成功了，则返回true
        // 如果删除失败了，则返回false
        boolean result1 = collection.remove("aaa"); // true
        boolean result2 = collection.remove("ddd"); // false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(collection);
        System.out.println("######################");
    }

}
