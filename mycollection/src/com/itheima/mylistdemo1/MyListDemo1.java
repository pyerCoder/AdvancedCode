package com.itheima.mylistdemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
            System.out.println("####################");
        }


        for (String s : list) {
            System.out.println(s);
        }
    }


}
