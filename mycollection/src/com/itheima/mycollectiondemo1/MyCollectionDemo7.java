package com.itheima.mycollectiondemo1;

import java.util.ArrayList;

public class MyCollectionDemo7 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        // 增强 for 使用Demo
        // 在增强 for 中修改第三方变量，不会影响到被循环的列表或数组的自身元素值
        for (String s : list) {
            s = "q";
            System.out.println(s);
        }
        // 快捷生成增强 for 的方式
        // list.for + enter

        System.out.println(list); // [a,b,c,d]

    }

}
