package com.itheima.myarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArraysDemo {

    public static void main(String[] args) {
        // public static String toString (int[] a) 返回指定数组的内容的字符串表示形式
        int[] arr = {3, 2, 4, 6, 7};
        Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
        // public static void sort (int[] a) 按照数字顺序排列指定的数组
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // public static int binarySearch (int[] a, int key) 利用二分查找返回指定元素的索引
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(arr1, 0);
        System.out.println(index);
        // 1、数组必须有序
        // 2、如果要查找的元素存在，那么返回的是这个元素的实际的索引
        // 3、如果要查找的元素不存在，那么返回的是（-插入点 - 1）
            // 插入点：如果这个元素在数组中，它应该在哪个索引上？
    }
}
