package com.itheima.streamdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 体验Stream流
 * <p>
 * 创建一个集合，存储多个字符串元素
 * "张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"
 * <p>
 * 把集合中所有以"张"开头的元素存储到一个新的集合
 * <p>
 * <p>
 * 把"张"开头的集合中的长度为3的元素存储到一个新的集合
 * 遍历上一步得到的集合
 */
public class MyStream1 {
    public static void main(String[] args) {
        // 集合的批量添加
        ArrayList<String> list1 = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));
        // list.add()
        System.out.println(list1);
        System.out.println("+++++++++++++++++++++++++++");

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }
        System.out.println(list2);
        System.out.println("+++++++++++++++++++++++++++");

        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if(s.length()==3){
                list3.add(s);
            }
        }

        System.out.println(list3);
        System.out.println("+++++++++++++++++++++++++++");

        for (String s : list3) {
            System.out.println(s);
        }

        System.out.println("+++++++++++++++++++++++++++");


        // Stream流【超级简洁明了】
        list1.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s-> System.out.println(s));


    }
}
