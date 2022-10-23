package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectionDemo5 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if("b".equals(s)){
                // 指向谁，就删除谁
                it.remove();
            }
        }

        System.out.println(list);

    }

}
