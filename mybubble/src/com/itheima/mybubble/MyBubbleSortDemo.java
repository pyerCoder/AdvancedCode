package com.itheima.mybubble;

public class MyBubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4, 7, 22, 35, 99, 1002, 321, 8};
        // 1 2 3 4 5
        // 第一轮：
        // 为了将最大值5找出，并将它放到数组的最右边
        // -1 是为了让索引不超出范围
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
