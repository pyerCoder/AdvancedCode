package com.itheima.convertedio;

import java.io.*;
import java.util.ArrayList;

public class ConvertedDemo7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("杜子腾",16);
        Student s2 = new Student("张三",23);
        Student s3 = new Student("李四",24);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("otheriomodule/a.txt"));
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 我们往本地文件中写的就是一个集合
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("otheriomodule/a.txt"));

        Object o = ois.readObject();
        ArrayList<Student> list2 = (ArrayList<Student>) o;
        for (Student student : list2) {
            System.out.println(student);
            
        }

        ois.close();
    }
}