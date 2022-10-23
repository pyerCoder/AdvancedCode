package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollectionDemo3 {


    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        // 1、获得迭代器的对象
        // 迭代器对象一旦被创建出来，默认指向集合的0索引处
        Iterator<String> iterator = list.iterator();

        // 利用迭代器里面的方法进行遍历
        // 当前位置是否有元素可以被取出
        System.out.println(iterator.hasNext());
        // 取出当前位置的元素 + 将迭代器往后移动一个索引的位置
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        if(iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }

        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

    }

}
