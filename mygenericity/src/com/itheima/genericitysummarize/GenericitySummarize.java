package com.itheima.genericitysummarize;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericitySummarize {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(123);

        Iterator it = list.iterator();
        while(it.hasNext()){
            Object next = it.next();
            // String next = (String )it.next();
            // int len = next.length(); // obj 无length方法，需要强转
            System.out.println(next);
        }
    }
}
