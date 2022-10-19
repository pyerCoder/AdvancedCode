package com.itheima.demo1;

public class SystemDemo {
    public static void main(String[] args) {
        // public static void exit (int status) 终止当前运行的 Java 虚拟机，非零表示异常终止
//        System.out.println(111);
//        System.exit(20);
//        System.exit(0);
//        System.out.println(222);
//        for (int j = 0; j < 10; j++) {
//            // public static long currentTimeMillis () 返回当前时间(以毫秒为单位)
//            long start = System.currentTimeMillis();
//            System.out.println(start);
//
//            for (int i = 0; i < 10000; i++) {
//                System.out.print(">");
//            }
//            System.out.println();
//            long end = System.currentTimeMillis();
//            long bt = end - start;
//            System.out.println("循环总共消耗：" + bt + "ms！");
//        }

        // arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数) 数组copy
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[10];
        // 需求：我要把arr1中的数据拷贝到arr2中
        System.arraycopy(arr1, 0, arr2, 0, 3);
//        System.out.println(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        // 需求：我要将arr1的最后两个元素，拷贝到arr2的最后两个索引上
        System.arraycopy(arr1,arr1.length-2,arr2,arr2.length-2,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
