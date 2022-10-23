package com.itheima.exce;

import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionDemo4 {
    // 定义一个方法，用来遍历数组
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int [] arr = null;
        printArr(arr);


    }

    private static void printArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        if(arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}