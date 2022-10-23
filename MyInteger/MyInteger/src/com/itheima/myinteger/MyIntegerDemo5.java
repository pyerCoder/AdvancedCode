package com.itheima.myinteger;

public class MyIntegerDemo5 {
    // 需求：有一个字符串：“91 27 46 38 50”，把其中的每一个数存到int类型的数组中
    // 步骤：
    // 定义一个字符串
    // 把字符串中的数字数据存储到一个int类型的数组中
    // 遍历数组输出结果

    public static void main(String[] args) {
        // 定义一个字符串
        String str = "91 27 46 38 50";

        // 获取字符串中的每一个数字
        String[] split = str.split(" ");
        System.out.println(split);

        // 创建一个int类型的数组
        int [] int_arr = new int[split.length];

        // 将split中的数据进行类型转换并存入到int数组中
        for (int i = 0; i < split.length; i++) {
             int_arr[i] = Integer.parseInt(split[i]);
        }
        System.out.println(int_arr);

        // 遍历int类型的数组
        for (int i = 0; i < int_arr.length; i++) {
            System.out.println(int_arr[i]);
        }

    }
}
