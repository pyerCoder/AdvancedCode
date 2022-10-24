package com.itheima.mycollectiondemo1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollectionDemo8 extends Student {


    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("小皮同学",23);
        Student s2 = new Student("小路同学",31);
        Student s3 = new Student("小贾同学",33);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("迭代器遍历方式如下：");
        // 迭代器的方式进行遍历
        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("################################");

        System.out.println("增强for遍历方式如下：");
        // 增强for的方式进行遍历
        for (Student student : list) {
            System.out.println(student);
        }

    }

}
