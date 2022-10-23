package com.itheima.arrsearch;

public class MyBinarySearch {
    public static void main(String[] args) {
        /*
            1，定义两个变量，表示要查找的范围。默认min = 0 ， max = 最大索引
            2，循环查找，但是min <= max
            3，计算出mid的值
            4，判断mid位置的元素是否为要查找的元素，如果是直接返回对应索引
            5，如果要查找的值在mid的左半边，那么min值不变，max = mid -1.继续下次循环查找
            6，如果要查找的值在mid的右半边，那么max值不变，min = mid + 1.继续下次循环查找
            7，当 min > max 时，表示要查找的元素在数组中不存在，返回-1.
        */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 9;

        // 1、我现在要干嘛？ -- 二分查找
        // 2、我干这件事情需要什么？ -- 数组 元素
        // 3、我干完了，要不要把结果返回调用者 -- 把索引返回给调用者
        int res = binarySearchForIndex(number,arr);
        System.out.println(res);
    }

    private static int binarySearchForIndex(int num, int[] arr) {
        // 定义查找范围
        int MIN = 0;
        int MAX = arr.length - 1;
//        int mid = (MIN + MAX) / 2;
//        System.out.println(mid);

        // 循环查找 MIN <= MAX
        while (MIN <= MAX) {
            // int mid = (MIN + MAX) / 2;
            // 等价于上面那行
            int mid = (MIN + MAX) >> 1;
            if (arr[mid] < num) {
                MIN = mid + 1;
            } else if (arr[mid] > num) {
                MAX = mid - 1;

            } else {
                System.out.println(mid);
                return mid;

            }
//            System.out.println(MIN);
//            System.out.println(MAX);
//            System.out.println(mid);
        }
        // 如果min大于了max就表示元素不存在，返回-1
        return -1;
    }


}
